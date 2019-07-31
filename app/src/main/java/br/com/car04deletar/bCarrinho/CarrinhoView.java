package br.com.car04deletar.bCarrinho;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.com.car04deletar.R;

public class CarrinhoView extends AppCompatActivity {
    //Variável
    private RecyclerView          listaObjeto;
    private LinearLayoutManager   listaLayout         = new LinearLayoutManager(this);
    private CarrinhoSingleton     carrinhoSingleton   = CarrinhoSingleton.getInstance();

    @Override protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);setContentView(R.layout.carrinho_lista);
        //Lista - Identificar
        listaObjeto = (RecyclerView) findViewById( R.id.carrinhoListaXml);
        listaObjeto.setLayoutManager(listaLayout);

        double precoTotalCarrinho = 0;
        int qtTotalCarrinho = 0;
        double precoTotalItem = 0;
        for(int ii = 0; ii < carrinhoSingleton.getCarrinhoLista().size(); ii++) {
            qtTotalCarrinho     = carrinhoSingleton.getCarrinhoLista().get(ii).getCarrinhoQuantPorItem() + qtTotalCarrinho;
            precoTotalCarrinho  = carrinhoSingleton.getCarrinhoLista().get(ii).getCarrinhoPrecoTotItem() + precoTotalCarrinho;
        }

        CarrinhoModel carrinhoModel = new CarrinhoModel();
        carrinhoModel.setCarrinhoQuantTotItem(qtTotalCarrinho);
        carrinhoModel.setCarrinhoPrecoTotItem(precoTotalCarrinho);

        TextView qtTotalX = findViewById(R.id.carrinhoqtTotalXml);
        TextView precoTotalX = findViewById(R.id.carrinhoprecototalXml);

        qtTotalX.setText(String.valueOf(qtTotalCarrinho));
        precoTotalX.setText(String.valueOf(precoTotalCarrinho));

        //Lista - Montar
        CarrinhoAdapter adpterCarrinho = new CarrinhoAdapter(this, carrinhoSingleton.getCarrinhoLista());    //passar a listaaaaaaaa
        listaObjeto.setAdapter(adpterCarrinho);                                                                  //e não os valores da lista!!!
    }


    public void refresh(){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}

//view é a lista. adapter é a linha!!!!!!!!!!!!!!!!!!!1


//01.Objeto RecyclerView (Declarar e Identificar);
//02.Objeto LinearLayoutManager (Declarar e Setar);
//03.Declarar e Instanciar a Classe Singleton;
//04.Montar a Lista (passar o contexto e a lista e, setar o recyclerview);








///////////////
//01.Lista de Produto (Pacote a - vide Projeto anterior);
//02.Criar a Classe Model do Carrinho (classe produto model);
//03.Criar a Tela Xml do Carrinho (1 Lista Xml e 1 Linha da Lista Xml);
//04.Criar a Classe Java Carrinho Adapter;












//Dúvidas
//Não Consigo Fazer o Context com seu construtor e o Array List com seu construtor.         2 Construtores;
//Não Consigo Fazer o Constex com construtor vazio e o Array List com o seu construtor.     2 Construtores;
//Não consigo fazer sem os construtores (o contexto sim, mas o array não.                   Sem Construtor;