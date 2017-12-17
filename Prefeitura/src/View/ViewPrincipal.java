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
        btn_cadastrarSetor = new javax.swing.JButton();
        btn_consultarPessoa = new javax.swing.JButton();
        btn_consultarEquipamento = new javax.swing.JButton();
        btn_cadastrarAcesso = new javax.swing.JButton();
        btn_cadastrarTipoEquipamento = new javax.swing.JButton();
        btn_consultarSetor = new javax.swing.JButton();
        btn_consultarSecretaria = new javax.swing.JButton();
        btn_consultarTipoEquipamento = new javax.swing.JButton();
        btn_consultarSistema = new javax.swing.JButton();
        btn_consultarAcesso = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        mb_cadastrar = new javax.swing.JMenu();
        mi_cadAcesso = new javax.swing.JMenuItem();
        mi_cadEquipamento = new javax.swing.JMenuItem();
        mi_cadTipoEquipamento = new javax.swing.JMenuItem();
        mi_cadSecretaria = new javax.swing.JMenuItem();
        mi_cadSistema = new javax.swing.JMenuItem();
        mi_cadSetor = new javax.swing.JMenuItem();
        mi_cadPessoa = new javax.swing.JMenuItem();
        mb_consultar = new javax.swing.JMenu();
        mi_conAcesso = new javax.swing.JMenuItem();
        mi_conEquipamento = new javax.swing.JMenuItem();
        mi_conTipoEquipamento = new javax.swing.JMenuItem();
        mi_conSecretaria = new javax.swing.JMenuItem();
        mi_conSistema = new javax.swing.JMenuItem();
        mi_conSetor = new javax.swing.JMenuItem();
        mi_conPessoa = new javax.swing.JMenuItem();

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

        btn_cadastrarSetor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarSetor.setText("Cadastrar Setor");
        btn_cadastrarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarSetorActionPerformed(evt);
            }
        });

        btn_consultarPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarPessoa.setText("Consultar/Editar Pessoa");
        btn_consultarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPessoaActionPerformed(evt);
            }
        });

        btn_consultarEquipamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarEquipamento.setText("Consultar/Editar Equipamento");
        btn_consultarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarEquipamentoActionPerformed(evt);
            }
        });

        btn_cadastrarAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarAcesso.setText("Criar Acesso");
        btn_cadastrarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarAcessoActionPerformed(evt);
            }
        });

        btn_cadastrarTipoEquipamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrarTipoEquipamento.setText("Cadastrar Tipo Equipamento");
        btn_cadastrarTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarTipoEquipamentoActionPerformed(evt);
            }
        });

        btn_consultarSetor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarSetor.setText("Consultar Setor");
        btn_consultarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarSetorActionPerformed(evt);
            }
        });

        btn_consultarSecretaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarSecretaria.setText("Consultar Secretaria");
        btn_consultarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarSecretariaActionPerformed(evt);
            }
        });

        btn_consultarTipoEquipamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarTipoEquipamento.setText("Consultar Tipo Equipamento");
        btn_consultarTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarTipoEquipamentoActionPerformed(evt);
            }
        });

        btn_consultarSistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarSistema.setText("Consultar Sistemas");
        btn_consultarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarSistemaActionPerformed(evt);
            }
        });

        btn_consultarAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consultarAcesso.setText("Consultar Acesso");
        btn_consultarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarAcessoActionPerformed(evt);
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

        mi_cadSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadSistema.setText("Sistema");
        mi_cadSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadSistemaActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadSistema);

        mi_cadSetor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadSetor.setText("Setor");
        mi_cadSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadSetorActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadSetor);

        mi_cadPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mi_cadPessoa.setText("Pessoa");
        mi_cadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cadPessoaActionPerformed(evt);
            }
        });
        mb_cadastrar.add(mi_cadPessoa);

        menubar.add(mb_cadastrar);

        mb_consultar.setText("Consultar");

        mi_conAcesso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conAcesso.setText("Acesso a Sistema");
        mi_conAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conAcessoActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conAcesso);

        mi_conEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conEquipamento.setText("Equipamento");
        mi_conEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conEquipamentoActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conEquipamento);

        mi_conTipoEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conTipoEquipamento.setText("Tipo de Equipamento");
        mi_conTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conTipoEquipamentoActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conTipoEquipamento);

        mi_conSecretaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conSecretaria.setText("Secretaria");
        mi_conSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conSecretariaActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conSecretaria);

        mi_conSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conSistema.setText("Sistema");
        mi_conSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conSistemaActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conSistema);

        mi_conSetor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conSetor.setText("Setor");
        mi_conSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conSetorActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conSetor);

        mi_conPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        mi_conPessoa.setText("Pessoa");
        mi_conPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_conPessoaActionPerformed(evt);
            }
        });
        mb_consultar.add(mi_conPessoa);

        menubar.add(mb_consultar);

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
                        .addComponent(btn_cadastrarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_consultarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_cadastrarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarEquipamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarSecretaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_cadastrarTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarEquipamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_consultarSecretaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarTipoEquipamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_consultarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btn_cadastrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrarTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastrarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastrarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultarTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btn_cadastrarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarSetorActionPerformed
        btn_cadastrarSetor();
    }//GEN-LAST:event_btn_cadastrarSetorActionPerformed

    private void btn_consultarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPessoaActionPerformed
        btn_consultarPessoa();
    }//GEN-LAST:event_btn_consultarPessoaActionPerformed

    private void btn_consultarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarEquipamentoActionPerformed
        btn_consultarEquipamento();
    }//GEN-LAST:event_btn_consultarEquipamentoActionPerformed

    private void btn_cadastrarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarAcessoActionPerformed
        btn_cadastrarAcesso();
    }//GEN-LAST:event_btn_cadastrarAcessoActionPerformed

    private void mi_cadSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadSistemaActionPerformed
        btn_cadastrarSistema();
    }//GEN-LAST:event_mi_cadSistemaActionPerformed

    private void mi_cadSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadSetorActionPerformed
        btn_cadastrarSetor();
    }//GEN-LAST:event_mi_cadSetorActionPerformed

    private void mi_cadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadPessoaActionPerformed
        btn_cadastrarPessoa();
    }//GEN-LAST:event_mi_cadPessoaActionPerformed

    private void mi_cadAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cadAcessoActionPerformed
        btn_cadastrarAcesso();
    }//GEN-LAST:event_mi_cadAcessoActionPerformed

    private void mi_conAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conAcessoActionPerformed
        btn_consultarAcesso();
    }//GEN-LAST:event_mi_conAcessoActionPerformed

    private void mi_conEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conEquipamentoActionPerformed
        btn_consultarEquipamento();
    }//GEN-LAST:event_mi_conEquipamentoActionPerformed

    private void mi_conTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conTipoEquipamentoActionPerformed
        btn_consultarTipoEquipamento();
    }//GEN-LAST:event_mi_conTipoEquipamentoActionPerformed

    private void mi_conSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conSecretariaActionPerformed
        btn_consultarSecretaria();
    }//GEN-LAST:event_mi_conSecretariaActionPerformed

    private void mi_conSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conSistemaActionPerformed
        btn_consultarSistema();
    }//GEN-LAST:event_mi_conSistemaActionPerformed

    private void mi_conSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conSetorActionPerformed
        btn_consultarSetor();
    }//GEN-LAST:event_mi_conSetorActionPerformed

    private void mi_conPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_conPessoaActionPerformed
        btn_consultarPessoa();
    }//GEN-LAST:event_mi_conPessoaActionPerformed

    private void btn_cadastrarTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarTipoEquipamentoActionPerformed
        btn_cadastrarTipoEquipamento();
    }//GEN-LAST:event_btn_cadastrarTipoEquipamentoActionPerformed

    private void btn_consultarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarSetorActionPerformed
        btn_consultarSetor();
    }//GEN-LAST:event_btn_consultarSetorActionPerformed

    private void btn_consultarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarSecretariaActionPerformed
        btn_consultarSecretaria();
    }//GEN-LAST:event_btn_consultarSecretariaActionPerformed

    private void btn_consultarTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarTipoEquipamentoActionPerformed
        btn_consultarTipoEquipamento();
    }//GEN-LAST:event_btn_consultarTipoEquipamentoActionPerformed

    private void btn_consultarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarSistemaActionPerformed
        btn_consultarSistema();
    }//GEN-LAST:event_btn_consultarSistemaActionPerformed

    private void btn_consultarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarAcessoActionPerformed
        btn_consultarAcesso();
    }//GEN-LAST:event_btn_consultarAcessoActionPerformed
    public void btn_consultarPessoa(){
        new ViewConsultarPessoa().setVisible(true);
        this.setVisible(false);
    }
    public void btn_consultarAcesso(){
       new ViewConsultarAcesso().setVisible(true);
        this.setVisible(false); 
    }
    
    public void btn_consultarSecretaria(){
        new ViewConsultarSecretaria().setVisible(true);
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
    
    public void btn_consultarTipoEquipamento(){
        new ViewConsultarTipoEquipamento().setVisible(true);
        this.setVisible(false);
    }
    
    public void btn_consultarSistema(){
        new ViewConsultarSistema().setVisible(true);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarAcesso;
    private javax.swing.JButton btn_cadastrarEquipamento;
    private javax.swing.JButton btn_cadastrarPessoa;
    private javax.swing.JButton btn_cadastrarSecretaria;
    private javax.swing.JButton btn_cadastrarSetor;
    private javax.swing.JButton btn_cadastrarSistema;
    private javax.swing.JButton btn_cadastrarTipoEquipamento;
    private javax.swing.JButton btn_consultarAcesso;
    private javax.swing.JButton btn_consultarEquipamento;
    private javax.swing.JButton btn_consultarPessoa;
    private javax.swing.JButton btn_consultarSecretaria;
    private javax.swing.JButton btn_consultarSetor;
    private javax.swing.JButton btn_consultarSistema;
    private javax.swing.JButton btn_consultarTipoEquipamento;
    private javax.swing.JMenu mb_cadastrar;
    private javax.swing.JMenu mb_consultar;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem mi_cadAcesso;
    private javax.swing.JMenuItem mi_cadEquipamento;
    private javax.swing.JMenuItem mi_cadPessoa;
    private javax.swing.JMenuItem mi_cadSecretaria;
    private javax.swing.JMenuItem mi_cadSetor;
    private javax.swing.JMenuItem mi_cadSistema;
    private javax.swing.JMenuItem mi_cadTipoEquipamento;
    private javax.swing.JMenuItem mi_conAcesso;
    private javax.swing.JMenuItem mi_conEquipamento;
    private javax.swing.JMenuItem mi_conPessoa;
    private javax.swing.JMenuItem mi_conSecretaria;
    private javax.swing.JMenuItem mi_conSetor;
    private javax.swing.JMenuItem mi_conSistema;
    private javax.swing.JMenuItem mi_conTipoEquipamento;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
