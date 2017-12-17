package View;
import Control.PessoaController;
import Model.Pessoa;
import Model.Setor;
public class ViewEditarPessoa extends javax.swing.JFrame {
    /**
     * Creates new form ViewPrincipal
     */
    public ViewEditarPessoa(){
        initComponents();
    }
    Setor setor;
    PessoaController control=new PessoaController();
    Pessoa pessoa;
    
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
        edt_recebeNome = new javax.swing.JTextField();
        edt_recebeCpf = new javax.swing.JTextField();
        txt_nome = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_inserirPessoa = new javax.swing.JButton();
        edt_recebeMatricula = new javax.swing.JTextField();
        txt_matricula = new javax.swing.JLabel();
        txt_cadastrando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 230));

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
        txt_subtitulo.setText("Editar Pessoa");
        txt_subtitulo.setToolTipText("");
        txt_subtitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_subtitulo.setFocusable(false);
        txt_subtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        edt_recebeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_recebeNomeActionPerformed(evt);
            }
        });

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome.setText("Nome Completo");

        txt_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cpf.setText("CPF");

        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_inserirPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_inserirPessoa.setText("Editar");
        btn_inserirPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirPessoaActionPerformed(evt);
            }
        });

        txt_matricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_matricula.setText("Matrícula");

        txt_cadastrando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cadastrando.setText("Setor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btn_inserirPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nome)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edt_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_matricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_recebeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_cpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_recebeCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txt_cadastrando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cadastrando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_recebeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_recebeCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inserirPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        btn_voltar();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_inserirPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirPessoaActionPerformed
        editar();
    }//GEN-LAST:event_btn_inserirPessoaActionPerformed

    private void edt_recebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_recebeNomeActionPerformed
    }//GEN-LAST:event_edt_recebeNomeActionPerformed
    public void editar(){
        

        limpar();
        
        
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa=pessoa;
        edt_recebeNome.setText(pessoa.getNomePessoa());
        edt_recebeCpf.setText(pessoa.getCpf());
        edt_recebeMatricula.setText(pessoa.getMatricula());
    }
    
    public void btn_voltar(){
        new ViewPrincipal().setVisible(true);
        this.setVisible(false);
    }
    
    public void setSetor(Setor setor){
    
    }
    
    public void limpar(){
        edt_recebeMatricula.setText(null);
        edt_recebeNome.setText(null);
        edt_recebeCpf.setText(null);
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
            java.util.logging.Logger.getLogger(ViewEditarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEditarPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inserirPessoa;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField edt_recebeCpf;
    private javax.swing.JTextField edt_recebeMatricula;
    private javax.swing.JTextField edt_recebeNome;
    private javax.swing.JLabel txt_cadastrando;
    private javax.swing.JLabel txt_cpf;
    private javax.swing.JLabel txt_matricula;
    private javax.swing.JLabel txt_nome;
    private javax.swing.JLabel txt_subtitulo;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
