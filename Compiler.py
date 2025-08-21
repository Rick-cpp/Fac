from pathlib import Path as _Path
import subprocess as _Process

def glob(relative_path:str) -> list[str]:
    path:_Path = _Path(relative_path).resolve()
    
    if not path.exists(): raise FileNotFoundError(f"Directory not found {path}")
        
    return [f"{p}" for p in path.rglob("*.java")]


def compiler(files:list[str], build:str) -> None:
    _Process.run(f"javac -d {build} " + "".join(f"\"{file}\" " for file in files).strip())    

def run(files: list[str], main: str, build_dir: str) -> None:
    file = [f for f in files if f"{main}.java" in f]
    
    if len(file) != 1: raise FileExistsError(f"There can only be one main.java {file}")

    _Process.run(f'java -cp "./{build_dir}" {file[0].split("src")[1][1:].replace(".java", "").replace("\\", "/")}')


if __name__ == "__main__":
    env = {
        "path": "./src",
        "main": "App",
        "build": "bin"
    }

    files = glob(env["path"])
    compiler(files, env["build"])
    run(files, env["main"], env["build"])