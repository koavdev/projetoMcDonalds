/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 14:34
 * @version 1.0 Beta Shen
 */
public class ClienteServicos {
    public void cadastrarCliente(Cliente c) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarCliente(c);
    }
    
    public ArrayList<Cliente> buscarClientes() throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.buscarClientes();
    }
    
    public void deletarCliente(long idCliente) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarCliente(idCliente);
    }

    public ArrayList<Cliente> filtrar(String query) throws SQLException{
        ClienteDAO cDAO = new DAOFactory().getClienteDAO();
        return cDAO.filtrar(query);
    }

    public void alterarCliente(Cliente c) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.alterarCliente(c);
    }
}
