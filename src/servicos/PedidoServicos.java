/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PedidoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pedido;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 14:33
 * @version 1.0 Beta Shen
 */
public class PedidoServicos {
    public void cadastrarPedido(Pedido p) throws SQLException {
        PedidoDAO pDAO = DAOFactory.getPedidoDAO();
        pDAO.cadastrarPedido(p);
    }
    
    public ArrayList<Pedido> buscarPedidos() throws SQLException {
        PedidoDAO pDAO = DAOFactory.getPedidoDAO();
        return pDAO.buscarPedidos();
    }
    
    public void deletarPedido(long idPedido) throws SQLException {
        PedidoDAO pDAO = DAOFactory.getPedidoDAO();
        pDAO.deletarPedido(idPedido);
    }

    public ArrayList<Pedido> filtrar(String query) throws SQLException{
        PedidoDAO pDAO = new DAOFactory().getPedidoDAO();
        return pDAO.filtrar(query);
   }

    public void alterarPedido(Pedido p) throws SQLException {
        PedidoDAO pDAO = DAOFactory.getPedidoDAO();
        pDAO.alterarPedido(p);
    }
}
