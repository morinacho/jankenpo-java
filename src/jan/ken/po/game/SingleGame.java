/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan.ken.po.game;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nacho
 */
public class SingleGame extends javax.swing.JFrame {
    private String ip;
    private int selectPlayer1 = 0,
                selectPlayer2 = -1,
                mode          = 0, //Mode = 0 : player vs cpu | Mode = 1 Server mode | Mode = 2 Client mode
                port; 
    private Logic logic = new Logic();
    private ServerGame sg;
    private ClientGame cl;
    /**
     * Creates new form SingleGame
     */
    public SingleGame() {
        initComponents();
        this.player2.setText("CPU IA");
        this.janR.setEnabled(false);
        this.kenR.setEnabled(false);
        this.ponR.setEnabled(false); 
    }
    
    public SingleGame(int port){
        // Mode 1 Server
        initComponents(); 
        this.mode = 1;
        this.port = port;
        this.player1.setText("Server");
        this.janR.setEnabled(false);
        this.kenR.setEnabled(false);
        this.ponR.setEnabled(false); 
        
        sg = new ServerGame();
        sg.serverConect(port);
    }
    
    public SingleGame(String ip, int port){
        // Mode 1 Client
        initComponents();
        this.mode = 2;
        this.port = port;
        this.ip   = ip;
        this.player2.setText("Client");
        this.janL.setEnabled(false);
        this.kenL.setEnabled(false);
        this.ponL.setEnabled(false);
        
        cl = new ClientGame();
        cl.clientConect(ip,port);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        janL = new javax.swing.JToggleButton();
        janR = new javax.swing.JToggleButton();
        kenR = new javax.swing.JToggleButton();
        ponR = new javax.swing.JToggleButton();
        kenL = new javax.swing.JToggleButton();
        ponL = new javax.swing.JToggleButton();
        roundLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        scoreLabel2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        round = new javax.swing.JLabel();
        point1 = new javax.swing.JLabel();
        point2 = new javax.swing.JLabel();
        select1 = new javax.swing.JLabel();
        select2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StarGame");
        setType(java.awt.Window.Type.UTILITY);

        janL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jan-l.png"))); // NOI18N
        janL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janLActionPerformed(evt);
            }
        });

        janR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jan-r.png"))); // NOI18N
        janR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janRActionPerformed(evt);
            }
        });

        kenR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ken-r.png"))); // NOI18N
        kenR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenRActionPerformed(evt);
            }
        });

        ponR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pon-r.png"))); // NOI18N
        ponR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponRActionPerformed(evt);
            }
        });

        kenL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ken-l.png"))); // NOI18N
        kenL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenLActionPerformed(evt);
            }
        });

        ponL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pon-l.png"))); // NOI18N
        ponL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponLActionPerformed(evt);
            }
        });

        roundLabel.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        roundLabel.setText("ROUND");

        scoreLabel.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("SCORE");

        scoreLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        scoreLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel2.setText("SCORE");

        player1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1.setText("Player 1");

        player2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2.setText("Player 2");

        play.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        play.setText("Play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        round.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        round.setText("1");

        point1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        point1.setText("0");

        point2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        point2.setText("0");

        select1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nonblue.png"))); // NOI18N

        select2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nonred.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/vs.png"))); // NOI18N

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(point1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(janL)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ponL, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(kenL)))
                                        .addGap(18, 18, 18)
                                        .addComponent(select1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(select2)
                                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(round)
                        .addGap(108, 108, 108)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(janR))
                    .addComponent(kenR)
                    .addComponent(ponR)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(point2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roundLabel)
                            .addComponent(round))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player1)
                            .addComponent(player2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(janL)
                            .addComponent(janR))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(kenL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ponL))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kenR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ponR))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(select1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jLabel3))
                        .addComponent(select2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(point2)
                    .addComponent(scoreLabel2)
                    .addComponent(scoreLabel)
                    .addComponent(point1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ponLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponLActionPerformed
        this.selectPlayer1 = 3;
    }//GEN-LAST:event_ponLActionPerformed

    private void kenLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenLActionPerformed
        this.selectPlayer1 = 2;
    }//GEN-LAST:event_kenLActionPerformed

    private void janLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janLActionPerformed
        this.selectPlayer1 = 1;
    }//GEN-LAST:event_janLActionPerformed

    private void janRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janRActionPerformed
        this.selectPlayer2 = 1;
    }//GEN-LAST:event_janRActionPerformed

    private void kenRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenRActionPerformed
        this.selectPlayer2 = 2;
    }//GEN-LAST:event_kenRActionPerformed

    private void ponRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponRActionPerformed
        this.selectPlayer2 = 3;
    }//GEN-LAST:event_ponRActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
         
            // TODO add your handling code here:
            switch(this.mode){
                case 0:
                    this.selectPlayer2 = (int) (Math.random() * 3) + 1;
                    break;                    
                case 1:                     
                    sg.sendMessage(this.selectPlayer1);
                    this.selectPlayer2 = sg.readMessage();                     
                    break;
                case 2:
                    cl.sendMessage(this.selectPlayer2);
                    this.selectPlayer1 = cl.readMessage();
                    break;
            }          
            logic.start(1, this.selectPlayer1, 2, this.selectPlayer2);
            this.point1.setText(Integer.toString(logic.getScore(1)));
            this.point2.setText(Integer.toString(logic.getScore(2)));
            select1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/"+ this.selectPlayer1 +"-l.png")));
            select2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/"+ this.selectPlayer2 +"-r.png")));
            this.round.setText(Integer.toString(logic.getRound()));
       
    }//GEN-LAST:event_playActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        try {
            cl.clientClose();
            sg.serverClose();
        } catch (IOException ex) {
            Logger.getLogger(SingleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(SingleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingleGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton janL;
    private javax.swing.JToggleButton janR;
    private javax.swing.JToggleButton kenL;
    private javax.swing.JToggleButton kenR;
    private javax.swing.JButton play;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel point1;
    private javax.swing.JLabel point2;
    private javax.swing.JToggleButton ponL;
    private javax.swing.JToggleButton ponR;
    private javax.swing.JLabel round;
    private javax.swing.JLabel roundLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreLabel2;
    private javax.swing.JLabel select1;
    private javax.swing.JLabel select2;
    // End of variables declaration//GEN-END:variables
}
