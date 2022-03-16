package pratica.integradora01.classes;

import pratica.integradora01.interfaces.ConsultarSaldo;
import pratica.integradora01.interfaces.ContratarServico;
import pratica.integradora01.interfaces.Saque;
import pratica.integradora01.interfaces.Transacao;

public class Basico implements ConsultarSaldo, ContratarServico, Saque, Transacao {
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de :");
    }

    @Override
    public void contratarServico(String tipoServ) {
        System.out.println("Você acabou de contratar o serviço: " + tipoServ);
    }

    @Override
    public void saque(Double valor) {
        System.out.println("Saque efetuado de: R$" + valor);
    }

    @Override
    public void transacaoOk(String tipoTransc) {
        System.out.println("O seu usuário tem permissão para utilizar o serviço : " + tipoTransc);
    }

    @Override
    public void transacaoNaoOk(String tipoTransc) {
        System.out.println("O seu usuário não tem permissão para utilizar o serviço : " + tipoTransc);
    }

    public void transacao(String tipo) {
        if (tipo == "consultarSaldo" || tipo == "saque" || tipo == "contratarServico") {
            transacaoOk(tipo);
        } else {
            transacaoNaoOk(tipo);
        }
    }
}
