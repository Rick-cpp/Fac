package app.projects.person;

public class Endereco {
    private String rua;
    private int num;

    public Endereco(String r, int n) {
        this.rua = r;
        this.num = n;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return num;
    }
}
