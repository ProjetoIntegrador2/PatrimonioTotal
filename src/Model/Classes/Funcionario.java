package Model.Classes;

import java.util.Date;

/*
*
* @Versão 0.0.1 teste 2
*
*/

public class Funcionario extends Pessoa{
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de atributos">
    
    private int codigoFuncionario;
    private String RG;
    private String CPF;
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    // </editor-fold>
}
