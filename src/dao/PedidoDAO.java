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
import modelo.Pedido;
import persistencia.ConexaoBanco;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 14:30
 * @version 1.0 Beta Shen
 */
public class PedidoDAO {
    public void cadastrarPedido(Pedido p) throws SQLException {
       Connection con = ConexaoBanco.getConexao();
       Statement stat = con.createStatement();
       try {
           String sql = "";
           
           sql = "insert into pedido(idpedido, hamburguer, batata, bebida, sobremesa, idcliente)"
                +"values(null,'"+p.getHamburguer()+"','"+p.getBatata()+"','"+p.getBebida()+"','"+p.getSobremesa()+"',"+p.getCliente().getIdCliente()+")";
           
           stat.execute(sql);
       } catch (SQLException e) {
           throw new SQLException("Erro ao cadastrar! "+e.getMessage());
       } finally {           
           con.close();
           stat.close();
       }
   }
    
    public ArrayList<Pedido> buscarPedidos() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;            

            //Montando o sql            
            sql = "select idpedido, hamburguer, batata, bebida, sobremesa, c.idcliente from pedido as p, cliente as c where p.idcliente = c.idcliente;";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Pedido> ped = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                Pedido p = new Pedido();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setIdPedido(rs.getLong("idpedido"));
                p.setHamburguer(rs.getString("hamburguer"));
                p.setBatata(rs.getString("batata"));
                p.setBebida(rs.getString("bebida"));
                p.setSobremesa(rs.getString("sobremesa"));
                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getLong("idcliente"));
                p.setCliente(c);
                

                /* Inserindo o objeto pVO no ArrayList */
                ped.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return ped;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pedidos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    public void deletarPedido(long idPedido) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            
            String sql = "delete from pedido where idpedido = " + idPedido;
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir pedido! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }
    
    public ArrayList<Pedido> filtrar(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            sql = "select * from pedido "+query;
            
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Pedido> ped = new ArrayList<>();
            
            while(rs.next()){
                Pedido p = new Pedido();
                p.setIdPedido(rs.getInt("idpedido"));
                p.setHamburguer(rs.getString("hamburguer"));
                p.setBatata(rs.getString("batata"));
                p.setBebida(rs.getString("bebida"));
                p.setSobremesa(rs.getString("sobremesa"));
                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getLong("idcliente"));
                p.setCliente(c);
                ped.add(p);
            }
            return ped;
        
            }catch (SQLException e){
                throw new SQLException("Erro ao buscar pedido!"+e.getMessage());
            }finally{
            stat.close();
            con.close();
        }
    }
    
    public void alterarPedido(Pedido p) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            
            String sql = "update pedido set hamburguer = '"+p.getHamburguer()+"',"
                       + "batata = '" + p.getBatata()+"',"
                       + "bebida = '" + p.getBebida()+"',"
                       + "sobremesa = '" +p.getSobremesa()+"',"
                       + "cliente = '" +p.getCliente()+"',"
                       +" where idpedido=" +p.getIdPedido();
            
            stat.executeUpdate(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar pedido! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }
}
