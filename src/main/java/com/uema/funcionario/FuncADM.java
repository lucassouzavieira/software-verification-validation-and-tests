package com.uema.funcionario;

public class FuncADM {
    private Salario salario;
    private Fucionario funcionario;

    public FuncADM(Fucionario funcionario, Salario salario) {
        this.setSalario(salario);
        this.setFuncionario(funcionario);
    }

    public Fucionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Fucionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public Salario getSalario() {
        return salario;
    }

    public String exibir() {
        return "Dados do Funcionario ADM\n" + funcionario.exibir() +
                "\nrecebe R$" + String.format("%.2f do salario", salario.calcularSalario()) +
                "\nDesconto total " + String.format("%.2f do salario", salario.calcularDesconto());
    }
}
