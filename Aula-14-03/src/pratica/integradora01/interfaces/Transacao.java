package pratica.integradora01.interfaces;

public interface Transacao {
    public abstract void transacaoOk(String tipoTransc);
    public abstract void transacaoNaoOk(String tipoTransc);
}
