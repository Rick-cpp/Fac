package app.util.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

import app.util.core.MainLoop;

public abstract class Navigation implements Page {
    HashMap<String, Consumer<Navigation>> pages = new HashMap<>();
    HashMap<String, Object> argsCurrent = new HashMap<>();
    HashMap<String, Object> argsNext = new HashMap<>();
    ArrayList<Consumer<Navigation>> stack = new ArrayList<>();

    protected final void register(String name, NavigationPage page) {
        if (pages.isEmpty()) stack.add(page::render);
        
        pages.put(name, page::render);   
    }

    public final void navigate(String name) {
        if (!pages.containsKey(name)) MainLoop.error("PageNotFound");
        stack.add(pages.get(name));
        this.argsCurrent = this.argsNext;
        this.argsNext = new HashMap<>();
    }

    public final void setArg(String name, Object value) { argsNext.put(name, value); }
    
    @SuppressWarnings("unchecked")
    public final <T> T getArg(String name) { return (T) argsCurrent.get(name); }

    public final void popBack() {
        if (stack.size() == 1) { quit(); return; }
        stack.removeLast();
        this.argsCurrent = new HashMap<>();
        this.argsNext = new HashMap<>();
    }

    @Override public void render() { stack.getLast().accept(this); }
    
    protected abstract void quit();
    public abstract Navigation onReady();
}
