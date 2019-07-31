package br.com.car04deletar.bCarrinho;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.car04deletar.R;
import br.com.car04deletar.aListaRecyclerview.ProdutoModel;

public class CarrinhoAdapter extends RecyclerView.Adapter<CarrinhoAdapter.ListaHolder> {
    //Variáveis (Vindas Da Classe View)
    private Context             contexto;                       //Contexto, Activity, this (Toast, Etc)
    private List<CarrinhoModel> carrinhoListaValoresAdapter;    //Recebe a Lista (Não os Valores da Lista)

    public CarrinhoAdapter() {
    }

    public List<CarrinhoModel> getCarrinhoListaValoresAdapter() {
        return carrinhoListaValoresAdapter;
    }

    //Construtor
    public CarrinhoAdapter(Context contexto, List<CarrinhoModel> carrinhoListaValoresAdapter) {
        this.contexto = contexto;
        this.carrinhoListaValoresAdapter = carrinhoListaValoresAdapter;
    }

    //Método Recycle - Layout Linha Xml
    @NonNull @Override public ListaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carrinho_linha, viewGroup, false);
        ListaHolder viewHolder = new ListaHolder(view);
        return viewHolder;
    }

    //Método Recycle -  Ação nos Objetos (colocar o final ou declarar como variável de classe)***********************************************
    @Override public void onBindViewHolder(@NonNull final ListaHolder listaHolder, final int i) {
        //Exibir Valores
        listaHolder.nomeProduto.setText(carrinhoListaValoresAdapter.get(i).getCarrinhoProdutoModel().getProdNome());
        listaHolder.quantProduto.setText(String.valueOf(carrinhoListaValoresAdapter.get(i).getCarrinhoQuantPorItem()));
        listaHolder.precoProduto.setText(String.valueOf(carrinhoListaValoresAdapter.get(i).getCarrinhoPrecoTotItem()));

        //Ação Na Linha (Linha ou Itens da Linha)
        listaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
              Toast.makeText(contexto, carrinhoListaValoresAdapter.get(i).getCarrinhoProdutoModel().getProdNome(), Toast.LENGTH_SHORT).show();
        }});

        //Botão Deletar
        listaHolder.btnDeletar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                CarrinhoSingleton.deletarItem(carrinhoListaValoresAdapter.get(i));
                notifyDataSetChanged();   //avisar recylerview que alterou a lista !!!!

              //  CarrinhoView carrinhoView = new CarrinhoView();
               // carrinhoView.refresh();
        }});


    }

    //Método Recycle - Tamanho da Lista
    @Override public int getItemCount() {
        return carrinhoListaValoresAdapter.size();
    }

    //Classe Holder
    public static class ListaHolder extends RecyclerView.ViewHolder{
        //Objetos da Tela - Declarar
        public TextView nomeProduto, precoProduto, quantProduto, qtitens, precototal;
        public Button   btnDeletar;

        //Objetos da Tela - Identificar (Construtor Desta Classe Vazio e Depois Identificar os Objetos)
        public ListaHolder(@NonNull View itemView) { super(itemView);
            nomeProduto  =  (TextView) itemView.findViewById(R.id.carrinhoNomeXml);
            precoProduto =  (TextView) itemView.findViewById(R.id.carrinhoPrecoXml);
            quantProduto =  (TextView) itemView.findViewById(R.id.carrinhoQuantidadeXml);
            qtitens      = itemView.findViewById(R.id.carrinhoqtTotalXml);
            precototal   = itemView.findViewById(R.id.carrinhoprecototalXml);
            btnDeletar   = itemView.findViewById(R.id.carrinhoDeletarXml);
        }
    }




}

//01.Copiar da Classe Produto Adapter (para ganhar tempo);
//02.Trocar a Classe Model (de ProdutoModel por CarrinhoModel)      - Variáveis da Classe;
//03.Trocar os Valores da Lista (Array) pela Lista (List)           - Variáveis da Classe;
//04.Trocar os Valores da Lista (Array) pela Lista (List)           - Construtor da Classe;
//05.Trocar a Tela da Linha XML (de ProdutoLinha por CarrinhoLinha) - onCreateViewHolder;
//06.Refatorar os Códigos (usar a classe model, como intermediário) - onBindViewHolder

//Declarar a quantidade ...




//OnBindViewHolder - Verificar se veio todos os da produto_lista (pois só aparece 1 (o da posição 0)).      Esta vindo todos da produto_lista !!!
// Log.d("myLog", carrinhoListaValoresAdapter.get(0).getNome().toString());
//         Log.d("myLog", carrinhoListaValoresAdapter.get(1).getNome().toString());
//         Log.d("myLog", carrinhoListaValoresAdapter.get(2).getNome().toString());





//- builder partner;
  //      - injeção de dependencias;



///Dúvidas - Classes e Construtores
//Como Fazer Sem o Construtor do Context e ArrayList? (o do contexto eu sei);
//Como Fazer Com o Construtor do Context e o Construtor do ArrayList;
//Como Fazer Com o Construtor Vazio (contexto) e o Construtor do ArrayList;

//Criar a Classe ProdutoAdapter (nós);
//Herdar a Classe RecylcerView.Adapter (java), Que Herda a Classe Holder (nós);
//Implementar os Métodos Obrigatórios da Classe RecyclerView.Adapter;
//Criar a Classe ListaHolder (nós), que Herda a Classe RecyclerView.ViewHolder;

//Classe ProdutoView Holder
//Declarar os Objetos
//Fazer Construtor da Classe Em Branco. pq pede construtor ?!
//Identificar os Objetos no Construtor;

//Criar o Contexto da Actitivity (Comando Toast, Etc);

//Array da Classe Dados;
//Construtor Desta Classe ProdutoAdapter com o Array Criado;
//Construtor Vazio para o contexto;

//Método - Tela dos Itens da Linha;
//Método - Ação nos Itens (só copiei tb).  //colocar final no I!!!!!!
//Método - Tamanho da ProdutoView;


//não entendi os métodos = só copio!!!!!!!

//https://www.youtube.com/watch?v=ovmWgYxOCug&index=5&list=PLk7v1Z2rk4hjHrGKo9GqOtLs1e2bglHHA
