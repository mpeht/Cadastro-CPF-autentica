/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontabancaria;

import java.util.ArrayList;

/**
 *
 * @author mpeht
 */
public class GerenciarConta {

   
    static ArrayList<Conta> conta = new ArrayList<Conta>();
   //Recebendo o true ou false do método CPF este método adiciona se o return do método CPF for o próprio número, caso seja Não válido este método não adiciona o CPF 
    public static void add(Conta obj) {
        String saida = "";
        if(!obj.getCpf().equalsIgnoreCase("Não Válido!"))    {
            conta.add(obj);
            saida = "CPF válido conta cadastrada.";
            System.out.println(saida);
        }else{
            saida = "CPF inválido conta não cadastrada.";
            System.out.println(saida);
        }
        
    }
    //Pesquisa pelo nome
    public static String pesquisa(String cliente) {
        String saida = " ";
        for(Conta obj : conta)  {
            if(obj.getCliente().equalsIgnoreCase(cliente))  {
                saida = obj.imprimirDados();
            }
                
        }
        return saida;
    }
    //Pesquisa pelo número da conta
    public static String PesquisaConta(int contaPesq)   {
        String saida = " ";
        
        for(Conta obj : conta)  {
            if(obj.getContaBancaria() == contaPesq) {
                saida = obj.imprimirDados();
                
            } else if(obj.getContaPoupanca() == contaPesq) {
                saida = obj.imprimirDados();
            }else if(obj.getPrevidencia() == contaPesq) {
                saida = obj.imprimirDados();
            }else if(obj.getAcoes() == contaPesq) {
                saida = obj.imprimirDados();
            }
        }
        return saida;
        
    }
    //Lista todos os clientes cadastrados
    public static String listarTodos()  {
        String saida = " ";
        for(Conta obj : conta)  {
            saida += obj.imprimirDados() + "\n";
        }
        return saida;
    }
}
