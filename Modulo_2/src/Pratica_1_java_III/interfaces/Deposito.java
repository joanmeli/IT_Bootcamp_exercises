package Pratica_1_java_III.interfaces;

public interface Deposito {
    public void fazerDeposito(String conta, Double valor);
    // Deposito em conta de mesma titularidade
    public void fazerDeposito(Double valor);

}
