/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name = "bem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bem.findAll", query = "SELECT b FROM Bem b"),
    @NamedQuery(name = "Bem.findByBemCodigo", query = "SELECT b FROM Bem b WHERE b.bemCodigo = :bemCodigo"),
    @NamedQuery(name = "Bem.findByBemDescricao", query = "SELECT b FROM Bem b WHERE b.bemDescricao = :bemDescricao"),
    @NamedQuery(name = "Bem.findByBemDataAquisicao", query = "SELECT b FROM Bem b WHERE b.bemDataAquisicao = :bemDataAquisicao"),
    @NamedQuery(name = "Bem.findByBemDataExpiracao", query = "SELECT b FROM Bem b WHERE b.bemDataExpiracao = :bemDataExpiracao"),
    @NamedQuery(name = "Bem.findByBemCodigoBarras", query = "SELECT b FROM Bem b WHERE b.bemCodigoBarras = :bemCodigoBarras"),
    @NamedQuery(name = "Bem.findByBemValor", query = "SELECT b FROM Bem b WHERE b.bemValor = :bemValor"),
    @NamedQuery(name = "Bem.findByBemNF", query = "SELECT b FROM Bem b WHERE b.bemNF = :bemNF"),
    @NamedQuery(name = "Bem.findByBemTaxaDepreciacao", query = "SELECT b FROM Bem b WHERE b.bemTaxaDepreciacao = :bemTaxaDepreciacao"),
    @NamedQuery(name = "Bem.findByBemSituacao", query = "SELECT b FROM Bem b WHERE b.bemSituacao = :bemSituacao")})
public class Bem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Bem_Codigo")
    private Integer bemCodigo;
    @Basic(optional = false)
    @Column(name = "Bem_Descricao")
    private String bemDescricao;
    @Basic(optional = false)
    @Column(name = "Bem_DataAquisicao")
    @Temporal(TemporalType.DATE)
    private Date bemDataAquisicao;
    @Column(name = "Bem_DataExpiracao")
    @Temporal(TemporalType.DATE)
    private Date bemDataExpiracao;
    @Column(name = "Bem_CodigoBarras")
    private String bemCodigoBarras;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Bem_Valor")
    private BigDecimal bemValor;
    @Column(name = "Bem_NF")
    private String bemNF;
    @Basic(optional = false)
    @Column(name = "Bem_TaxaDepreciacao")
    private float bemTaxaDepreciacao;
    @Basic(optional = false)
    @Column(name = "Bem_Situacao")
    private Character bemSituacao;
    @JoinColumn(name = "Bem_GrupoCodigo", referencedColumnName = "GrupoBem_Codigo")
    @ManyToOne(optional = false)
    private GrupoBem bemGrupoCodigo;
    @JoinColumn(name = "Bem_LocalCodigo", referencedColumnName = "Local_Codigo")
    @ManyToOne(optional = false)
    private Local bemLocalCodigo;
    @JoinColumn(name = "Bem_FuncionarioCodigo", referencedColumnName = "Funcionario_Codigo")
    @ManyToOne(optional = false)
    private Funcionario bemFuncionarioCodigo;

    public Bem() {
    }

    public Bem(Integer bemCodigo) {
        this.bemCodigo = bemCodigo;
    }

    public Bem(Integer bemCodigo, String bemDescricao, Date bemDataAquisicao, BigDecimal bemValor, float bemTaxaDepreciacao, Character bemSituacao) {
        this.bemCodigo = bemCodigo;
        this.bemDescricao = bemDescricao;
        this.bemDataAquisicao = bemDataAquisicao;
        this.bemValor = bemValor;
        this.bemTaxaDepreciacao = bemTaxaDepreciacao;
        this.bemSituacao = bemSituacao;
    }

    public Integer getBemCodigo() {
        return bemCodigo;
    }

    public void setBemCodigo(Integer bemCodigo) {
        this.bemCodigo = bemCodigo;
    }

    public String getBemDescricao() {
        return bemDescricao;
    }

    public void setBemDescricao(String bemDescricao) {
        this.bemDescricao = bemDescricao;
    }

    public Date getBemDataAquisicao() {
        return bemDataAquisicao;
    }

    public void setBemDataAquisicao(Date bemDataAquisicao) {
        this.bemDataAquisicao = bemDataAquisicao;
    }

    public Date getBemDataExpiracao() {
        return bemDataExpiracao;
    }

    public void setBemDataExpiracao(Date bemDataExpiracao) {
        this.bemDataExpiracao = bemDataExpiracao;
    }

    public String getBemCodigoBarras() {
        return bemCodigoBarras;
    }

    public void setBemCodigoBarras(String bemCodigoBarras) {
        this.bemCodigoBarras = bemCodigoBarras;
    }

    public BigDecimal getBemValor() {
        return bemValor;
    }

    public void setBemValor(BigDecimal bemValor) {
        this.bemValor = bemValor;
    }

    public String getBemNF() {
        return bemNF;
    }

    public void setBemNF(String bemNF) {
        this.bemNF = bemNF;
    }

    public float getBemTaxaDepreciacao() {
        return bemTaxaDepreciacao;
    }

    public void setBemTaxaDepreciacao(float bemTaxaDepreciacao) {
        this.bemTaxaDepreciacao = bemTaxaDepreciacao;
    }

    public Character getBemSituacao() {
        return bemSituacao;
    }

    public void setBemSituacao(Character bemSituacao) {
        this.bemSituacao = bemSituacao;
    }

    public GrupoBem getBemGrupoCodigo() {
        return bemGrupoCodigo;
    }

    public void setBemGrupoCodigo(GrupoBem bemGrupoCodigo) {
        this.bemGrupoCodigo = bemGrupoCodigo;
    }

    public Local getBemLocalCodigo() {
        return bemLocalCodigo;
    }

    public void setBemLocalCodigo(Local bemLocalCodigo) {
        this.bemLocalCodigo = bemLocalCodigo;
    }

    public Funcionario getBemFuncionarioCodigo() {
        return bemFuncionarioCodigo;
    }

    public void setBemFuncionarioCodigo(Funcionario bemFuncionarioCodigo) {
        this.bemFuncionarioCodigo = bemFuncionarioCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bemCodigo != null ? bemCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bem)) {
            return false;
        }
        Bem other = (Bem) object;
        if ((this.bemCodigo == null && other.bemCodigo != null) || (this.bemCodigo != null && !this.bemCodigo.equals(other.bemCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Bem[ bemCodigo=" + bemCodigo + " ]";
    }
    
}
