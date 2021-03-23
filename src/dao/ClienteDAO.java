/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Cliente;
import persistencia.ConexaoBanco;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 14:31
 * @version 1.0 Beta Shen
 */
public class ClienteDAO {
    public void cadastrarCliente(Cliente c) throws SQLException {
       Connection con = ConexaoBanco.getConexao();
       Statement stat = con.createStatement();
       try {
           String sql = "";
           
           sql = "insert into cliente(idcliente,nome,idade,cpf,fone,email)"
                +"values(null,'"+c.getNome()+"',"+c.getIdade()+","+c.getCpf()+","+c.getFone()+",'"+c.getEmail()+"')";
           
           stat.execute(sql);
       } catch (SQLException e) {
           throw new SQLException("Erro ao cadastrar! "+e.getMessage());
       } finally {
           stat.close();
           con.close();
       }
   }
    
    public ArrayList<Cliente> buscarClientes() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from cliente";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Cliente> cli = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                Cliente c = new Cliente();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                c.setIdCliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setIdade(rs.getInt("idade"));
                c.setCpf(rs.getLong("cpf"));
                c.setFone(rs.getInt("fone"));
                c.setEmail(rs.getString("email"));

                /* Inserindo o objeto pVO no ArrayList */
                cli.add(c);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return cli;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar clientes! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    public void deletarCliente(long idCliente) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            
            String sql = "delete from cliente where idcliente = " + idCliente;
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir cliente! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }
    
    public ArrayList<Cliente> filtrar(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            sql = "select * from cliente "+query;
            
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Cliente> cli = new ArrayList<>();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setIdade(rs.getInt("idade"));
                c.setCpf(rs.getLong("cpf"));
                c.setFone(rs.getInt("fone"));
                c.setEmail(rs.getString("email"));
                cli.add(c);
            }
            return cli;
        
            }catch (SQLException e){
                throw new SQLException("Erro ao buscar cliente!"+e.getMessage());
            }finally{
            stat.close();
            con.close();
        }
    }
    
    public void alterarCliente(Cliente c) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            
            String sql = "update cliente set nome='"+c.getNome()+"',"
                       + "idade="+c.getIdade()+","
                       + "cpf="+c.getCpf()+","
                       + "fone="+c.getFone()+","
                       + "email='"+c.getEmail()+"' where idcliente ="+c.getIdCliente();
            
            stat.executeUpdate(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar cliente! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }
}
