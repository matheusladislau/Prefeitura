package View;
import Control.PessoaController;
import DAO.PessoaDAO;
import Model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewConsultarPessoa extends javax.swing.JFrame {
    /**
     * Creates new form ViewPrincipal
     */
    public ViewConsultarPessoa(){
        initComponents();
    }
    PessoaController controlPessoa=new PessoaController();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo = new javax.swing.JLabel();
        txt_subtitulo = new javax.swing.JLabel();
        txt_nome = new javax.swing.JLabel();
        edt_recebeNome = new javax.swing.JTextField();
        btn_consultarPessoa = new javax.swing.JButton();
        edt_recebeMatricula = new javax.swing.JTextField();
        txt_secretaria = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JLabel();
        edt_recebeSecretaria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pessoa = new javax.swing.JTable();
        btn_editarPessoa = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_editarPessoa1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 180));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_blue.jpg"))); // NOI18N
        txt_titulo.setText("PREFEITURA DO SUCESSO");
        txt_titulo.setToolTipText("");
        txt_titulo.setFocusable(false);
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_subtitulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_subtitulo.setText("Consultar Pessoa");
        txt_subtitulo.setToolTipText("");
        txt_subtitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_subtitulo.setFocusable(false);
        txt_subtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nome.setText("Nome");

        edt_recebeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_recebeNomeActionPerformed(evt);
            }
        });

        btn_consultarPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarPessoa.setText("Consultar");
        btn_consultarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPessoaActionPerformed(evt);
            }
        });

        txt_secretaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_secretaria.setText("Secretaria");

        txt_matricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_matricula.setText("Matrícula");

        edt_recebeSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_recebeSecretariaActionPerformed(evt);
            }
        });

        tbl_pessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matrícula", "CPF", "Setor", "Secretaria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_pessoa);
        if (tbl_pessoa.getColumnModel().getColumnCount() > 0) {
            tbl_pessoa.getColumnModel().getColumn(0).setResizable(false);
            tbl_pessoa.getColumnModel().getColumn(0).setPreferredWidth(160);
            tbl_pessoa.getColumnModel().getColumn(1).setResizable(false);
            tbl_pessoa.getColumnModel().getColumn(2).setResizable(false);
            tbl_pessoa.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_pessoa.getColumnModel().getColumn(3).setResizable(false);
            tbl_pessoa.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_editarPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_editarPessoa.setText("Editar");
        btn_editarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPessoaActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_editarPessoa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_editarPessoa1.setText("Permitir Acesso");
        btn_editarPessoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPessoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_secretaria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_recebeSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_nome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(txt_matricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edt_recebeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 175, Short.MAX_VALUE)
                        .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_editarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editarPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edt_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_matricula)
                        .addComponent(edt_recebeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_recebeSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_secretaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_editarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editarPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        btn_voltar();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_consultarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPessoaActionPerformed
        consultar();
        btn_consultarPessoa.setVisible(false);
    }//GEN-LAST:event_btn_consultarPessoaActionPerformed

    private void edt_recebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_recebeNomeActionPerformed
    }//GEN-LAST:event_edt_recebeNomeActionPerformed

    private void btn_editarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPessoaActionPerformed
        if(tbl_pessoa.getSelectedRow()>=0){
            
        }else
            JOptionPane.showMessageDialog(null,"Selecione um pessoa para editar");
    }//GEN-LAST:event_btn_editarPessoaActionPerformed

    private void edt_recebeSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_recebeSecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_recebeSecretariaActionPerformed

    private void btn_editarPessoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPessoa1ActionPerformed
        btn_removerPessoa();
    }//GEN-LAST:event_btn_editarPessoa1ActionPerformed
    public void consultar(){
        String nome=edt_recebeNome.getText();
        String matricula=edt_recebeMatricula.getText();
        String secretaria=edt_recebeSecretaria.getText();
        
        List<Pessoa> listaPessoa=new PessoaDAO().findByName(nome);
        for (int i=0; i<listaPessoa.size(); i++){
            Pessoa pessoa=listaPessoa.get(i);
            ((DefaultTableModel)tbl_pessoa.getModel()).addRow(new Object[]{
                (pessoa.getNomePessoa()),pessoa.getMatricula(),pessoa.getCpf()});
        }
    }
    public void btn_voltar(){
        new ViewPrincipal().setVisible(true);
        this.setVisible(false);
    }
    public void limpar(){
        edt_recebeMatricula.setText(null);
        edt_recebeNome.setText(null);
    }
    
    public void btn_removerPessoa(){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewConsultarPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultarPessoa;
    private javax.swing.JButton btn_editarPessoa;
    private javax.swing.JButton btn_editarPessoa1;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField edt_recebeMatricula;
    private javax.swing.JTextField edt_recebeNome;
    private javax.swing.JTextField edt_recebeSecretaria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pessoa;
    private javax.swing.JLabel txt_matricula;
    private javax.swing.JLabel txt_nome;
    private javax.swing.JLabel txt_secretaria;
    private javax.swing.JLabel txt_subtitulo;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
