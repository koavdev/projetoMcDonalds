/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 14:28
 * @version 1.0 Beta Shen
 */
public class DAOFactory {
    private static final PedidoDAO PDAO = new PedidoDAO();
    private static final ClienteDAO CDAO = new ClienteDAO();
    
    public static PedidoDAO getPedidoDAO() {
        return PDAO;
    }
    
    public static ClienteDAO getClienteDAO(){
        return CDAO;
    }
}
