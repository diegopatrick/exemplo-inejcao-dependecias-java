package org.example;

import com.diego.modelo.Cliente;
import com.diego.service.AtivacaoClienteService;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cliente joao = new Cliente("Joao", "joao@xyz.com", "123456");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "203060");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);



    }
}