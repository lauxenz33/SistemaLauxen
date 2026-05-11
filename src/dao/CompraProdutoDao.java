package dao;

import bean.CompraProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompraProdutoDao {

    public void inserir(CompraProduto cp) {
        String sql = "INSERT INTO compra_produto "
                + "(dsl_data_compra, dsl_fornecedor, dsl_produto, dsl_quantidade, dsl_preco_unitario, dsl_total, dsl_status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDao.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(cp.getDslDataCompra()));
            ps.setInt(2, cp.getDslFornecedor());
            ps.setInt(3, cp.getDslProduto());
            ps.setInt(4, cp.getDslQuantidade());
            ps.setBigDecimal(5, cp.getDslPrecoUnitario());
            ps.setBigDecimal(6, cp.getDslTotal());
            ps.setString(7, cp.getDslStatus());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir compra de produto: " + e.getMessage());
        }
    }
}