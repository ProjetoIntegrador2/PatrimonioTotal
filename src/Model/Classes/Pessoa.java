package Model.Classes;

import java.util.Date;

/*
*
* @Versão 0.0.1
*
*/

public abstract class Pessoa {
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de atributos">
    private String nome;
    private Date dataNascimento;
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    // </editor-fold>
}
