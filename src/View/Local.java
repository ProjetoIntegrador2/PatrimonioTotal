/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name = "local", catalog = "patrimoniototal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Local.findAll", query = "SELECT l FROM Local l"),
    @NamedQuery(name = "Local.findByLocalCodigo", query = "SELECT l FROM Local l WHERE l.localCodigo = :localCodigo"),
    @NamedQuery(name = "Local.findByLocalDescricao", query = "SELECT l FROM Local l WHERE l.localDescricao = :localDescricao")})
public class Local implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Local_Codigo")
    private Integer localCodigo;
    @Basic(optional = false)
    @Column(name = "Local_Descricao")
    private String localDescricao;

    public Local() {
    }

    public Local(Integer localCodigo) {
        this.localCodigo = localCodigo;
    }

    public Local(Integer localCodigo, String localDescricao) {
        this.localCodigo = localCodigo;
        this.localDescricao = localDescricao;
    }

    public Integer getLocalCodigo() {
        return localCodigo;
    }

    public void setLocalCodigo(Integer localCodigo) {
        Integer oldLocalCodigo = this.localCodigo;
        this.localCodigo = localCodigo;
        changeSupport.firePropertyChange("localCodigo", oldLocalCodigo, localCodigo);
    }

    public String getLocalDescricao() {
        return localDescricao;
    }

    public void setLocalDescricao(String localDescricao) {
        String oldLocalDescricao = this.localDescricao;
        this.localDescricao = localDescricao;
        changeSupport.firePropertyChange("localDescricao", oldLocalDescricao, localDescricao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (localCodigo != null ? localCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.localCodigo == null && other.localCodigo != null) || (this.localCodigo != null && !this.localCodigo.equals(other.localCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Local[ localCodigo=" + localCodigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
