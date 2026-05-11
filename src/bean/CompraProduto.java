package bean;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CompraProduto {

    private int dslIdCompra;
    private LocalDate dslDataCompra;
    private int dslFornecedor;
    private int dslProduto;
    private int dslQuantidade;
    private BigDecimal dslPrecoUnitario;
    private BigDecimal dslTotal;
    private String dslStatus;

    public CompraProduto() {
    }

    public int getDslIdCompra() {
        return dslIdCompra;
    }

    public void setDslIdCompra(int dslIdCompra) {
        this.dslIdCompra = dslIdCompra;
    }

    public LocalDate getDslDataCompra() {
        return dslDataCompra;
    }

    public void setDslDataCompra(LocalDate dslDataCompra) {
        this.dslDataCompra = dslDataCompra;
    }

    public int getDslFornecedor() {
        return dslFornecedor;
    }

    public void setDslFornecedor(int dslFornecedor) {
        this.dslFornecedor = dslFornecedor;
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

    public BigDecimal getDslTotal() {
        return dslTotal;
    }

    public void setDslTotal(BigDecimal dslTotal) {
        this.dslTotal = dslTotal;
    }

    public String getDslStatus() {
        return dslStatus;
    }

    public void setDslStatus(String dslStatus) {
        this.dslStatus = dslStatus;
    }
}