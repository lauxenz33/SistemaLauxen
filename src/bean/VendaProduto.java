package bean;

import java.math.BigDecimal;

public class VendaProduto {

    private int dslIdVendaProduto;
    private int dslVenda;
    private int dslProduto;
    private int dslQuantidade;
    private BigDecimal dslPrecoUnitario;
    private BigDecimal dslSubtotal;

    public VendaProduto() {
    }

    public int getDslIdVendaProduto() {
        return dslIdVendaProduto;
    }

    public void setDslIdVendaProduto(int dslIdVendaProduto) {
        this.dslIdVendaProduto = dslIdVendaProduto;
    }

    public int getDslVenda() {
        return dslVenda;
    }

    public void setDslVenda(int dslVenda) {
        this.dslVenda = dslVenda;
    }

    public int getDslProduto() {
        return dslProduto;
    }

    public void setDslProduto(int dslProduto) {
        this.dslProduto = dslProduto;
    }

    public int getDslQuantidade() {
        return dslQuantidade;
    }

    public void setDslQuantidade(int dslQuantidade) {
        this.dslQuantidade = dslQuantidade;
    }

    public BigDecimal getDslPrecoUnitario() {
        return dslPrecoUnitario;
    }

    public void setDslPrecoUnitario(BigDecimal dslPrecoUnitario) {
        this.dslPrecoUnitario = dslPrecoUnitario;
    }

    public BigDecimal getDslSubtotal() {
        return dslSubtotal;
    }

    public void setDslSubtotal(BigDecimal dslSubtotal) {
        this.dslSubtotal = dslSubtotal;
    }
}