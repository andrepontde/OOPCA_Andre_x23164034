/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package andregame;

import java.awt.Color;

/**
 *
 * @author andre
 */
public class GameGUI extends javax.swing.JFrame {
    GamePopulation gpop = GamePopulation.getInstance();
    GameEngine engine;
    int score;
    
    
        
    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
        inputBox.setVisible(false);
        messageArea.setVisible(false);
        scoreLBL.setVisible(false);
        showQuestion.setVisible(false);
        submitBTN.setVisible(false);
        messageAreaText.setVisible(false);
        engine = new GameEngine();
        score = engine.getScore();
        
        //Some items are hidden for a cleaner GUI
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBTN = new javax.swing.JButton();
        showQuestion = new javax.swing.JLabel();
        inputBox = new javax.swing.JTextField();
        submitBTN = new javax.swing.JButton();
        scoreLBL = new javax.swing.JLabel();
        messageArea = new javax.swing.JScrollPane();
        messageAreaText = new javax.swing.JTextArea();
        instructionsTA = new javax.swing.JScrollPane();
        instructionsTAtext = new javax.swing.JTextArea();
        gameStartBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(611, 377));
        setResizable(false);

        backBTN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        backBTN.setForeground(new java.awt.Color(255, 51, 51));
        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

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
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        scoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        scoreLBL.setText("Your score was 10/10 congrats!");

        messageAreaText.setColumns(20);
        messageAreaText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        messageAreaText.setRows(5);
        messageArea.setViewportView(messageAreaText);

        instructionsTAtext.setColumns(20);
        instructionsTAtext.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        instructionsTAtext.setRows(5);
        instructionsTAtext.setText("These are the instructions: \nFirst, read the question carefully.\nSecond, try to guess a value, the range is between 100 and 1000 kg. \nclick the submit button and see the results!\n");
        instructionsTA.setViewportView(instructionsTAtext);

        gameStartBTN.setBackground(new java.awt.Color(255, 51, 51));
        gameStartBTN.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        gameStartBTN.setForeground(new java.awt.Color(255, 255, 255));
        gameStartBTN.setText("START GAME!");
        gameStartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameStartBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(showQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(gameStartBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(instructionsTA, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageArea)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(scoreLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showQuestion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameStartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageArea, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLBL)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBTN)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameStartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameStartBTNActionPerformed
        // TODO add your handling code here:
        inputBox.setVisible(true);
        messageArea.setVisible(true);
        scoreLBL.setVisible(false);
        showQuestion.setVisible(true);
        submitBTN.setVisible(true);
        messageAreaText.setVisible(true);
        gameStartBTN.setVisible(false);
        instructionsTA.setVisible(false);
        instructionsTAtext.setVisible(false);
        messageAreaText.setText("");
        showQuestion.setText(engine.getNextQuestion());
    }//GEN-LAST:event_gameStartBTNActionPerformed

    private void inputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBoxActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        CleanEnergyGUI mainGUI = new CleanEnergyGUI(); 
        mainGUI.setVisible(true); 
        this.setVisible(false); 
        this.dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        // TODO add your handling code here:
        String input = inputBox.getText();
        
        //When an answer is submitted, it tries to parse it to an int
        //otherwise it returns an error message and does not proceeds to the next level.
        try {
            int value = Integer.parseInt(input);
            String feedBack = engine.submitAnswer(value);
            if(score != engine.getScore()){
                
                messageArea.setBackground(Color.green);
                score++;
            }else{
                messageArea.setBackground(Color.red);
            }
            messageAreaText.setText(feedBack);
            
            //To do whenever the game has been finished
            if(engine.isQuizOver()){
                inputBox.setVisible(false);
                scoreLBL.setVisible(true);
                showQuestion.setVisible(true);
                submitBTN.setVisible(false);
                scoreLBL.setText("Your final score was: "+ engine.getScore());
                
                //Implement highScore stuff here
            }
            showQuestion.setText(engine.getNextQuestion());
            
        } catch (NumberFormatException ex) {
            messageAreaText.setText("Invalid input! Please enter an integer.");
        }
        
        
    }//GEN-LAST:event_submitBTNActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
  
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton gameStartBTN;
    private javax.swing.JTextField inputBox;
    private javax.swing.JScrollPane instructionsTA;
    private javax.swing.JTextArea instructionsTAtext;
    private javax.swing.JScrollPane messageArea;
    private javax.swing.JTextArea messageAreaText;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JLabel showQuestion;
    private javax.swing.JButton submitBTN;
    // End of variables declaration//GEN-END:variables
}
