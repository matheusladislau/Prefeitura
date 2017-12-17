package View;
import Control.EquipamentoController;
import Control.SetorController;
import Control.TipoEquipamentoController;
import Model.Equipamento;
import Model.Setor;
import Model.TipoEquipamento;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewCadastrarEquipamento extends javax.swing.JFrame{
    public ViewCadastrarEquipamento(){
        initComponents();
        atualizarTabelaTipoEquipamento();
        setVisibleCadastrar(false);
        btn_voltar.setAlignmentY(btn_selecionar.getAlignmentY());
        atualizarTabelaSetor();
    }
    Setor setor;
    Equipamento equipamento;
    EquipamentoController equipamentoControl=new EquipamentoController();
    TipoEquipamentoController tipoControl=new TipoEquipamentoController();
    SetorController setorControl=new SetorController();
    
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
        edt_recebeIdentificacao = new javax.swing.JTextField();
        edt_recebeIp = new javax.swing.JTextField();
        txt_identificacao = new javax.swing.JLabel();
        txt_ip = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_inserirMicro = new javax.swing.JButton();
        scr_tipoEquipamento = new javax.swing.JScrollPane();
        tbl_tipoEquipamento = new javax.swing.JTable();
        btn_selecionar = new javax.swing.JButton();
        scr_setor = new javax.swing.JScrollPane();
        tbl_setor = new javax.swing.JTable();
        txt_selecioneSetor = new javax.swing.JLabel();
        btn_voltar1 = new javax.swing.JButton();
        txt_rede = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 230));
        setPreferredSize(new java.awt.Dimension(399, 410));

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
        txt_subtitulo.setText("Cadastrar Equipamento");
        txt_subtitulo.setToolTipText("");
        txt_subtitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_subtitulo.setFocusable(false);
        txt_subtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_identificacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_identificacao.setText("Identificação");

        txt_ip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ip.setText("IP");

        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_inserirMicro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_inserirMicro.setText("Cadastrar");
        btn_inserirMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirMicroActionPerformed(evt);
            }
        });

        tbl_tipoEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Equipamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scr_tipoEquipamento.setViewportView(tbl_tipoEquipamento);
        if (tbl_tipoEquipamento.getColumnModel().getColumnCount() > 0) {
            tbl_tipoEquipamento.getColumnModel().getColumn(0).setResizable(false);
        }

        btn_selecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_selecionar.setText("Selecionar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });

        tbl_setor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sigla", "Secretaria", "Setor", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scr_setor.setViewportView(tbl_setor);
        if (tbl_setor.getColumnModel().getColumnCount() > 0) {
            tbl_setor.getColumnModel().getColumn(0).setResizable(false);
            tbl_setor.getColumnModel().getColumn(1).setResizable(false);
            tbl_setor.getColumnModel().getColumn(2).setResizable(false);
            tbl_setor.getColumnModel().getColumn(3).setResizable(false);
        }

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

        txt_rede.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_identificacao)
                            .addComponent(txt_ip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edt_recebeIp)
                            .addComponent(edt_recebeIdentificacao)
                            .addComponent(scr_tipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_inserirMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scr_setor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_voltar1)
                .addGap(63, 63, 63)
                .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_selecioneSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txt_rede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_selecioneSetor)
                .addGap(11, 11, 11)
                .addComponent(scr_setor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_recebeIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_identificacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_recebeIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_tipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_inserirMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(txt_rede)
                    .addContainerGap(528, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        btn_voltar();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_inserirMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirMicroActionPerformed
        if(tbl_tipoEquipamento.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Selecione o tipo do equipamento para cadastrar");
        }
        else
            inserirEquipamento();
    }//GEN-LAST:event_btn_inserirMicroActionPerformed

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed
        if((tbl_setor.getSelectedRow()>=0)){
            setor=setorControl.getById(tbl_setor.getSelectedRow()+1);
            limparSelecionarSetor();
            btn_voltar1.setVisible(false);
            setVisibleCadastrar(true);
            txt_selecioneSetor.setText("Cadastrando em: '"+setor.getNomeSetor()+"', secretaria: '"+setor.getSecretaria().getNomeSecretaria()+"'");
            txt_rede.setText("Rede: "+setor.getIpRede());
        }else
            JOptionPane.showMessageDialog(null,"Deve selecionar setor");
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void btn_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar1ActionPerformed
        btn_voltar();
    }//GEN-LAST:event_btn_voltar1ActionPerformed
