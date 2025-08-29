package app.projects.carro.data;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String nMarca, String nModelo, int nAno) {
        set(nMarca, nModelo, nAno);
    }

    public void set(String nMarca, String nModelo, int nAno) {
        this.marca = nMarca;
        this.modelo = nModelo;
        this.ano = nAno;
    }

    public String[] render() {
        return new String[] {
            "Marca: " + marca,
            "Modelo: " + modelo,
            "Ano: " + Integer.toString(ano)
        };
    }

    public String getMarca() {
        return marca;
    }

    public String getLine() {
        return modelo + "->" + marca;
    }
}
