/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name = "local")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Local.findAll", query = "SELECT l FROM Local l"),
    @NamedQuery(name = "Local.findByLocalCodigo", query = "SELECT l FROM Local l WHERE l.localCodigo = :localCodigo"),
    @NamedQuery(name = "Local.findByLocalDescricao", query = "SELECT l FROM Local l WHERE l.localDescricao = :localDescricao")})
public class Local implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Local_Codigo")
    private Integer localCodigo;
    @Basic(optional = false)
    @Column(name = "Local_Descricao")
    private String localDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bemLocalCodigo")
    private Collection<Bem> bemCollection;

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
        this.localCodigo = localCodigo;
    }

    public String getLocalDescricao() {
        return localDescricao;
    }

    public void setLocalDescricao(String localDescricao) {
        this.localDescricao = localDescricao;
    }

    @XmlTransient
    public Collection<Bem> getBemCollection() {
        return bemCollection;
    }

    public void setBemCollection(Collection<Bem> bemCollection) {
        this.bemCollection = bemCollection;
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
        return "model.Local[ localCodigo=" + localCodigo + " ]";
    }
    
}
