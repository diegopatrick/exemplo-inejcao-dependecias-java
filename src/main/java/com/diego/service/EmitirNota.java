package com.diego.service;

import com.diego.modelo.Cliente;
import com.diego.modelo.Produto;
import notificacao.Notificador;
import notificacao.NotificadorEmail;

public class EmitirNota {

    private Notificador notificador;

    public EmitirNota(Notificador notificador){
        this.notificador = notificador;
    }
    public void emitir(Cliente cliente, Produto produto){

        this.notificador.notificar(cliente, "Emissao de nota do produto " + produto.getNome() + "foi emitida.");
    }
}
