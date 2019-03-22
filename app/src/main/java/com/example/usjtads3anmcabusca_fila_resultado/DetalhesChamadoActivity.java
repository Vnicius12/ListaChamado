package com.example.usjtads3anmcabusca_fila_resultado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.TextView;

public class DetalhesChamadoActivity extends AppCompatActivity {

    private TextView nomeFilaTextView, descricaoChamadoTExtView;
=======
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalhesChamadoActivity extends AppCompatActivity {
    private TextView nomeFilaTextView, descricaoChamadoTextView;
>>>>>>> Cloning
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_chamado);
<<<<<<< HEAD
        nomeFilaTextView = findViewById(R.id.nomeFilaTextView);
        descricaoChamadoTExtView = findViewById(R.id.descricaoChamadoTextView);
        Intent origemIntent = getIntent();
        String chamadoSelecionado = origemIntent.getStringExtra("chamado_selecionado");
        String[] partes = chamadoSelecionado.split(":");
        String nomeFila = partes[0];
        String descricaoChamado = partes[1];
        nomeFilaTextView.setText(nomeFila);
        descricaoChamadoTExtView.setText(descricaoChamado);
    }
}
=======
        Intent origemIntent = getIntent();
        Chamado chamadoSelecionado = (Chamado) origemIntent.getSerializableExtra("chamado_selecionado");
        ImageView filaIconImageView = findViewById(R.id.filaIconImageView);
        TextView descricaoChamadoNaFilaTextView = findViewById(R.id.descricaoChamadoNaFilaTextView);
        TextView statusChamadoNaFilaTextView = findViewById(R.id.statusChamadoNaFilaTextView);
        TextView dataAberturaChamadoNaFilaTextView = findViewById(R.id.dataAberturaChamadoNaFilaTextView);
        TextView dataFechamentoChamadoNaFilaTextView = findViewById(R.id.dataFechamentoChamadoNaFilaTextView);

        filaIconImageView.setImageResource(chamadoSelecionado.getFila().getIconId());

        descricaoChamadoNaFilaTextView.setText(chamadoSelecionado.getDescricao());

        statusChamadoNaFilaTextView.setText(chamadoSelecionado.getStatus());
        dataAberturaChamadoNaFilaTextView.setText(DateHelper.format(chamadoSelecionado.getDataAbertura()));
        if (chamadoSelecionado.getDataFechamento() != null){
            dataFechamentoChamadoNaFilaTextView.setText(
                DateHelper.format(chamadoSelecionado.getDataFechamento()));
        }
    }
}
>>>>>>> Cloning
