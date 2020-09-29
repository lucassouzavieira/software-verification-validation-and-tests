package com.uema.funcionario;

public class Fucionario {
    // Area de declaracao de atributos
    private String nome;
    private String funcao;
    private String setor;

    public String exibir() {
        return "Nome: " + nome +
                "\nFuncao: " + funcao +
                "\nSetor: " + setor;
    }

    // Declaracao dos metados gettes & setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
}

