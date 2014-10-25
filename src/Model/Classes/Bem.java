package Model.Classes;

import java.util.Date;

/**
 *
 * @Vesão 0.0.1
 */
public class Bem {
    
    // <editor-fold defaultstate="collapsed" desc="Definição de atributos">
    
    private int codigo;
    private Grupo grupo;
    private Locais local;
    private Funcionario funcionario;
    private String descricao;
    private Date dataAquisicao;
    private Date dataExpiracao;
    private String codigoBarras;
    private double valorAquisicao;
    private String notaFiscal;
    private float depreciacao;
    private String situacao;
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Definição de atributos">
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Locais getLocal() {
        return local;
    }

    public void setLocal(Locais local) {
        this.local = local;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValorAquisicao() {
        return valorAquisicao;
    }

    public void setValorAquisicao(double valorAquisicao) {
        this.valorAquisicao = valorAquisicao;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public float getDepreciacao() {
        return depreciacao;
    }

    public void setDepreciacao(float depreciacao) {
        this.depreciacao = depreciacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    // </editor-fold>

}
