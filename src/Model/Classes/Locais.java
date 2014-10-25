package Model.Classes;

/*
*
* @Versão 0.0.1
*
*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Locais implements Serializable {
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de atributos">
    private static final long serialVersionID = 3276830903355961861L;
    @Id
    @GeneratedValue
    private int idLocal;
    private int codigo;
    private String descricao;
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigoLocal(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoLocal() {
        return descricao;
    }

    public void setDescricaoLocal(String descricao) {
        this.descricao = descricao;
    }
    
    // </editor-fold>

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locais other = (Locais) obj;
        if (this.idLocal != other.idLocal) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.idLocal;
        hash = 23 * hash + Objects.hashCode(this.descricao);
        hash = 23 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }
 
}
