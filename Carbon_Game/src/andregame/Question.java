/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andregame;

/**
 *
 * @author andre
 */
public class Question {
    private String questionText;
    private int correctAnswer;
    private String correctMessage;
    private String incorrectMessage;

    public Question(String questionText, int correctAnswer, String correctMessage, String incorrectMessage) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.correctMessage = correctMessage;
        this.incorrectMessage = incorrectMessage;
    }

    public boolean computeInfo(int answer) {
        return answer == correctAnswer;
    }

    public String getFeedback(boolean result) {
        if (result){
            return correctMessage;
        }else{
            return incorrectMessage;
        }            
    }

    public String getQuestionText() {
        return questionText;
    }
}
