package br.com.car04deletar.aListaRecyclerview;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import br.com.car04deletar.R;
import br.com.car04deletar.bCarrinho.CarrinhoSingleton;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ListaHolder> {
    //Variáveis (Vindas Da Classe View)
    private Context                 contexto;                       //Contexto, Activity, this (Toast, Etc)
    private ArrayList<ProdutoModel> produtoListaValoresAdapter;     //Recebe Valores da Lista (Não a Lista)

    //Construtor
    public ProdutoAdapter(Context contexto, ArrayList<ProdutoModel> produtoListaValoresAdapter) {
        this.contexto = contexto;
        this.produtoListaValoresAdapter = produtoListaValoresAdapter;
    }

    //Método Recycle - Layout Linha Xml
    @NonNull @Override public ListaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.produto_linha, viewGroup, false);
        ListaHolder viewHolder = new ListaHolder(view);
        return viewHolder;
    }

    //Método Recycle -  Ação nos Objetos (colocar o final ou declarar como variável de classe)
    @Override public void onBindViewHolder(@NonNull final ListaHolder listaHolder, final int i) {
        //Exibir Valores
        final ProdutoModel produtoModelAtual = produtoListaValoresAdapter.get(i);
        listaHolder.nomeProduto.setText(produtoModelAtual.getProdNome());
        listaHolder.precoProduto.setText(String.valueOf(produtoModelAtual.getProdPreco()));
        listaHolder.qtProduto.setText(String.valueOf(produtoModelAtual.getProdQuant()));

        //Ação Na Linha (Linha ou Itens da Linha)
        listaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Toast.makeText(contexto, produtoListaValoresAdapter.get(i).getProdNome(), Toast.LENGTH_SHORT).show();
        }});

       //Ação No Objeto (Botão Addicionar)
       listaHolder.botaoAdd.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                ProdutoModel produtoModel = new ProdutoModel();
                produtoModel.setProdNome(produtoListaValoresAdapter.get(i).getProdNome());
                produtoModel.setProdPreco(produtoListaValoresAdapter.get(i).getProdPreco());
                produtoModel.setProdQuant(produtoListaValoresAdapter.get(i).getProdQuant());

                CarrinhoSingleton.addItem(produtoModel);
       }});
    }

    //Método Recycle - Tamanho da Lista
    @Override public int getItemCount() {
        return produtoListaValoresAdapter.size();
    }

    //Classe Holder
    public static class ListaHolder extends RecyclerView.ViewHolder{
        //Objetos da Tela - Declarar
        public TextView nomeProduto, precoProduto, qtProduto;
        public Button   botaoAdd;

        //Objetos da Tela - Identificar (Construtor Desta Classe Vazio e Depois Identificar os Objetos)
        public ListaHolder(@NonNull View itemView) {
            super(itemView);
            nomeProduto  =  (TextView) itemView.findViewById(R.id.produtoNomeXml);
            precoProduto =  (TextView) itemView.findViewById(R.id.produtoPrecoXml);
            qtProduto    =  (TextView) itemView.findViewById(R.id.produtoQuantidadeXml);
            botaoAdd     =   itemView.findViewById(R.id.produtoBtnAddXml);
        }
    }
}




//01.Fazer a Lista Recyclerview;
//*02.colocar o botão add (inner class holder)
//03.ação no botão add (onBindView Holder)





//OnBindViewHolder - Verificar se veio todos os da produto_lista (pois só aparece 1 (o da posição 0)).      Esta vindo todos da produto_lista !!!
// Log.d("myLog", produtoListaValoresAdapter.get(0).getNome().toString());
//         Log.d("myLog", produtoListaValoresAdapter.get(1).getNome().toString());
//         Log.d("myLog", produtoListaValoresAdapter.get(2).getNome().toString());





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
