/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andregame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class GameManager {
    private List<Question> questions;
    private String message;
    private int grade;
    
    private void populateQuestions() {
        questions.add(new Question("Que pedo",15, "BUENO", "Malo"));
         // Add more questions up to 10 as needed
    }

    public GameManager() {
        questions = new ArrayList<>();
        populateQuestions();

    }
    
    
    
    public void setGrade(int score) {
        this.grade = score;
    }
    
    public void computeGrade(int score) {
        if (score >= 8) {
            message = "Excellent! You scored " + score + " out of 10.";
        } else if (score >= 5) {
            message = "Good effort! You scored " + score + " out of 10.";
        } else {
            message = "Keep trying! You scored " + score + " out of 10.";
        }
    }
    
        public String getMessage() {
        return message;
    }

    

    
    public Question getQuestion(int currentIndex){
        return questions.get(currentIndex);
    }
    
}
