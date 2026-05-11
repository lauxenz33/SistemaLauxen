package bean;

public class Produtos {

    private int idProdutos;
    private String nome;
    private String descricao;
    private String tamanho;
    private String cor;
    private double precoCusto;
    private double precoVenda;
    private int categoria;
    private int fornecedor;
    private String ativo;

    public Produtos() {
    }

    public int getIdProdutos() {
        return idProdutos;
    }
    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getAtivo() {
        return ativo;
    }
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}