package com.example.usjtads3anmcabusca_fila_resultado;

<<<<<<< HEAD
import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.Date;

=======
import java.io.Serializable;
import java.util.Date;
>>>>>>> Cloning
public class Chamado implements Serializable {
    private Fila fila;
    private String descricao;
    private Date dataAbertura;
    private Date dataFechamento;
    private String status;

<<<<<<< HEAD
    public Chamado (Fila f, String d,
                    Date dAb, Date dFec, String st){
        setFila(f);
        setDescricao(d);
        setDataAbertura(dAb);
        setDataFechamento(dFec);
        setStatus(st);
=======
    public Chamado(Fila fila, String descricao, Date dataAbertura, Date dataFechamento, String status) {
        this.fila = fila;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.status = status;
>>>>>>> Cloning
    }

    public Fila getFila() {
        return fila;
    }
<<<<<<< HEAD

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getStatus() {
        return status;
    }

=======
    public void setFila(Fila fila) {
        this.fila = fila;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public Date getDataFechamento() {
        return dataFechamento;
    }
    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    public String getStatus() {
        return status;
    }
>>>>>>> Cloning
    public void setStatus(String status) {
        this.status = status;
    }

<<<<<<< HEAD
    @NonNull
    @Override
    public String toString() {
        return getFila().getNome() + ":" + this.getDescricao();
        return String.format(
                "%s:%s",
                getFila().getNome(),
                getDescricao()
        );
    }
}
=======
    @Override
    public String toString() {
        return this.getDescricao();
    }
}
>>>>>>> Cloning
