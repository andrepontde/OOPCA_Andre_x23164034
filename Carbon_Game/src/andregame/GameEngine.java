/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andregame;

/**
 *
 * @author andre
 */
public class GameEngine extends GameManager{
    private int currentIndex;
    private int score;
    private int health;
    private int qnumber;

    
    
    //The pourpose of the game engine class is to simplify the use of all the other classes
    //as much as possible when implementing it to the GUI, it inherits from GameManager 
    //to have access to all of the question objects in the array as well as other valuable information.
    
    //It is in chatge of the logic of the game.
    
    public GameEngine() {
        currentIndex = 0;
        score = 0;
        qnumber = 0;
        health = 5;
    }

    public String startGame() {
        return getNextQuestion();
    }
    
    
    //Compute methods
    public String submitAnswer(boolean answer) {
        qnumber++;
        Question currentQuestion = super.getQuestion(currentIndex);
        boolean isCorrect = currentQuestion.computeInfo(answer);
        if (isCorrect) {
            score++;
        }else{
            health= health - 1;
            
        }
        currentIndex++;
        return currentQuestion.getFeedback(isCorrect);
    }
    
    //Finish the game if the user ran out of gealth or if it is the last level.
    public boolean isQuizOver() {
        if(health <= 0){
            return true;
        }else {
            return currentIndex >= super.getSize();
        }
        
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getQnumber(){
        return qnumber;
    }
    
    
    //Getters
    public String getNextQuestion() {
        if (isQuizOver()) {
            super.setGrade(score, qnumber);
            super.computeGrade();
            return super.getMessage();
        }
        return super.getQuestion(currentIndex).getQuestionText();
    }

    public int getScore() {
        return score;
    }
}
