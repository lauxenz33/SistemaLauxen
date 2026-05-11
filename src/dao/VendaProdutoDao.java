package dao;

import bean.VendaProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaProdutoDao {

    public void inserir(VendaProduto vp) {
        String sql = "INSERT INTO venda_produto "
                + "(dsl_venda, dsl_produto, dsl_quantidade, dsl_preco_unitario, dsl_subtotal) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDao.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, vp.getDslVenda());
            ps.setInt(2, vp.getDslProduto());
            ps.setInt(3, vp.getDslQuantidade());
            ps.setBigDecimal(4, vp.getDslPrecoUnitario());
            ps.setBigDecimal(5, vp.getDslSubtotal());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir venda de produto: " + e.getMessage());
        }
    }
}