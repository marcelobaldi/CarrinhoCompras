package br.com.car04deletar.bCarrinho;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import br.com.car04deletar.aListaRecyclerview.ProdutoModel;

public class CarrinhoSingleton {
    //Objeto Carrinho (própria classe declarada e instanciada)
    private static final CarrinhoSingleton carrinhoObjeto = new CarrinhoSingleton();

    //Variáveis
    private static List<CarrinhoModel> carrinhoLista;   //declarar como static, para o método static add funcionar

    //Construtor (Quando Acessar/Instanciar Esta Classe)
    private CarrinhoSingleton() {
        carrinhoLista = new ArrayList<>();
    }

    //Método Que Retorna o Objeto Carrinho (se não tiver cria, senão retorna o que já tem)
    public static CarrinhoSingleton getInstance() {
        if(carrinhoObjeto == null) {
            return new CarrinhoSingleton();
        }else{
            return carrinhoObjeto;
        }
    }

    //Método Para Add Produto no Carrinho (static) para acessar direto ************************************************************************
    public static void addItem (ProdutoModel produto){
        //Se Já Tiver o Produto, Então Só Acrescentar a Quantidade
        for (int i = 0; i < carrinhoLista.size(); i++){
            if(carrinhoLista.get(i).getCarrinhoProdutoModel().getProdNome().equals(produto.getProdNome())) {
        //      carrinhoLista.get(i).getCarrinhoProdutoModel().setProdQuant(carrinhoLista.get(i).getCarrinhoProdutoModel().getProdQuant() + produto.getProdQuant());
              carrinhoLista.get(i).setCarrinhoQuantPorItem(carrinhoLista.get(i).getCarrinhoQuantPorItem() + produto.getProdQuant());
              carrinhoLista.get(i).setCarrinhoPrecoTotItem(produto.getProdPreco() * carrinhoLista.get(i).getCarrinhoQuantPorItem());

              return; //sair do método
            }
        }
        //Se não Achar (acima), Então Adicionar o Produto
        CarrinhoModel carrinhoModel = new CarrinhoModel();
        carrinhoModel.setCarrinhoProdutoModel(produto);
        carrinhoModel.setCarrinhoQuantPorItem(produto.getProdQuant());
        carrinhoModel.setCarrinhoPrecoTotItem(produto.getProdPreco() * produto.getProdQuant());
        carrinhoLista.add(carrinhoModel);
    }

    public static void deletarItem(CarrinhoModel itemCarrinho){
        carrinhoLista.remove(itemCarrinho);
    }



    //GetterSetter da Lista
    public List<CarrinhoModel> getCarrinhoLista() { return carrinhoLista;
    }
    public void setCarrinhoLista(List<CarrinhoModel> carrinhoLista) {
        this.carrinhoLista = carrinhoLista;
    }
}

//01.Cria Automático 3 (Objeto Carrinho, Construtor, Método GetInstance);
//02.Criar a Lista (Declarar Como Variável de Classe, Instanciar no Construtor, GetterSetter)
//*Depois Tratar o Retorno do Carrinho (Criar se Não Tiver ou Carregar se Tiver);

//03. retornar o carrinho ou então um novo carrinho
//04. add objetos no carrinho

//Adicionar o Produto (sem repetir o item, só aumentar a quantidade)
//        for (int i = 0; i < carrinhoLista.size(); i++){
//          if(carrinhoLista.get(i).getCarrinhoProdutoModel().getProdNome().equals(produto.getCarrinhoProdutoModel().getProdNome())) {
//              carrinhoLista.get(i).setCarrinhoQuantPorItem(carrinhoLista.get(i).getCarrinhoQuantPorItem() + produto.getCarrinhoQuantPorItem());
//              return; //sair do método
//          }
//        }
//        carrinhoLista.add(produto);