//    public void atualizarTabelaSecretaria(){
//        List<Secretaria> listaSecretaria=new SecretariaDAO().findAll();
//        for (int i=0; i<listaSecretaria.size(); i++) {
//            ((DefaultTableModel)tbl_secretaria.getModel()).addRow(new Object[]{
//                listaSecretaria.get(i).getCodigoSecretaria(),listaSecretaria.get(i).getSiglaSecretaria(),listaSecretaria.get(i).getNomeSecretaria()});
//        }
//    }
    
    public void atualizarTabelaSetor(){
        List<Setor> listaSetor=setorControl.findAll();
        for (int i=0; i<listaSetor.size(); i++) {
            ((DefaultTableModel)tbl_setor.getModel()).addRow(new Object[]{
                (listaSetor.get(i).getSecretaria().getSiglaSecretaria()).toUpperCase(),listaSetor.get(i).getSecretaria().getNomeSecretaria(),listaSetor.get(i).getNomeSetor(),listaSetor.get(i).getTelefone(),listaSetor.get(i).getIpRede()});
        }
    }
    
    public void limparSelecionarSetor(){
//        txt_selecioneSecretaria.setVisible(false);
//        tbl_secretaria.setVisible(false);
//        scr_secretaria.setVisible(false);
        
//        txt_selecioneSetor.setVisible(false);
//        tbl_secretaria.setVisible(false);
        scr_setor.setVisible(false);
        btn_selecionar.setVisible(false);
    }
    
    public void setVisibleCadastrar(boolean a){
        txt_identificacao.setVisible(a);
        txt_ip.setVisible(a);
        scr_tipoEquipamento.setVisible(a);
        tbl_tipoEquipamento.setVisible(a);
        edt_recebeIdentificacao.setVisible(a);
        edt_recebeIp.setVisible(a);
        btn_inserirMicro.setVisible(a);
        btn_voltar.setVisible(a);
    }
    
    public void inserirEquipamento(){
        TipoEquipamento tipoEquipSelecionado=tipoControl.getById(tbl_tipoEquipamento.getSelectedRow()+1);
        String ip=edt_recebeIp.getText();
        String identificacao=edt_recebeIdentificacao.getText();
        edt_recebeIdentificacao.setText(null);
        edt_recebeIp.setText(null);
        
        equipamento=new Equipamento(identificacao,ip,tipoEquipSelecionado,setor);
        equipamentoControl.insert(identificacao, ip, tipoEquipSelecionado, setor);

        JOptionPane.showMessageDialog(null,"Equipamento cadastrado");
    }
    public void btn_voltar(){
        new ViewPrincipal().setVisible(true);
        this.setVisible(false);
    }
    
    public void atualizarTabelaTipoEquipamento(){
        List<TipoEquipamento> tipoEquipamento=tipoControl.findAll();
        for (int i=0; i<tipoEquipamento.size(); i++){
            ((DefaultTableModel)tbl_tipoEquipamento.getModel()).addRow(new Object[]{
                tipoEquipamento.get(i).getTipoEquipamento()});
        }
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
            java.util.logging.Logger.getLogger(ViewCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastrarEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inserirMicro;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton btn_voltar1;
    private javax.swing.JTextField edt_recebeIdentificacao;
    private javax.swing.JTextField edt_recebeIp;
    private javax.swing.JScrollPane scr_setor;
    private javax.swing.JScrollPane scr_tipoEquipamento;
    private javax.swing.JTable tbl_setor;
    private javax.swing.JTable tbl_tipoEquipamento;
    private javax.swing.JLabel txt_identificacao;
    private javax.swing.JLabel txt_ip;
    private javax.swing.JLabel txt_rede;
    private javax.swing.JLabel txt_selecioneSetor;
    private javax.swing.JLabel txt_subtitulo;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
