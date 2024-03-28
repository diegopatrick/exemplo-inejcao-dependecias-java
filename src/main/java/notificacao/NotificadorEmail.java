package notificacao;

import com.diego.modelo.Cliente;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s atraves do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }
}
