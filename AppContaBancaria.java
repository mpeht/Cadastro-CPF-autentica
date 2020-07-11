/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontabancaria;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author mpeht
 */
public class AppContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instanciação das classes que iremos usar
        GerenciarConta gc = new GerenciarConta();
        ContaBancaria conta;
        Conta cc;
        int i;
        int op, op02;
        //menu JOptionPane com box de diálogo
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Cliente \n"
                    + "2 - Pesquisar Cliente \n"
                    + "3 - Pesquisar por nº da conta\n"
                    + "4 - Listar Todos os clientes \n"
                    + "5 - Sair \n"
                    + "Digite a opcao:"));

            switch (op) {

                //Cadastro de dados caso escolha do menu anterior for 1
                case 1:
                    cc = new Conta();
                    cc.setCpf(JOptionPane.showInputDialog("Digite o seu CPF:"));
                    cc.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente: "));
                    cc.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço:"));
                    cc.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua agência:")));
                    cc.setDigitoAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o digito da conta:")));
                    
                    do {
                        op02 = Integer.parseInt(JOptionPane.showInputDialog("1 - Conta Bancaria \n"
                                + "2 - Conta Poupança \n"
                                + "3 - Previdêencia Privada \n"
                                + "4 - Ações \n"
                                + "5 - Inserir o Depósito \n"
                                + "6 - Verificar Saldo \n"
                                + "7 - Sair \n"
                                + "8 - Voltar\n"
                                + "Digite a sua opção:"));

                        switch (op02) {
                            case 1:
                                cc.setContaBancaria(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de sua conta corrente:")));
                                cc.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu depósito inicial:")));
                                break;
                            case 2:
                                cc.setContaPoupanca(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de sua conta corrente:")));
                                cc.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu depósito inicial:")));
                                break;
                            case 3:
                                cc.setPrevidencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da previdência:")));
                                cc.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu depósito inicial:")));
                                break;
                            case 4:
                                cc.setAcoes(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do investimento em ações:")));
                                cc.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu depósito inicial:")));
                                break;
                            case 5:
                                double saldo = cc.getSaldo();
                                JOptionPane.showMessageDialog(null, saldo);
                                break;
                            case 6:
                                double deposito = cc.getDeposito();
                                JOptionPane.showMessageDialog(null, deposito);
                                break;
                            case 7:
                                System.exit(0);
                                break;

                        }
                    } while (op02 >= 1 && op02 <= 7);

                    gc.add(cc);
                    break;
                case 2:
                    String nome = JOptionPane.showInputDialog("Digite o cliente a ser pesquisado: ");
                    JOptionPane.showMessageDialog(null, gc.pesquisa(nome));
                    break;
                case 3:
                    int contaPesq = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
                    JOptionPane.showMessageDialog(null, gc.PesquisaConta(contaPesq));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, gc.listarTodos());
                    break;
                case 5:
                    
                case 6:
                    System.exit(0);
                    break;
            }

        } while (op >= 1 && op <= 4);
        // TODO code application logic here
    }

}
