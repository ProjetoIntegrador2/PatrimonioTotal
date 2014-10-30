/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controller.Controlador;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByFuncionarioCodigo", query = "SELECT f FROM Funcionario f WHERE f.funcionarioCodigo = :funcionarioCodigo"),
    @NamedQuery(name = "Funcionario.findByFuncionarioNome", query = "SELECT f FROM Funcionario f WHERE f.funcionarioNome = :funcionarioNome"),
    @NamedQuery(name = "Funcionario.findByFuncionarioCPF", query = "SELECT f FROM Funcionario f WHERE f.funcionarioCPF = :funcionarioCPF"),
    @NamedQuery(name = "Funcionario.findByFuncionarioRG", query = "SELECT f FROM Funcionario f WHERE f.funcionarioRG = :funcionarioRG"),
    @NamedQuery(name = "Funcionario.findByFuncionarioDataNasc", query = "SELECT f FROM Funcionario f WHERE f.funcionarioDataNasc = :funcionarioDataNasc")})
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Funcionario_Codigo")
    private Integer funcionarioCodigo;
    @Basic(optional = false)
    @Column(name = "Funcionario_Nome")
    private String funcionarioNome;
    @Basic(optional = false)
    @Column(name = "Funcionario_CPF")
    private String funcionarioCPF;
    @Column(name = "Funcionario_RG")
    private String funcionarioRG;
    @Column(name = "Funcionario_DataNasc")
    @Temporal(TemporalType.DATE)
    private Date funcionarioDataNasc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bemFuncionarioCodigo")
    private Collection<Bem> bemCollection;
    
    Controlador controlador = new Controlador();

    public Funcionario() {
    }

    public Funcionario(Integer funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public Funcionario(Integer funcionarioCodigo, String funcionarioNome, String funcionarioCPF) {
        this.funcionarioCodigo = funcionarioCodigo;
        this.funcionarioNome = funcionarioNome;
        this.funcionarioCPF = funcionarioCPF;
    }

    public Integer getFuncionarioCodigo() {
        return funcionarioCodigo;
    }

    public void setFuncionarioCodigo(Integer funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public String getFuncionarioCPF() {
        return funcionarioCPF;
    }

    public void setFuncionarioCPF(String funcionarioCPF) {
 
    if (this.controlador.CPFValido(funcionarioCPF)) {
         JOptionPane.showMessageDialog(null, "CPF válido.");
         this.funcionarioCPF = funcionarioCPF; // CPF válido então atribui CPF para propriedade this.CPF
    } else {
         JOptionPane.showMessageDialog(null, "CPF Inválido.");
    }
}

    public String getFuncionarioRG() {
        return funcionarioRG;
    }

    public void setFuncionarioRG(String funcionarioRG) {
        this.funcionarioRG = funcionarioRG;
    }

    public Date getFuncionarioDataNasc() {
        return funcionarioDataNasc;
    }

    public void setFuncionarioDataNasc(Date funcionarioDataNasc) {
        this.funcionarioDataNasc = funcionarioDataNasc;
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
        hash += (funcionarioCodigo != null ? funcionarioCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.funcionarioCodigo == null && other.funcionarioCodigo != null) || (this.funcionarioCodigo != null && !this.funcionarioCodigo.equals(other.funcionarioCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Funcionario[ funcionarioCodigo=" + funcionarioCodigo + " ]";
    }
    
}
