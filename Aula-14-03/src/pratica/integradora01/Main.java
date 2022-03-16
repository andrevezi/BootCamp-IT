package pratica.integradora01;

import pratica.integradora01.classes.Basico;
import pratica.integradora01.classes.Cobrador;
import pratica.integradora01.classes.Executivo;

public class Main {
    public static void main(String[] args) {
//-----------------------------------------------------
        Basico basico = new Basico();
        basico.saque(1000.0);
        basico.consultarSaldo();
        basico.contratarServico("Seguro");
        basico.transacao("saque");
        basico.transacao("transferencia");
        System.out.println();
//-----------------------------------------------------
        Executivo executivo = new Executivo();
        executivo.deposito(2000.0);
        executivo.fazerTransferencia("22222-2", 1000.0);
        executivo.transacao("deposito");
        executivo.transacao("saque");
        System.out.println();
//-----------------------------------------------------
        Cobrador cobrador = new Cobrador();
        cobrador.saque(2403.23);
        cobrador.consultarSaldo();
        cobrador.transacao("saque");
        cobrador.transacao("transferencia");

    }
}
