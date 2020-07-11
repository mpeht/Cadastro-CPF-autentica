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
public class ContaBancaria {

    private String cliente;
    private String cpf;
    private String endereco;
    private int agencia;
    private int digitoAgencia;

    public ContaBancaria(String cliente, String cpf, String endereco, int agencia, int digitoAgencia) {
        this.cliente = cliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.agencia = agencia;
        this.digitoAgencia = digitoAgencia;
    }

    public ContaBancaria() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    //Verificação se o CPF é autentico dentro do método
    public String getCpf() {
        
        String entrada = this.cpf;
        int i;
        int num01 = 0, num02 = 0;
        int[] cpfNum = new int[11];
        if (cpfNum.length == cpfNum.length) {
            for (i = 0; i < cpfNum.length; i++) {
                //Separa cada número na String atribui a variável char e insere cada número da variavel no vetor int
                char a = entrada.charAt(i);
                cpfNum[i] = Character.getNumericValue(a);

            }
            //Pega os dois últimos números do vetor para autenticar o documento
            num01 = cpfNum[9];
            num02 = cpfNum[10];
            //envia para outro metodo com as variável vetor CPF e os dois ultimos números do CPF
            isCPF(cpfNum, num01, num02);
        }
        //Se na resposta do método booleano isCPF for true, encaminha o número para adicionar no add GerenciarConta, caso contrário for false encaminha um aviso para a classe GerenciarConta
        if (isCPF(cpfNum, num01, num02) == true) {
            return cpf;
        } else {
            return "Não Válido!";
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(int digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    public boolean isCPF(int[] cpfNum, int num01, int num02) {

        int i, y;
        int valida01 = 0;
        int valida02 = 0;
        int resto01, val01;
        int resto02, val02;
        int digito02;

        //Verificação do penultimo dígito do CPF
        y = 10;
        for (i = 0; i < (cpfNum.length - 2); i++) {
            valida01 = valida01 + (cpfNum[i] * y);
            y--;
        }
        //Verificação do último dígito do CPF
        y = 11;
        for (i = 0; i < (cpfNum.length - 1); i++) {
            valida02 = valida02 + (cpfNum[i] * y);
            y--;
        }
        //Conclusão penúltimo digito do CPF
        resto01 = (valida01 % 11);
        if (resto01 < 2) {
            val01 = 0;
        } else {
            val01 = 11 - resto01;
        }
        //Conclusão do último dígito do CPF
        resto02 = (valida02 % 11);
        if (resto02 < 2) {
            val02 = 0;
        } else {
            val02 = 11 - resto02;
        }
        //Envio da resposta para o método CPF
        if (val01 == num01 && val02 == num02) {
            return true;
        } else {
            return false;
        }

    }

}
