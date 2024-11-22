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
    
    
    //The pourpose of the game engine class is to simplify the use of all the other classes
    //as much as possible when implementing it to the GUI, it inherits from GameManager 
    //to have access to all of the question objects in the array
    
    public GameEngine() {
        currentIndex = 0;
        score = 0;
    }

    public String startGame() {
        return getNextQuestion();
    }
    
    
    //Compute methods
    public String submitAnswer(int answer) {
        Question currentQuestion = super.getQuestion(currentIndex);
        boolean isCorrect = currentQuestion.computeInfo(answer);
        if (isCorrect) {
            score++;
        }
        currentIndex++;
        return currentQuestion.getFeedback(isCorrect);
    }

    public boolean isQuizOver() {
        return currentIndex >= super.getSize();
    }
    
    
    //Getters
    public String getNextQuestion() {
        if (isQuizOver()) {
            super.setGrade(score);
            super.computeGrade();
            return super.getMessage();
        }
        return super.getQuestion(currentIndex).getQuestionText();
    }

    public int getScore() {
        return score;
    }
}
