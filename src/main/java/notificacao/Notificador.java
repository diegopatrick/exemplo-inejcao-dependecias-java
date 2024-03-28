package notificacao;

import com.diego.modelo.Cliente;

public interface Notificador {

    public void notificar(Cliente cliente, String mensagem);
}
