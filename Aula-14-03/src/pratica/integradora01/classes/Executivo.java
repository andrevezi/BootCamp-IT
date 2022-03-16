package pratica.integradora01.classes;

import pratica.integradora01.interfaces.Deposito;
import pratica.integradora01.interfaces.Transacao;
import pratica.integradora01.interfaces.Transferencia;

public class Executivo implements Deposito, Transferencia, Transacao {
    @Override
    public void deposito(Double valor) {
        System.out.println("O depósito de: " +valor +" foi efetuado com sucesso");
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
        if (tipo == "transferencia" || tipo == "deposito") {
            transacaoOk(tipo);
        } else {
            transacaoNaoOk(tipo);
        }
    }
    @Override
    public void fazerTransferencia(String conta, double valor) {
        System.out.println("Transferencia de: R$"+valor+ " para conta: "+ conta +" efetuada com sucesso");
    }
}
