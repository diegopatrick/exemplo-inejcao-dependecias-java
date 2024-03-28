package notificacao;

import com.diego.modelo.Cliente;

public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando via SMS para %s \n",
                cliente.getNome(), mensagem);
    }
}
