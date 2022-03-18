package Pratica_1_java_III.interfaces;

import Pratica_1_java_III.Transacao;

public interface Saque extends Transacao {
    public void fazerSaque(Double valor);
}
