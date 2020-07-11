/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontabancaria;

/**
 *
 * @author mpeht
 */
public class Conta extends ContaBancaria   {
    
    private int contaBancaria;
    private int contaPoupanca;
    private int previdencia;
    private int acoes;
    private double saldo;
    private double deposito;
    //Conta que herda os dados de Conta Bancária
    public Conta(int contaBancaria, int contaPoupanca, int previdencia, int acoes, double saldo, double deposito, String cliente, String cpf, String endereco, int agencia, int digitoAgencia) {
        super(cliente, cpf, endereco, agencia, digitoAgencia);
        this.contaBancaria = contaBancaria;
        this.contaPoupanca = contaPoupanca;
        this.previdencia = previdencia;
        this.acoes = acoes;
        this.saldo = saldo;
        this.deposito = deposito;
    }

    public Conta(int contaBancaria, int contaPoupanca, int previdencia, int acoes, double saldo, double deposito) {
        this.contaBancaria = contaBancaria;
        this.contaPoupanca = contaPoupanca;
        this.previdencia = previdencia;
        this.acoes = acoes;
        this.saldo = saldo;
        this.deposito = deposito;
    }

    Conta() {
        
    }

    public int getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(int contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

     public int getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(int contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
    public int getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(int previdencia) {
        this.previdencia = previdencia;
    }

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public double getSaldo() {
        return saldo = saldo + getDeposito();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    
    public String imprimirDados() {
        String saida = "Cliente: " + getCliente() + "\n"
                + "CPF: " + getCpf() + "\n"
                + "Endereço: " + getEndereco() + "\n"
                + "Agência: " + getAgencia() + "\n"
                + "Conta: " + getDeposito() + "\n"
                + "Saldo: " + getSaldo() + "\n";
        
        return saida;
    } 
    
    
    
}
