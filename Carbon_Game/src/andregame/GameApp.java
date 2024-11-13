/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andregame;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class GameApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GameGUI appGUI = new GameGUI();
        appGUI.setVisible(true);
        
        Scanner scanner = new Scanner(System.in);
        GameEngine gameController = new GameEngine();


        while (!gameController.isQuizOver()) {
            System.out.println(gameController.getNextQuestion());
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            System.out.println(gameController.submitAnswer(answer));
        }

        System.out.println("Quiz over! " + gameController.getNextQuestion()); // Final score or grade
    }
    
}
