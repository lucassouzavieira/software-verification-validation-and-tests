package com.uema.funcionario;

public class Salario {

    private double adiantamento = 0;
    private double salario = 6000;
    private double INSS = 0;
    private double IRRF = 0;

    public Salario(double valor) {
        Inss inss = new Inss();
        Irrf irrf = new Irrf();

        this.salario = valor;
        this.adiantamento = 0;

        this.INSS = inss.calcularINSS(this.salario);
        this.IRRF = inss.calcularINSS(this.salario);
    }

    public Salario(double valor, double adiantamento) {
        Inss inss = new Inss();
        Irrf irrf = new Irrf();

        this.salario = valor;
        this.adiantamento = adiantamento;

        this.INSS = inss.calcularINSS(this.salario);
        this.IRRF = irrf.calcularIRRF(this.salario);
    }

    private void atualizarTaxas() {
        Inss inss = new Inss();
        Irrf irrf = new Irrf();
        this.INSS = inss.calcularINSS(this.salario);
        this.IRRF = irrf.calcularIRRF(this.salario);
    }

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
        this.atualizarTaxas();
    }

    public double getSalario() {
        return salario;
    }
}
		    
