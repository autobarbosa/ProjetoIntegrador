
package interfacesgraficas;


public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1Cadastrar = new javax.swing.JMenu();
        jMenuItem2CadastrarCliente = new javax.swing.JMenuItem();
        jMenuItem1Cadastrarjogo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2Vender = new javax.swing.JMenu();
        jMenuItem1VendaJogos = new javax.swing.JMenuItem();
        jMenuItem2VendaAcessorios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3LocJogos = new javax.swing.JMenuItem();
        jMenuItem5LocAcessorios = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X Games");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacesgraficas/20180816-x-games-2.png"))); // NOI18N

        jMenuBar1.setForeground(new java.awt.Color(16, 47, 193));

        jMenu1Cadastrar.setText("Cadastros");
        jMenu1Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1CadastrarActionPerformed(evt);
            }
        });

        jMenuItem2CadastrarCliente.setText("Clientes");
        jMenuItem2CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2CadastrarClienteActionPerformed(evt);
            }
        });
        jMenu1Cadastrar.add(jMenuItem2CadastrarCliente);

        jMenuItem1Cadastrarjogo.setText("Jogos");
        jMenuItem1Cadastrarjogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1CadastrarjogoActionPerformed(evt);
            }
        });
        jMenu1Cadastrar.add(jMenuItem1Cadastrarjogo);

        jMenuItem1.setText("Acessórios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1Cadastrar.add(jMenuItem1);

        jMenuBar1.add(jMenu1Cadastrar);

        jMenu2Vender.setText("Vendas");
        jMenu2Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2VenderActionPerformed(evt);
            }
        });

        jMenuItem1VendaJogos.setText("Jogos");
        jMenuItem1VendaJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1VendaJogosActionPerformed(evt);
            }
        });
        jMenu2Vender.add(jMenuItem1VendaJogos);

        jMenuItem2VendaAcessorios.setText("Acessórios");
        jMenu2Vender.add(jMenuItem2VendaAcessorios);

        jMenuBar1.add(jMenu2Vender);

        jMenu3.setText("Locações");

        jMenuItem3LocJogos.setText("Jogos");
        jMenu3.add(jMenuItem3LocJogos);

        jMenuItem5LocAcessorios.setText("Acessórios");
        jMenu3.add(jMenuItem5LocAcessorios);

        jMenuItem4.setText("Sala");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1CadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1CadastrarActionPerformed

    private void jMenuItem2CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2CadastrarClienteActionPerformed
new ClienteListagem().setVisible(true);
    }//GEN-LAST:event_jMenuItem2CadastrarClienteActionPerformed

    private void jMenuItem1CadastrarjogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1CadastrarjogoActionPerformed
new CadJogo().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1CadastrarjogoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new CadAcessorios().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2VenderActionPerformed
      
    }//GEN-LAST:event_jMenu2VenderActionPerformed

    private void jMenuItem1VendaJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1VendaJogosActionPerformed
        new VendasJogos().setVisible(true);
    }//GEN-LAST:event_jMenuItem1VendaJogosActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1Cadastrar;
    private javax.swing.JMenu jMenu2Vender;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1Cadastrarjogo;
    private javax.swing.JMenuItem jMenuItem1VendaJogos;
    private javax.swing.JMenuItem jMenuItem2CadastrarCliente;
    private javax.swing.JMenuItem jMenuItem2VendaAcessorios;
    private javax.swing.JMenuItem jMenuItem3LocJogos;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5LocAcessorios;
    // End of variables declaration//GEN-END:variables
}
