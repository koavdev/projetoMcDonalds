/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 14:35
 * @version 1.0 Beta Shen
 */
public class ServicosFactory {
    private static final PedidoServicos PS = new PedidoServicos();
    private static final ClienteServicos CS = new ClienteServicos();
    
    public static PedidoServicos getPedidoServicos() {
        return PS;
    }
    
    public static ClienteServicos getClienteServicos() {
        return CS;
    }
}
