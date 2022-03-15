package Pratica_1_java_III.interfaces;

import Pratica_1_java_III.Transacao;

public interface Transferecia  extends Transacao {
    public void fazerTransferencia(String conta, Double valor);
}
