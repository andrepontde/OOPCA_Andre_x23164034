/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andregame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class GameEngine {
    private int currentIndex;
    private int score;
    private GameManager manager;

    public GameEngine() {
        currentIndex = 0;
        score = 0;
        manager = new GameManager();
    }



    public String startGame() {
        return getNextQuestion();
    }

    public String submitAnswer(int answer) {
        Question currentQuestion = manager.getQuestion(currentIndex);
        boolean isCorrect = currentQuestion.computeInfo(answer);
        if (isCorrect) {
            score++;
        }
        currentIndex++;
        return currentQuestion.getFeedback(isCorrect);
    }

    public boolean isQuizOver() {
        return currentIndex >= 10;
        //Aqui poner mas o menos hardcoded de lka cantidad de preguntas despues
    }

    public String getNextQuestion() {
        if (isQuizOver()) {
            manager.setGrade(score);
            manager.computeGrade(score);
            return manager.getMessage();
        }
        return manager.getQuestion(currentIndex).getQuestionText();
    }

    public int getScore() {
        return score;
    }
}
