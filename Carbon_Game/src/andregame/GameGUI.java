/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package andregame;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class GameGUI extends javax.swing.JFrame {
    GamePopulation gpop; 
    GameEngine engine;
    int score;
    int health;
    
    
        
    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
        gpop = GamePopulation.getInstance();
        messageArea.setVisible(false);
        scoreLBL.setVisible(false);
        lowerBTN.setVisible(false);
        question.setVisible(false);
        healthBar.setVisible(false);
        livesLBL.setVisible(false);
        higherBTN.setVisible(false);
        messageAreaText.setVisible(false);
        nameTF.setVisible(false);
        submitNameBTN.setVisible(false);
        nextBTN.setVisible(false);
        
        engine = new GameEngine();
        health = 0;
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
        higherBTN = new javax.swing.JButton();
        scoreLBL = new javax.swing.JLabel();
        messageArea = new javax.swing.JScrollPane();
        messageAreaText = new javax.swing.JTextArea();
        instructionsTA = new javax.swing.JScrollPane();
        instructionsTAtext = new javax.swing.JTextArea();
        gameStartBTN = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        submitNameBTN = new javax.swing.JButton();
        currentScoreLBL = new javax.swing.JLabel();
        nextBTN = new javax.swing.JButton();
        lowerBTN = new javax.swing.JButton();
        question = new javax.swing.JScrollPane();
        showQuestion = new javax.swing.JTextArea();
        livesLBL = new javax.swing.JLabel();
        healthBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(691, 360));
        setPreferredSize(new java.awt.Dimension(691, 360));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBTN.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        backBTN.setForeground(new java.awt.Color(255, 51, 51));
        backBTN.setText("Exit");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 90, 40));

        higherBTN.setBackground(new java.awt.Color(255, 51, 51));
        higherBTN.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        higherBTN.setText("HIGHER");
        higherBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higherBTNActionPerformed(evt);
            }
        });
        getContentPane().add(higherBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 154, 40));

        scoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        scoreLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLBL.setText("Your score was 10/10 congrats!");
        getContentPane().add(scoreLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 680, -1));

        messageAreaText.setEditable(false);
        messageAreaText.setColumns(20);
        messageAreaText.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        messageAreaText.setLineWrap(true);
        messageAreaText.setRows(5);
        messageArea.setViewportView(messageAreaText);

        getContentPane().add(messageArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 690, 119));

        instructionsTAtext.setEditable(false);
        instructionsTAtext.setColumns(20);
        instructionsTAtext.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        instructionsTAtext.setRows(5);
        instructionsTAtext.setText("Instructions: \nFirst, read the question carefully.\nSecond, try to guess a value, the range is between 0 and 100 kg. \nThird, click the submit button and see the results!\n");
        instructionsTA.setViewportView(instructionsTAtext);

        getContentPane().add(instructionsTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 680, 110));

        gameStartBTN.setBackground(new java.awt.Color(255, 51, 51));
        gameStartBTN.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        gameStartBTN.setForeground(new java.awt.Color(255, 255, 255));
        gameStartBTN.setText("START GAME!");
        gameStartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameStartBTNActionPerformed(evt);
            }
        });
        getContentPane().add(gameStartBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 185, 47));

        nameTF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        getContentPane().add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 170, 40));

        submitNameBTN.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        submitNameBTN.setText("Submit name");
        submitNameBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitNameBTNActionPerformed(evt);
            }
        });
        getContentPane().add(submitNameBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, 40));

        currentScoreLBL.setBackground(new java.awt.Color(255, 255, 0));
        currentScoreLBL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        currentScoreLBL.setText("Score: 0");
        getContentPane().add(currentScoreLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        nextBTN.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nextBTN.setText("Next ");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });
        getContentPane().add(nextBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 160, 50));

        lowerBTN.setBackground(new java.awt.Color(51, 255, 51));
        lowerBTN.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lowerBTN.setText("LOWER");
        lowerBTN.setMaximumSize(new java.awt.Dimension(98, 34));
        lowerBTN.setMinimumSize(new java.awt.Dimension(98, 34));
        lowerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerBTNActionPerformed(evt);
            }
        });
        getContentPane().add(lowerBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 40));

        question.setBackground(new java.awt.Color(255, 255, 255));

        showQuestion.setEditable(false);
        showQuestion.setColumns(20);
        showQuestion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        showQuestion.setLineWrap(true);
        showQuestion.setRows(5);
        question.setViewportView(showQuestion);

        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 680, 70));

        livesLBL.setBackground(new java.awt.Color(255, 51, 51));
        livesLBL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        livesLBL.setText("Health:");
        getContentPane().add(livesLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 60, 30));

        healthBar.setBackground(new java.awt.Color(255, 0, 0));
        healthBar.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(healthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameStartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameStartBTNActionPerformed
        // TODO add your handling code here:
        messageArea.setVisible(true);
        scoreLBL.setVisible(false);
        question.setVisible(true);
        lowerBTN.setVisible(true);
        higherBTN.setVisible(true);
        messageAreaText.setVisible(true);
        healthBar.setVisible(true);
        livesLBL.setVisible(true);
        gameStartBTN.setVisible(false);
        instructionsTA.setVisible(false);
        instructionsTAtext.setVisible(false);
        messageAreaText.setText("");
        showQuestion.setText(engine.getNextQuestion());
    }//GEN-LAST:event_gameStartBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
