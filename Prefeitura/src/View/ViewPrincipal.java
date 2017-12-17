package View;
import Control.TipoEquipamentoController;
import Model.TipoEquipamento;
import javax.swing.JOptionPane;
public class ViewPrincipal extends javax.swing.JFrame {
/*
    Author: Matheus Ladislau Ribeiro
    source: https://matheusladislau@bitbucket.org/matheusladislau/prefeitura.git
    last commit: [2017-11-02 18:02] Views centralizadas
*/
    /**
     * Creates new form InterfacePrincipal
     */
    public ViewPrincipal(){
        initComponents();
        iniciarMysql();
//lazy não traz telefones
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo = new javax.swing.JLabel();
        btn_cadastrarEquipamento = new javax.swing.JButton();
        btn_cadastrarSecretaria = new javax.swing.JButton();
        btn_cadastrarSistema = new javax.swing.JButton();
        btn_cadastrarPessoa = new javax.swing.JButton();
        btn_cadastrarPessoa1 = new javax.swing.JButton();
        btn_consultarPessoa = new javax.swing.JButton();
        btn_consultarPessoa1 = new javax.swing.JButton();
        btn_cadastrarAcesso = new javax.swing.JButton();
        btn_cadastrarAcesso1 = new javax.swing.JButton();
        btn_consultarPessoa2 = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        mb_cadastrar = new javax.swing.JMenu();
        mi_cadAcesso = new javax.swing.JMenuItem();
        mi_cadEquipamento = new javax.swing.JMenuItem();
        mi_cadTipoEquipamento = new javax.swing.JMenuItem();
        mi_cadSecretaria = new javax.swing.JMenuItem();
        mi_cadEquipamento1 = new javax.swing.JMenuItem();
        mi_cadEquipamento2 = new javax.swing.JMenuItem();
        mi_cadEquipamento3 = new javax.swing.JMenuItem();
        mb_cadastrar1 = new javax.swing.JMenu();
        mi_cadAcesso1 = new javax.swing.JMenuItem();
        mi_cadEquipamento4 = new javax.swing.JMenuItem();
        mi_cadTipoEquipamento1 = new javax.swing.JMenuItem();
        mi_cadSecretaria1 = new javax.swing.JMenuItem();
        mi_cadEquipamento5 = new javax.swing.JMenuItem();
        mi_cadEquipamento6 = new javax.swing.JMenuItem();
        mi_cadEquipamento7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(440, 230));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_blue.jpg"))); // NOI18N
        txt_titulo.setText("PREFEITURA DO SUCESSO");
        txt_titulo.setToolTipText("");
        txt_titulo.setFocusable(false);
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_cadastrarEquipamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarEquipamento.setText("Cadastrar Equipamento");
        btn_cadastrarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarEquipamentoActionPerformed(evt);
            }
        });

        btn_cadastrarSecretaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarSecretaria.setText("Cadastrar Secretaria");
        btn_cadastrarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarSecretariaActionPerformed(evt);
            }
        });

        btn_cadastrarSistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarSistema.setText("Cadastrar Sistema");
        btn_cadastrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarSistemaActionPerformed(evt);
            }
        });

        btn_cadastrarPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarPessoa.setText("Cadastrar Pessoa");
        btn_cadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarPessoaActionPerformed(evt);
            }
        });

        btn_cadastrarPessoa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarPessoa1.setText("Cadastrar Setor");
        btn_cadastrarPessoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarPessoa1ActionPerformed(evt);
            }
        });

        btn_consultarPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarPessoa.setText("Consultar/Editar Pessoa");
        btn_consultarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPessoaActionPerformed(evt);
            }
        });

        btn_consultarPessoa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarPessoa1.setText("Consultar/Editar Equipamento");
        btn_consultarPessoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPessoa1ActionPerformed(evt);
            }
        });

        btn_cadastrarAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarAcesso.setText("Criar Acesso");
        btn_cadastrarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarAcessoActionPerformed(evt);
            }
        });

        btn_cadastrarAcesso1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarAcesso1.setText("Cadastrar Tipo Equipamento");
        btn_cadastrarAcesso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarAcesso1ActionPerformed(evt);
            }
        });

        btn_consultarPessoa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarPessoa2.setText("Consultar Setor");
        btn_consultarPessoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPessoa2ActionPerformed(evt);
            }
        });

        mb_cadastrar.setText("Cadastrar");

        mi_cadAcesso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadAcesso.setText("Acesso a Sistema");
        mi_cadAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadAcessoActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadAcesso);

        mi_cadEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento.setText("Equipamento");
        mi_cadEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamentoActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadEquipamento);

        mi_cadTipoEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadTipoEquipamento.setText("Tipo de Equipamento");
        mi_cadTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadTipoEquipamentoActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadTipoEquipamento);

        mi_cadSecretaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadSecretaria.setText("Secretaria");
        mi_cadSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadSecretariaActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadSecretaria);

        mi_cadEquipamento1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento1.setText("Sistema");
        mi_cadEquipamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento1ActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadEquipamento1);

        mi_cadEquipamento2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento2.setText("Setor");
        mi_cadEquipamento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento2ActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadEquipamento2);

        mi_cadEquipamento3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento3.setText("Pessoa");
        mi_cadEquipamento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento3ActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadEquipamento3);

        menubar.add(mb_cadastrar);

        mb_cadastrar1.setText("Consultar");

        mi_cadAcesso1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadAcesso1.setText("Acesso a Sistema");
        mi_cadAcesso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadAcesso1ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadAcesso1);

        mi_cadEquipamento4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento4.setText("Equipamento");
        mi_cadEquipamento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento4ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadEquipamento4);

        mi_cadTipoEquipamento1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadTipoEquipamento1.setText("Tipo de Equipamento");
        mi_cadTipoEquipamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadTipoEquipamento1ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadTipoEquipamento1);

        mi_cadSecretaria1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadSecretaria1.setText("Secretaria");
        mi_cadSecretaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadSecretaria1ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadSecretaria1);

        mi_cadEquipamento5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento5.setText("Sistema");
        mi_cadEquipamento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento5ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadEquipamento5);

        mi_cadEquipamento6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        mi_cadEquipamento6.setText("Setor");
        mi_cadEquipamento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento6ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadEquipamento6);

        mi_cadEquipamento7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadEquipamento7.setText("Pessoa");
        mi_cadEquipamento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadEquipamento7ActionPerformed(evt);
            }
        });
        mb_cadastrar1.add(mi_cadEquipamento7);

        menubar.add(mb_cadastrar1);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_cadastrarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarEquipamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarSecretaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_cadastrarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_consultarPessoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrarAcesso1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrarPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_consultarPessoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultarPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(btn_cadastrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastrarPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarPessoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cadastrarAcesso1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarEquipamentoActionPerformed
        btn_cadastrarEquipamento();
    }//GEN-LAST:event_btn_cadastrarEquipamentoActionPerformed

    private void btn_cadastrarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarSecretariaActionPerformed
        btn_cadastrarSecretaria();
    }//GEN-LAST:event_btn_cadastrarSecretariaActionPerformed

    private void mi_cadEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamentoActionPerformed
        btn_cadastrarEquipamento();
    }//GEN-LAST:event_mi_cadEquipamentoActionPerformed

    private void mi_cadSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadSecretariaActionPerformed
        btn_cadastrarSecretaria();
    }//GEN-LAST:event_mi_cadSecretariaActionPerformed

    private void mi_cadTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadTipoEquipamentoActionPerformed
        btn_cadastrarTipoEquipamento();
    }//GEN-LAST:event_mi_cadTipoEquipamentoActionPerformed

    private void btn_cadastrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarSistemaActionPerformed
        btn_cadastrarSistema();
    }//GEN-LAST:event_btn_cadastrarSistemaActionPerformed

    private void btn_cadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarPessoaActionPerformed
        btn_cadastrarPessoa();
    }//GEN-LAST:event_btn_cadastrarPessoaActionPerformed

    private void btn_cadastrarPessoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarPessoa1ActionPerformed
        btn_cadastrarSetor();
    }//GEN-LAST:event_btn_cadastrarPessoa1ActionPerformed

    private void btn_consultarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPessoaActionPerformed
        btn_consultarPessoa();
    }//GEN-LAST:event_btn_consultarPessoaActionPerformed

    private void btn_consultarPessoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPessoa1ActionPerformed
        btn_consultarEquipamento();
    }//GEN-LAST:event_btn_consultarPessoa1ActionPerformed

    private void btn_cadastrarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarAcessoActionPerformed
        btn_cadastrarAcesso();
    }//GEN-LAST:event_btn_cadastrarAcessoActionPerformed

    private void mi_cadEquipamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento1ActionPerformed
        btn_cadastrarSistema();
    }//GEN-LAST:event_mi_cadEquipamento1ActionPerformed

    private void mi_cadEquipamento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento2ActionPerformed
        btn_cadastrarSetor();
    }//GEN-LAST:event_mi_cadEquipamento2ActionPerformed

    private void mi_cadEquipamento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento3ActionPerformed
        btn_cadastrarPessoa();
    }//GEN-LAST:event_mi_cadEquipamento3ActionPerformed

    private void mi_cadAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadAcessoActionPerformed
        btn_cadastrarAcesso();
    }//GEN-LAST:event_mi_cadAcessoActionPerformed

    private void mi_cadAcesso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadAcesso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_cadAcesso1ActionPerformed

    private void mi_cadEquipamento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_cadEquipamento4ActionPerformed

    private void mi_cadTipoEquipamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadTipoEquipamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_cadTipoEquipamento1ActionPerformed

    private void mi_cadSecretaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadSecretaria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_cadSecretaria1ActionPerformed

    private void mi_cadEquipamento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_cadEquipamento5ActionPerformed

    private void mi_cadEquipamento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento6ActionPerformed
        btn_consultarSetor();
    }//GEN-LAST:event_mi_cadEquipamento6ActionPerformed

    private void mi_cadEquipamento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadEquipamento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_cadEquipamento7ActionPerformed

    private void btn_cadastrarAcesso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarAcesso1ActionPerformed
        btn_cadastrarTipoEquipamento();
    }//GEN-LAST:event_btn_cadastrarAcesso1ActionPerformed

    private void btn_consultarPessoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPessoa2ActionPerformed
        btn_consultarSetor();
    }//GEN-LAST:event_btn_consultarPessoa2ActionPerformed
    public void btn_consultarPessoa(){
        new ViewConsultarPessoa().setVisible(true);
        this.setVisible(false);
    }
    
    public void btn_cadastrarAcesso(){
        new ViewCadastrarAcesso().setVisible(true);
        this.setVisible(false);
    }
    
    public void btn_consultarEquipamento(){
        new ViewConsultarEquipamento().setVisible(true);
        this.setVisible(false);
    }
    
    public void btn_consultarSetor(){
        new ViewConsultarSetor().setVisible(true);
        this.setVisible(false);
    }
    
    public void btn_cadastrarEquipamento(){
        new ViewCadastrarEquipamento().setVisible(true);
        this.setVisible(false);
    }
    public void btn_cadastrarSecretaria(){
        new ViewCadastrarSecretaria().setVisible(true);
        this.setVisible(false);
    }
    public void btn_cadastrarTipoEquipamento(){
        String tipo=JOptionPane.showInputDialog(null,"Informe o nome do tipo");
        cadastrarTipo(tipo);
    }
    public void btn_cadastrarSistema(){
        new ViewCadastrarSistema().setVisible(true);
        this.setVisible(false);
    }
    public void btn_cadastrarPessoa(){
        new ViewSelecionarSetorPessoa().setVisible(true);
        this.setVisible(false);
    }
    public void btn_cadastrarSetor(){
        new ViewCadastrarSetor().setVisible(true);
        this.setVisible(false);
    }
    
    public void cadastrarTipo(String tipo){
        new TipoEquipamentoController().insert(tipo);
        System.out.println("Tipo cadastrado"); 
    }
    public void iniciarMysql(){
        try{     
            Process p = Runtime.getRuntime().exec("C:\\xampp\\mysql\\bin\\mysqld.exe");
            if(p.exitValue()==0){     
//               System.out.println("Programa terminou normalmente");     
            }     
         }catch(Exception e){     
         }  
        System.out.println("MySQL iniciado normalmente.");
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarAcesso;
    private javax.swing.JButton btn_cadastrarAcesso1;
    private javax.swing.JButton btn_cadastrarEquipamento;
    private javax.swing.JButton btn_cadastrarPessoa;
    private javax.swing.JButton btn_cadastrarPessoa1;
    private javax.swing.JButton btn_cadastrarSecretaria;
    private javax.swing.JButton btn_cadastrarSistema;
    private javax.swing.JButton btn_consultarPessoa;
    private javax.swing.JButton btn_consultarPessoa1;
    private javax.swing.JButton btn_consultarPessoa2;
    private javax.swing.JMenu mb_cadastrar;
    private javax.swing.JMenu mb_cadastrar1;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem mi_cadAcesso;
    private javax.swing.JMenuItem mi_cadAcesso1;
    private javax.swing.JMenuItem mi_cadEquipamento;
    private javax.swing.JMenuItem mi_cadEquipamento1;
    private javax.swing.JMenuItem mi_cadEquipamento2;
    private javax.swing.JMenuItem mi_cadEquipamento3;
    private javax.swing.JMenuItem mi_cadEquipamento4;
    private javax.swing.JMenuItem mi_cadEquipamento5;
    private javax.swing.JMenuItem mi_cadEquipamento6;
    private javax.swing.JMenuItem mi_cadEquipamento7;
    private javax.swing.JMenuItem mi_cadSecretaria;
    private javax.swing.JMenuItem mi_cadSecretaria1;
    private javax.swing.JMenuItem mi_cadTipoEquipamento;
    private javax.swing.JMenuItem mi_cadTipoEquipamento1;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
