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
@Table(name = "grupo_bem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoBem.findAll", query = "SELECT g FROM GrupoBem g"),
    @NamedQuery(name = "GrupoBem.findByGrupoBemCodigo", query = "SELECT g FROM GrupoBem g WHERE g.grupoBemCodigo = :grupoBemCodigo"),
    @NamedQuery(name = "GrupoBem.findByGrupoBemDescricao", query = "SELECT g FROM GrupoBem g WHERE g.grupoBemDescricao = :grupoBemDescricao"),
    @NamedQuery(name = "GrupoBem.findByGrupoBemDepreciacao", query = "SELECT g FROM GrupoBem g WHERE g.grupoBemDepreciacao = :grupoBemDepreciacao"),
    @NamedQuery(name = "GrupoBem.findByGrupoBemSigla", query = "SELECT g FROM GrupoBem g WHERE g.grupoBemSigla = :grupoBemSigla")})
public class GrupoBem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GrupoBem_Codigo")
    private Integer grupoBemCodigo;
    @Basic(optional = false)
    @Column(name = "GrupoBem_Descricao")
    private String grupoBemDescricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GrupoBem_Depreciacao")
    private Float grupoBemDepreciacao;
    @Basic(optional = false)
    @Column(name = "GrupoBem_Sigla")
    private String grupoBemSigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bemGrupoCodigo")
    private Collection<Bem> bemCollection;

    public GrupoBem() {
    }

    public GrupoBem(Integer grupoBemCodigo) {
        this.grupoBemCodigo = grupoBemCodigo;
    }

    public GrupoBem(Integer grupoBemCodigo, String grupoBemDescricao, String grupoBemSigla) {
        this.grupoBemCodigo = grupoBemCodigo;
        this.grupoBemDescricao = grupoBemDescricao;
        this.grupoBemSigla = grupoBemSigla;
    }

    public Integer getGrupoBemCodigo() {
        return grupoBemCodigo;
    }

    public void setGrupoBemCodigo(Integer grupoBemCodigo) {
        this.grupoBemCodigo = grupoBemCodigo;
    }

    public String getGrupoBemDescricao() {
        return grupoBemDescricao;
    }

    public void setGrupoBemDescricao(String grupoBemDescricao) {
        this.grupoBemDescricao = grupoBemDescricao;
    }

    public Float getGrupoBemDepreciacao() {
        return grupoBemDepreciacao;
    }

    public void setGrupoBemDepreciacao(Float grupoBemDepreciacao) {
        this.grupoBemDepreciacao = grupoBemDepreciacao;
    }

    public String getGrupoBemSigla() {
        return grupoBemSigla;
    }

    public void setGrupoBemSigla(String grupoBemSigla) {
        this.grupoBemSigla = grupoBemSigla;
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
        hash += (grupoBemCodigo != null ? grupoBemCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoBem)) {
            return false;
        }
        GrupoBem other = (GrupoBem) object;
        if ((this.grupoBemCodigo == null && other.grupoBemCodigo != null) || (this.grupoBemCodigo != null && !this.grupoBemCodigo.equals(other.grupoBemCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.GrupoBem[ grupoBemCodigo=" + grupoBemCodigo + " ]";
    }
    
}
