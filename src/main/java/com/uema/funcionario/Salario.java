package com.uema.funcionario;

public class Salario {

    private double adiantamento = 600;
    private double salario = 6000;

    Inss inss = new Inss();
    Irrf irrf = new Irrf();

    double INSS = inss.calcularINSS(salario);
    double IRRF = irrf.calcularIRRF(salario);


    public double calcularDesconto() {
        return INSS + IRRF;
    }

    public double calcularSalario() {
        salario = salario - adiantamento - calcularDesconto();
        return salario;
    }

    public boolean validarSalario(double salario) {
        return (salario >= 0);
    }

    public boolean validarAdiantamento(double adiantamento) {
        return (adiantamento >= 0);
    }

    public void setAdiantamento(double adiantamento) {
        this.adiantamento = adiantamento;
    }

    public double getAdiantamento() {
        return adiantamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
		    
