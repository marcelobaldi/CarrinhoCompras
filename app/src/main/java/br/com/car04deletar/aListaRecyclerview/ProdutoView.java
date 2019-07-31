package br.com.car04deletar.aListaRecyclerview;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import br.com.car04deletar.R;
import br.com.car04deletar.bCarrinho.CarrinhoView;

public class ProdutoView extends AppCompatActivity {
    //Variáveis
    private RecyclerView            listaObjeto;
    private LinearLayoutManager     listaLayout   = new LinearLayoutManager(this);
    private ArrayList<ProdutoModel> listaValores  = new ArrayList<>();

    @Override protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);setContentView(R.layout.produto_lista);
        //Lista - Montar
        listaObjeto = (RecyclerView) findViewById( R.id.produtoListaXml);
        listaObjeto.setLayoutManager( listaLayout );

        //Lista - Valores e Adicionar
        listaValores.add(new ProdutoModel("Mussarela", 20.00, 1));
        listaValores.add(new ProdutoModel("Calabresa", 25.00, 1));
        listaValores.add(new ProdutoModel("Portuguesa", 30.00, 2));

        //Passar Contexto e Valores da Lista + Carregar a Lista
        ProdutoAdapter adpterLista = new ProdutoAdapter(this, listaValores);
        listaObjeto.setAdapter(adpterLista);
    }

    //Ir Para Tela de Carrinho
    public void produtoBtnListaXml (View view){
        startActivity(new Intent(this, CarrinhoView.class));
    }
}

//botão deletar no layout do carrinho
//metodo deletar no carrinho singleton


//    Intent intent = getIntent();
//    finish();
//    startActivity(intent);




//Carrinho Singleton Método Add;
//Carrinho Adapter OnBildViewHolder;
//Total de Itens
//Total Geral do Preço





//01.Lista de Produto (Pacote a - vide Projeto anterior);
////////////////////////////////////////////////////////////////////////////////////////////////////
//02.Criar a Tela Xml do Carrinho (1 Lista Xml e 1 Linha da Lista Xml);
//03.Criar a Classe Model do Carrinho
//04.Criar Classe Singleton do Carrinho
//05.Criar a Classe Java Carrinho Adapter (recebe a lista, e não os valores da lista)
//06.Criar a Classe Java Carrinho View;
//07.Declarar as Activities criadas no Manifest (CarrinhoView)
////////////////////////////////////////////////////////////////////////////////////////////////////
//*08.Colocar a Quantidade e o Botão Add no Xml do Produto (para add no carrinho)
//*09.Colocar a Quantidade no Xml do Carrinho;
//*10.Colocar a Quantidade no Model do Produto;
//*11.Colocar a Quantidade por item do produto e outras variáveis do carinho no model do Carrinho;
//*12.View, passar a quantidade do item no carrinho;
//*13.Classe Singleton Carrinho = se tiver o carrinho (retornar ele), senão (criar um novo);

//14.Classe Singleton Carrinho = Metodo Add no Carrinho
//15.no botão add do produto, conter o método add produto do carrinho singleton (produto adapter);














//Dúvidas
//Não Consigo Fazer o Context com seu construtor e o Array List com seu construtor.         2 Construtores;
//Não Consigo Fazer o Constex com construtor vazio e o Array List com o seu construtor.     2 Construtores;
//Não consigo fazer sem os construtores (o contexto sim, mas o array não.                   Sem Construtor;