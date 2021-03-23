/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Cliente;
import servicos.ClienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author a-g-k
 */
public class GUICadCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadCliente
     */
    public GUICadCliente() {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/icon.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jlFone = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtIdade = new javax.swing.JTextField();
        jtCPF = new javax.swing.JTextField();
        jtFone = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Cliente");
        setPreferredSize(null);

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome:");

        jlIdade.setText("Idade:");

        jlFone.setText("Telefone:");

        jlEmail.setText("E-mail:");

        jlCPF.setText("CPF:");

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlFone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtFone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jlpDadosLayout.createSequentialGroup()
                            .addComponent(jlCPF)
                            .addGap(9, 9, 9))
                        .addComponent(jlIdade))
                    .addComponent(jlFone)
                    .addComponent(jlEmail)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtFone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jtEmail))
                .addGap(147, 147, 147))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdade)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCPF)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFone)
                    .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jbCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jbLimpar)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
       cadastrar();
       limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void cadastrar(){
        try {
            Cliente c = new Cliente();
            c.setNome(jtNome.getText());
            c.setIdade(Integer.parseInt(jtIdade.getText()));
            c.setCpf(Long.parseLong(jtCPF.getText()));
            c.setFone(Integer.parseInt(jtFone.getText()));
            c.setEmail(jtEmail.getText());
            
            ClienteServicos cs = ServicosFactory.getClienteServicos();
            cs.cadastrarCliente(c);  
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Cliente cadastrado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpar(){
        jtNome.setText("");
        jtIdade.setText("");
        jtCPF.setText("");
        jtFone.setText("");
        jtEmail.setText("");
        
        jtNome.grabFocus();
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFone;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtFone;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
