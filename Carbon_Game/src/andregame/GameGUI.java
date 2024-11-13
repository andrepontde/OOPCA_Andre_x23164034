/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package andregame;

/**
 *
 * @author andre
 */
public class GameGUI extends javax.swing.JFrame {

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
        inputBox.setVisible(false);
        messageArea.setVisible(false);
        scoreLBL.setVisible(false);
        showInfo.setVisible(false);
        showQuestion.setVisible(false);
        submitBTN.setVisible(false);
        messageAreaText.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        gameStartBTN = new javax.swing.JButton();
        instructionsTA = new javax.swing.JScrollPane();
        instructionsTAtext = new javax.swing.JTextArea();
        showQuestion = new javax.swing.JLabel();
        inputBox = new javax.swing.JTextField();
        submitBTN = new javax.swing.JButton();
        messageArea = new javax.swing.JScrollPane();
        messageAreaText = new javax.swing.JTextArea();
        showInfo = new javax.swing.JLabel();
        scoreLBL = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameStartBTN.setBackground(new java.awt.Color(255, 51, 51));
        gameStartBTN.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        gameStartBTN.setForeground(new java.awt.Color(255, 255, 255));
        gameStartBTN.setText("START GAME!");
        gameStartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameStartBTNActionPerformed(evt);
            }
        });

        instructionsTAtext.setColumns(20);
        instructionsTAtext.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        instructionsTAtext.setRows(5);
        instructionsTAtext.setText("These are the instructions: \nFirst read the question carefully.\nSecond: try to guess a value, the range is between 10000 and 100000. \nclick the submit button and see the results!\n");
        instructionsTA.setViewportView(instructionsTAtext);

        showQuestion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        showQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showQuestion.setText("Question example: What is the carbon footprint of the average adult? per year?");

        inputBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        inputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBoxActionPerformed(evt);
            }
        });

        submitBTN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        submitBTN.setText("Submit");

        messageAreaText.setColumns(20);
        messageAreaText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        messageAreaText.setRows(5);
        messageAreaText.setText("The feedback for your answer will be displayed here");
        messageArea.setViewportView(messageAreaText);

        showInfo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        showInfo.setText("Your answer will be displayed here!");

        scoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        scoreLBL.setText("Your score was 10/10 congrats!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageArea, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(instructionsTA, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(scoreLBL)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showQuestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(gameStartBTN)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(instructionsTA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showQuestion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBTN))
                .addGap(6, 6, 6)
                .addComponent(gameStartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageArea, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scoreLBL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameStartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameStartBTNActionPerformed
        // TODO add your handling code here:
        inputBox.setVisible(true);
        messageArea.setVisible(true);
        scoreLBL.setVisible(true);
        showInfo.setVisible(true);
        showQuestion.setVisible(true);
        submitBTN.setVisible(true);
        messageAreaText.setVisible(true);
        gameStartBTN.setVisible(false);
        instructionsTA.setVisible(false);
        instructionsTAtext.setVisible(false);
        
    }//GEN-LAST:event_gameStartBTNActionPerformed

    private void inputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBoxActionPerformed

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gameStartBTN;
    private javax.swing.JTextField inputBox;
    private javax.swing.JScrollPane instructionsTA;
    private javax.swing.JTextArea instructionsTAtext;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane messageArea;
    private javax.swing.JTextArea messageAreaText;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JLabel showInfo;
    private javax.swing.JLabel showQuestion;
    private javax.swing.JButton submitBTN;
    // End of variables declaration//GEN-END:variables
}