package com.uema.funcionario;

public class FuncADM {
    Fucionario func = new Fucionario();
    Salario sal = new Salario();

    public String exibir() {

        return "Dados do Funcionario ADM\n" + func.exibir() +
                "\nrecebe R$" + String.format("%.2f de salario", sal.calcularSalario() +
                "\nDesconto total " + String.format("%.2f do salario", sal.calcularDesconto()));
    }
}
