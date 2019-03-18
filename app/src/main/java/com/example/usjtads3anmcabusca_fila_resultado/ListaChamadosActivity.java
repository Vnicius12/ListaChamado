package com.example.usjtads3anmcabusca_fila_resultado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> Conseitos OB & Refatoração das Views
import java.util.List;

public class ListaChamadosActivity extends AppCompatActivity {

    private ListView chamadosListView;

    ArrayList<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_chamados);
        chamadosListView = findViewById(R.id.chamadosListView);
        Intent origemIntent = getIntent();
        String nomeFila = origemIntent.getStringExtra("nome_fila");
<<<<<<< HEAD
        final List<String> chamados = busca(nomeFila);
        ArrayAdapter <String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, chamados);
=======
        final List<Chamado> chamados = busca(nomeFila);
        ArrayAdapter <Chamado> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1, chamados);
>>>>>>> Conseitos OB & Refatoração das Views
        chamadosListView.setAdapter(adapter);
        chamadosListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
<<<<<<< HEAD
                String chamadoSelecionado = chamados.get(position);
=======
                Chamado chamadoSelecionado = chamados.get(position);
>>>>>>> Conseitos OB & Refatoração das Views
                //Toast.makeText(ListaChamadosActivity.this, ChamadoSelecionado, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ListaChamadosActivity.this, DetalhesChamadoActivity.class);
                intent.putExtra("chamado_selecionado", chamadoSelecionado);
                startActivity(intent);
            }
        });
    }

<<<<<<< HEAD
    public List<String> busca (String nomeFila){
        List <String> chamados = geraListaChamados();
        if (nomeFila == null || nomeFila.length() == 0 )
            return chamados;
        List<String> resultado = new ArrayList<>();
        for (String chamado : chamados){
            if (chamado.toLowerCase().contains(nomeFila.toLowerCase())){
=======
    public List<Chamado> busca (String nomeFila){
        List<Chamado> chamados = geraListaChamados();
        if (nomeFila == null || nomeFila.length() == 0 )
            return chamados;
        List<Chamado> resultado = new ArrayList<>();
        for (Chamado chamado : chamados){
            if (chamado.getFila().getNome().toLowerCase().
                    contains(nomeFila.toLowerCase())){
>>>>>>> Conseitos OB & Refatoração das Views
                resultado.add(chamado);
            }
        }
        return resultado;
    }

<<<<<<< HEAD



    public ArrayList<String> geraListaChamados(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Desktops: Computador da secretária quebrado.");
        lista.add("Telefonia: Telefone não funciona.");
        lista.add("Redes: Manutenção no proxy.");
        lista.add("Servidores: Lentidão generalizada.");
        lista.add("Novos Projetos: CRM");
        lista.add("Manutenção Sistema ERP: atualizar versão.");
        lista.add("Novos Projetos: Rede MPLS");
        lista.add("Manutenção Sistema de Vendas: incluir pipeline.");
        lista.add("Manutenção Sistema ERP: erro contábil");
        lista.add("Novos Projetos: Gestão de Orçamento");
        lista.add("Novos Projetos: Big Data");
        lista.add("Manoel de Barros");
        lista.add("Redes: Internet com lentidão");
        lista.add("Novos Projetos: Chatbot");
        lista.add("Desktops: troca de senha");
        lista.add("Desktops: falha no Windows");
        lista.add("Novos Projetos: ITIL V3");
        lista.add("Telefonia: liberar celular");
        lista.add("Telefonia: mover ramal");
        lista.add("Redes: ponto com defeito");
        lista.add("Novos Projetos: ferramenta EMM");
        return lista;
    }

=======
    public List<String> geraListaChamados(){
        List<String> lista = new ArrayList<>();
        chamados.add(new Chamado(
                new Fila(
                        "Desktops",
                        R.drawable.ic_computer_black_24dp
                ),
                "Computador da secretária quebrado.",
                new Date(),
                null,
                "Aberto"
        ));
        chamados.add(new Chamado (
                new Fila ("Telefonia",
                        R.drawable.ic_phone_in_talk_black_24dp),
                "Telefone não funciona.",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Redes",
                        R.drawable.ic_network_check_black_24dp),
                "Manutenção no proxy.",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Servidores", R.drawable.ic_poll_black_24dp),
                "Lentidão generalizada.",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Novos Projetos",
                        R.drawable.ic_new_releases_black_24dp),
                "CRM",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Novos Projetos",
                        R.drawable.ic_new_releases_black_24dp),
                "Gestão de Orçamento",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Redes",
                        R.drawable.ic_network_check_black_24dp),
                "Internet com lentidão",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Novos Projetos",
                        R.drawable.ic_new_releases_black_24dp),
                "Chatbot",
                new Date(),
                null,
                "Aberto")
        );
        chamados.add(new Chamado (
                new Fila ("Novos Projetos",
                        R.drawable.ic_new_releases_black_24dp),
                "Chatbot",
                new Date(),
                null,
                "Aberto")
        );
        return chamados;
    }


>>>>>>> Conseitos OB & Refatoração das Views
}
