package br.com.car04deletar.aListaRecyclerview;

public class ProdutoModel {
    //Variáveis
    private String prodNome;
    private double prodPreco;
    private int    prodQuant;

    //Construtor Vazio (Firebase, Etc)
    public ProdutoModel() {
    }

    //Construtor Completo
    public ProdutoModel(String prodNome, double prodPreco, int prodQuant) {
        this.prodNome = prodNome;
        this.prodPreco = prodPreco;
        this.prodQuant = prodQuant;
    }

    //GetterSetter (Alt + Insert)
    public String getProdNome() {
        return prodNome;
    }
    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }
    public double getProdPreco() {
        return prodPreco;
    }
    public void setProdPreco(double prodPreco) {
        this.prodPreco = prodPreco;
    }
    public int getProdQuant() {
        return prodQuant;
    }
    public void setProdQuant(int prodQuant) {
        this.prodQuant = prodQuant;
    }
}
