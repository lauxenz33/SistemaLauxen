package dao;

import bean.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDao {

    public void inserir(Clientes c) {
        String sql = "INSERT INTO dsl_clientes "
                + "(dsl_nome, dsl_cpf, dsl_rg, dsl_email, dsl_cep, dsl_endereco, "
                + "dsl_numero, dsl_bairro, dsl_dataNascimento, dsl_telefone, "
                + "dsl_celular, dsl_cidade, dsl_dataCadastro, dsl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDao.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getRg());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getCep());
            ps.setString(6, c.getEndereco());
            ps.setString(7, c.getNumero());
            ps.setString(8, c.getBairro());
            ps.setDate(9, c.getDataNascimento() != null ? new java.sql.Date(c.getDataNascimento().getTime()) : null);
            ps.setString(10, c.getTelefone());
            ps.setString(11, c.getCelular());
            ps.setString(12, c.getCidade());
            ps.setDate(13, c.getDataCadastro() != null ? new java.sql.Date(c.getDataCadastro().getTime()) : null);
            ps.setString(14, c.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }
}