//        CleanEnergyGUI mainGUI = new CleanEnergyGUI(); 
//        mainGUI.setVisible(true); 
//        this.setVisible(false); 
//        this.dispose();
        System.exit(1);
        //RETRUN TO BACK BUTTON STATE AFTER REFACTOR


//UN-COMMENT PART WHEN REFACTORED TO MAIN PROJECT.
    }//GEN-LAST:event_backBTNActionPerformed

    private void higherBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higherBTNActionPerformed
        // TODO add your handling code here:
        boolean value = true;
        String feedBack = engine.submitAnswer(value);
        if(score != engine.getScore()){
            messageArea.setBackground(Color.green);
            score++;
            currentScoreLBL.setText("Score: "+ score);
        }else{
            messageArea.setBackground(Color.red);
            health+=20;
            healthBar.setValue(health);
        }
        messageAreaText.setText(feedBack);
        nextBTN.setVisible(true);
        higherBTN.setVisible(false);
        lowerBTN.setVisible(false);
        
        
    }//GEN-LAST:event_higherBTNActionPerformed

    private void submitNameBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitNameBTNActionPerformed
        // TODO add your handling code here:
        String name = nameTF.getText();
        engine.addUser(name, score);
        String highScores = engine.getHighScore();
        JOptionPane.showMessageDialog(null, highScores);
        JOptionPane.showMessageDialog(null, "Shocking, isn’t it? The carbon footprint of everyday actions adds up fast. \nBut here's the good news—you have the power to make a difference. \nEvery small change counts. Choose wisely, act responsibly, and together, \nwe can create a more sustainable future.");
        System.exit(1);

    }//GEN-LAST:event_submitNameBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        // TODO add your handling code here:
        showQuestion.setText(engine.getNextQuestion());
        messageAreaText.setText("");
        nextBTN.setVisible(false);
        //To do whenever the game has been finished
        if(engine.isQuizOver()){
            scoreLBL.setVisible(true);
            question.setVisible(true);
            higherBTN.setVisible(false);
            nameTF.setVisible(true);
            submitNameBTN.setVisible(true);
            messageArea.setVisible(false);
            currentScoreLBL.setVisible(false);
            scoreLBL.setText("Your final score was: "+ engine.getScore());
            backBTN.setVisible(false);
            if(engine.getHealth() <= 0){
                showQuestion.append(" \nYou ran out of health!");
            }else{
                showQuestion.append(" \nYou reached the end of the game!");
            }
        }else{
            higherBTN.setVisible(true);
            lowerBTN.setVisible(true);
        }
       
    }//GEN-LAST:event_nextBTNActionPerformed

    private void lowerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerBTNActionPerformed
        // TODO add your handling code here:
        boolean value = false;
        String feedBack = engine.submitAnswer(value);
        if(score != engine.getScore()){
            messageArea.setBackground(Color.green);
            score++;
            currentScoreLBL.setText("Score: "+ score);
        }else{
            messageArea.setBackground(Color.red);
            health+=20;
            healthBar.setValue(health);
        }
        messageAreaText.setText(feedBack);
        nextBTN.setVisible(true);
        higherBTN.setVisible(false);
        lowerBTN.setVisible(false);
    }//GEN-LAST:event_lowerBTNActionPerformed

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
    private javax.swing.JLabel currentScoreLBL;
    private javax.swing.JButton gameStartBTN;
    private javax.swing.JProgressBar healthBar;
    private javax.swing.JButton higherBTN;
    private javax.swing.JScrollPane instructionsTA;
    private javax.swing.JTextArea instructionsTAtext;
    private javax.swing.JLabel livesLBL;
    private javax.swing.JButton lowerBTN;
    private javax.swing.JScrollPane messageArea;
    private javax.swing.JTextArea messageAreaText;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBTN;
    private javax.swing.JScrollPane question;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JTextArea showQuestion;
    private javax.swing.JButton submitNameBTN;
    // End of variables declaration//GEN-END:variables
}
