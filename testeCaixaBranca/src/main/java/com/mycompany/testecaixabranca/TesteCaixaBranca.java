/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testecaixabranca;

/**
 * A classe Teste-Caixa-Branca contém métodos para conectar a um banco de dados
 * e verificar um usuário. É utilizada para fins de demonstração de caixa
 * branca.
 */
/**
 *
 * @author Murilo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe que representa um teste de caixa branca.
 */
public class TesteCaixaBranca {

    /* ponto 1:
        Inicio
     */
    /**
     *
     * @return Uma conexão com o banco de dados ou null em caso de falha.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            /*Ponto 2: Conectar BD*/
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            /*Se ocorrer uma exceção, não faz nada e retorna null*/
        }
        return conn;
    }

    /**
     * Nome do Usuário
     */
    public String nome = "";

    /**
     * Resultado da verificação do usuário
     */
    public boolean result = false;

    /**
     *
     * @param login O login do usuário a ser verificado.
     * @param senha A senha do usuário a ser verificada.
     * @return true se o usuário for encontrado, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        try {
            /* Ponto 4: Montar SQL Statement */
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                /* Ponto 5: Verificar Resultado */
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            /* Se ocorrer uma exceção, não faz nada */
        }
        return result;
    }
    /* Ponto 6: Fim */
}
