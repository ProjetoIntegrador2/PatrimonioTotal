package Model.Classes;

/*
*
* @Versão 0.0.1
*
*/
public class Grupo {
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de atributos">
    
    private int codigo;
    private String descricao;
    private float depreciacao;
    private String sigla;  
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public int getCodigoGrupo() {
        return codigo;
    }

    public void setCodigoGrupo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoGrupo() {
        return descricao;
    }

    public void setDescricaoGrupo(String descricao) {
        this.descricao = descricao;
    }

    public float getDepreciacaoGrupo() {
        return depreciacao;
    }

    public void setDepreciacaoGrupo(float depreciacao) {
        this.depreciacao = depreciacao;
    }

    public String getSiglaGrupo() {
        return sigla;
    }

    public void setSiglaGrupo(String sigla) {
        this.sigla = sigla;
    }
    
    // </editor-fold>
    
}
