/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andregame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
    

    //Constructor
    public GameManager() {
        questions = new ArrayList<>();
        loadQuestions();
        //The game manager automatically retrieves the questions array
    }
    
    public void loadQuestions(){
        FileInputStream fStream;
        ObjectInputStream oStream;
        

        //This method opens the QuestionData.dat file, and assigns the value to
        //an array of objects called question, it allso has exception handling
        
        
        try{
            fStream = new FileInputStream("QuestionData.dat");
            oStream = new ObjectInputStream(fStream);
            
            questions = (ArrayList<Question>)oStream.readObject();
            oStream.close();
            System.out.println("Questions were fetched by the Game manager correctly");
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Unable to fetch questions, error:"+ e);
        }
    }
    
    //Setters
    public void setGrade(int score) {
        this.grade = score;
    }
    
    
    //Compute methods
    public void computeGrade() {
        if (grade >= 8) {
            message = "Excellent! You scored " + grade + " out of 10.";
        } else if (grade >= 5) {
            message = "Good effort! You scored " + grade + " out of 10.";
        } else {
            message = "Keep trying! You scored " + grade + " out of 10.";
        }
    }
    
    //Getters
    public String getMessage() {
        return message;
    }

    public int getSize(){
        return questions.size();
    }

    
    public Question getQuestion(int currentIndex){
        return questions.get(currentIndex);
    }
    
}
