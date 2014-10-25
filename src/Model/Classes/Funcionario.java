package Model.Classes;

import java.util.Date;

/*
*
* @Versão 0.0.1 teste 2wwwwwww
*
*/

public class Funcionario extends Pessoa{
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de atributos">
    
    private int codigo;
    private String RG;
    private String CPF;
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public int getCodigoFuncionario() {
        return codigo;
    }

    public void setCodigoFuncionario(int codigo) {
        this.codigo = codigo;
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
