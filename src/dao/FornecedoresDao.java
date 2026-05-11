package dao;

import bean.Fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedoresDao {

    public void inserir(Fornecedores f) {
        String sql = "INSERT INTO fornecedores "
                + "(dsl_nome_social, dsl_nome_fantasia, dsl_cnpj, dsl_inscricao_estadual, "
                + "dsl_email, dsl_telefone, dsl_contato, dsl_cep, dsl_endereco, "
                + "dsl_bairro, dsl_cidade, dsl_estado, dsl_data_cadastro, dsl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDao.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, f.getNomeSocial());
            ps.setString(2, f.getNomeFantasia());
            ps.setString(3, f.getCnpj());
            ps.setString(4, f.getInscricaoEstadual());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getTelefone());
            ps.setString(7, f.getContato());
            ps.setString(8, f.getCep());
            ps.setString(9, f.getEndereco());
            ps.setString(10, f.getBairro());
            ps.setString(11, f.getCidade());
            ps.setString(12, f.getEstado());
            ps.setDate(13, f.getDataCadastro() != null ? new java.sql.Date(f.getDataCadastro().getTime()) : null);
            ps.setString(14, f.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());
        }
    }
}