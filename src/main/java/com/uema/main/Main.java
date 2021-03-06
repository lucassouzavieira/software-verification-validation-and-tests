package com.uema.main;

import com.uema.funcionario.Fucionario;
import com.uema.funcionario.FuncADM;
import com.uema.funcionario.Salario;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fucionario func = new Fucionario();
        Salario sal = new Salario(0, 0);

        // Dados do funcionario
        func.setNome(JOptionPane.showInputDialog("informe o nome do funcionario: \n"));
        func.setFuncao(JOptionPane.showInputDialog("informe o setor: \n"));
        func.setSetor(JOptionPane.showInputDialog("informe a funcao: \n"));

        // Salario do funcionario
        sal.setSalario(Double.parseDouble(JOptionPane.showInputDialog("informe o salario: \n")));

        FuncADM ADM = new FuncADM(func, sal);

        // Verificacao do salario
        if (!sal.validarSalario(sal.getSalario())) {
            JOptionPane.showMessageDialog(null, "Salario invalido!");
        }

        // Adiantamento de salario do funcionario
        sal.setAdiantamento(Double.parseDouble(JOptionPane.showInputDialog("informe o adiantamento recebido: \n")));

        // Verificacao do adiantamento
        if (!sal.validarAdiantamento(sal.getAdiantamento())) {
            JOptionPane.showMessageDialog(null, "Adiantamento invalido!");
        }

        // Verificacao dos dados
        if (func.getNome() != null) {
            JOptionPane.showMessageDialog(null, ADM.exibir());
        } else {
            JOptionPane.showMessageDialog(null, "Nao tem nenhum funcionario cadastrado");
        }
    }
}
