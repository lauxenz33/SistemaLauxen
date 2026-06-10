package dao;

import bean.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutosDao {

    public void inserir(Produtos p) {
        String sql = "INSERT INTO produtos "
                + "(dsl_id_produtos, dsl_nome, dsl_descricao, dsl_tamanho, "
                + "dsl_cor, dsl_preco_custo, dsl_preco_venda, dsl_categoria, dsl_fornecedor, "
                + "dsl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDao.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, p.getIdProdutos());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getDescricao());
            ps.setString(4, p.getTamanho());
            ps.setString(5, p.getCor());
            ps.setInt(6, (int) p.getPrecoCusto());
            ps.setInt(7, (int) p.getPrecoVenda());
            ps.setInt(8, p.getCategoria());
            ps.setInt(9, p.getFornecedor());
            ps.setString(10, p.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }
}