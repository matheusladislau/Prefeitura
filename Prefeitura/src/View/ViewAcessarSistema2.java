package View;
import Control.AcessoSistemaController;
import Control.PessoaController;
import DAO.PessoaDAO;
import Model.AcessoSistema;
import Model.Pessoa;
import Model.Sistema;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewAcessarSistema2 extends javax.swing.JFrame{
    public ViewAcessarSistema2(){
        initComponents();
        atualizarTabelaPessoa();
    }
    Sistema sistema;
    PessoaController pessoaControl=new PessoaController();
    AcessoSistemaController acessoSistemaControl=new AcessoSistemaController();
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
        btn_selecionar = new javax.swing.JButton();
        txt_selecioneSetor = new javax.swing.JLabel();
        btn_voltar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pessoa = new javax.swing.JTable();
        txt_matricula = new javax.swing.JLabel();
        txt_nome = new javax.swing.JLabel();
        edt_recebeNome = new javax.swing.JTextField();
        btn_consultarPessoa = new javax.swing.JButton();
        edt_recebeMatricula = new javax.swing.JTextField();

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
        txt_subtitulo.setText("Criar Acesso");
        txt_subtitulo.setToolTipText("");
        txt_subtitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_subtitulo.setFocusable(false);
        txt_subtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_selecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_selecionar.setText("Cadastrar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });

        txt_selecioneSetor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_selecioneSetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_selecioneSetor.setText("Selecione o setor");

        btn_voltar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_voltar1.setText("Voltar");
        btn_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar1ActionPerformed(evt);
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

        txt_matricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_matricula.setText("Matrícula");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_voltar1)
                .addGap(114, 114, 114)
                .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_selecioneSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txt_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edt_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_matricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edt_recebeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_selecioneSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_matricula)
                    .addComponent(edt_recebeMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consultarPessoa)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed
        if((tbl_pessoa.getSelectedRow()>=0)){
            pessoa=pessoaControl.getById(tbl_pessoa.getSelectedRow()+1);
            acessoSistemaControl.insert(sistema, pessoa);
            JOptionPane.showMessageDialog(null, "Acesso criado.");
        }else
            JOptionPane.showMessageDialog(null,"Deve selecionar setor");
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void btn_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar1ActionPerformed
        btn_voltar();
    }//GEN-LAST:event_btn_voltar1ActionPerformed

    private void edt_recebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_recebeNomeActionPerformed

    }//GEN-LAST:event_edt_recebeNomeActionPerformed

    private void btn_consultarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPessoaActionPerformed
        consultar();
        btn_consultarPessoa.setVisible(false);
    }//GEN-LAST:event_btn_consultarPessoaActionPerformed

    public void setSistema(Sistema sistema){
        this.sistema=sistema;
        txt_selecioneSetor.setText("Sistema: '"+sistema.getNomeSistema()+"', desenvolvedor: '"+sistema.getDesenvolvedor()+"'");

    }
    
    public void consultar(){
        String nome=edt_recebeNome.getText();
        String matricula=edt_recebeMatricula.getText();
        
        List<Pessoa> listaPessoa=new PessoaDAO().findByName(nome);
        for (int i=0; i<listaPessoa.size(); i++){
            Pessoa pessoa=listaPessoa.get(i);
            ((DefaultTableModel)tbl_pessoa.getModel()).addRow(new Object[]{
                (pessoa.getNomePessoa()),pessoa.getMatricula(),pessoa.getCpf(),pessoa.getSetor().getNomeSetor(),pessoa.getSetor().getSecretaria().getNomeSecretaria()});
        }
    }
    
    public void atualizarTabelaPessoa(){
//        List<Pessoa> listaSistema=sistemaControl.findAll();
//        for (int i=0; i<listaSistema.size(); i++) {
//            ((DefaultTableModel)tbl_sistemas.getModel()).addRow(new Object[]{
//                (listaSistema.get(i).getNomeSistema().getSiglaSecretaria()).toUpperCase(),listaSistema.get(i).getSecretaria().getNomeSecretaria(),listaSistema.get(i).getNomeSetor(),listaSistema.get(i).getTelefone(),listaSistema.get(i).getIpRede()});
//        }
    }
    
    public void limparSelecionarSetor(){

    }
    
    
    
    public void inserirEquipamento(){
        
    }
    public void btn_voltar(){
        new ViewPrincipal().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(ViewAcessarSistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAcessarSistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAcessarSistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAcessarSistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAcessarSistema2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultarPessoa;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JButton btn_voltar1;
    private javax.swing.JTextField edt_recebeMatricula;
    private javax.swing.JTextField edt_recebeNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pessoa;
    private javax.swing.JLabel txt_matricula;
    private javax.swing.JLabel txt_nome;
    private javax.swing.JLabel txt_selecioneSetor;
    private javax.swing.JLabel txt_subtitulo;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}