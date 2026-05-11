package dao;

import bean.DslUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DslDaoUsuarios {

    public void inserir(DslDaoUsuarios u) {
        String sql = "INSERT INTO dsl_usuarios "
                + "(dsl_nome, dsl_login, dsl_senha, dsl_nivel, dsl_telefone, dsl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getLogin());
            ps.setString(3, u.getSenha());
            ps.setInt(4, u.getNivel());
            ps.setString(5, u.getTelefone());
            ps.setString(6, u.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
    }
}