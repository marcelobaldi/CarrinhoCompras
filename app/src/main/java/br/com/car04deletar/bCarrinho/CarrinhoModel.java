package br.com.car04deletar.bCarrinho;
import br.com.car04deletar.aListaRecyclerview.ProdutoModel;

public class CarrinhoModel {
    //Variáveis
    private ProdutoModel carrinhoProdutoModel;          //Variáveis do Produto (que vem);
    private int          carrinhoQuantPorItem;          //para não add o produto 2x, só alterar a quantidade;
    private int          carrinhoQuantTotItem;
    private double       carrinhoPrecoTotItem;

    //Construtor Vazio (Firebase, Etc)
    public CarrinhoModel() {
    }

    //Construtor do Produto (Recebe da Etapa Anterior - Produtos)
    public CarrinhoModel(ProdutoModel carrinhoProdutoModel) {
        this.carrinhoProdutoModel = carrinhoProdutoModel;
    }

    //Construtor Completo (Passar Para Etapa Seguinte - Pagamento)
    public CarrinhoModel(ProdutoModel carrinhoProdutoModel, int carrinhoQuantPorItem, int carrinhoQuantTotItem, double carrinhoPrecoTotItem) {
        this.carrinhoProdutoModel = carrinhoProdutoModel;
        this.carrinhoQuantPorItem = carrinhoQuantPorItem;
        this.carrinhoQuantTotItem = carrinhoQuantTotItem;
        this.carrinhoPrecoTotItem = carrinhoPrecoTotItem;
    }

    //GetterSetter
    public ProdutoModel getCarrinhoProdutoModel() {
        return carrinhoProdutoModel;
    }
    public void setCarrinhoProdutoModel(ProdutoModel carrinhoProdutoModel) {
        this.carrinhoProdutoModel = carrinhoProdutoModel;
    }
    public int getCarrinhoQuantPorItem() {
        return carrinhoQuantPorItem;
    }
    public void setCarrinhoQuantPorItem(int carrinhoQuantPorItem) {
        this.carrinhoQuantPorItem = carrinhoQuantPorItem;
    }
    public int getCarrinhoQuantTotItem() {
        return carrinhoQuantTotItem;
    }
    public void setCarrinhoQuantTotItem(int carrinhoQuantTotItem) {
        this.carrinhoQuantTotItem = carrinhoQuantTotItem;
    }
    public double getCarrinhoPrecoTotItem() {
        return carrinhoPrecoTotItem;
    }
    public void setCarrinhoPrecoTotItem(double carrinhoPrecoTotItem) {
        this.carrinhoPrecoTotItem = carrinhoPrecoTotItem;
    }
}

//01.Herdar da Classe Produtos
//*Depois declarar variáveis do próprio carrinho (TotalPreço, TotalQuantidade, Etc);
////////////////////////////////////////////////////////////////////////////////////////////////////
//02.Colocar Variáveis Específicas do Carrinho (quantid. por item, etC);
