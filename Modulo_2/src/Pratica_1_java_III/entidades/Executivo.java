package Pratica_1_java_III.entidades;

import Pratica_1_java_III.interfaces.Deposito;
import Pratica_1_java_III.interfaces.Transferecia;

public class Executivo implements Deposito, Transferecia {
    String nome;

    public Executivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void fazerDeposito(String conta, Double valor){
        System.out.println("Déposito de " + valor + " efetuado com sucesso na conta " + conta);
    }

    @Override
    public void fazerDeposito(Double valor){
        System.out.println("Déposito de " + valor + " efetuado com sucesso");
    }

    @Override
    public void fazerTransferencia(String conta, Double valor) {
        System.out.println("Transferencia de " + valor + " efetuado com sucesso na conta " + conta);
    }

    @Override
    public void transacaoOk() {

    }

    @Override
    public void transacaoNaoOk() {

    }
}
