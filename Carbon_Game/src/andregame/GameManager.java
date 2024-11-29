/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andregame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author andre
 */
public class GameManager {
    private List<Question> questions;
    private List<User> users;
    private String message;
    private int grade;
    private File f;
    private String name;
    private int score;
    
    

    //Constructor
    public GameManager() {
        questions = new ArrayList<>();
        users = new ArrayList<>();
        loadData();
        //The game manager automatically retrieves the questions array
        f = new File("UserData.dat");
    }
    
    
    public void loadData(){
        FileInputStream fStream;
        ObjectInputStream oStream;
        

        //This method opens the QuestionData.dat file, and assigns the value to
        //an array of objects called question, it allso has exception handling
        
        
        try{
            fStream = new FileInputStream("QuestionData.dat");
            oStream = new ObjectInputStream(fStream);
            
            questions = (ArrayList<Question>)oStream.readObject();
            
            //Randomize question objects.
            Collections.shuffle(questions);
            oStream.close();
            System.out.println("Questions were fetched by the Game manager correctly");
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Unable to fetch questions, error:"+ e);
        }
        
        //Here it uses the UserData File to load the previous user data if it exists.
        
        try{
            fStream = new FileInputStream("UserData.dat");
            oStream = new ObjectInputStream(fStream);
            
            users = (ArrayList<User>)oStream.readObject();
            oStream.close();
            System.out.println("User data fetched correctly");
        }catch(IOException | ClassNotFoundException e){
            System.out.println("No user data available");
        }
    }
    
    
    //The AddUser function adds the user to a users lists and then appends the whole list to the UserData file to store it, this only 
    //happens when a game session is finished
    public void addUser(String name, int score){
        this.name = name;
        this.score = score;

        User tempUser = new User(name, score);
        
        
        users.add(tempUser);
        
        try{
            FileOutputStream fStream;
            ObjectOutputStream oStream;
            
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(users);
            oStream.close();
            System.out.println("User added succesfully!\n");
            
            //Added some exception handling 
        }catch(IOException e){
            System.out.println("User was not saved");
        }
    }
    

    //The getHighScore function stores the data in order of score to a new list to later display it on a JOptionPane panel 
    public String getHighScore(){
        User tempUser;
        String highScores = "The highest scores are: \n";
        List<User> tempUserList = new ArrayList<>();
        
        //If the user list has more than 1 user, order them by the greatest score to a temporary user list.
        if (users.size() > 1){
            for (User user : users) {
                boolean inserted = false;

                for (int i = 0; i < tempUserList.size(); i++) {
                    if (user.getScore() > tempUserList.get(i).getScore()) {
                        tempUserList.add(i, user);
                        inserted = true;
                        break;
                    }
                }
                if (!inserted) {
                    tempUserList.add(user);
                }
            }         
            
            //After the list has been ordered, append it to a string to diplay it on the JOptionPane panel
            for (int i = 0; i< tempUserList.size(); i++){
                User innerTempUser = tempUserList.get(i);
                highScores = highScores + " Place: "+(i+1)+ " Name: "+ innerTempUser.getName()+ " Score: " + innerTempUser.getScore()+"\n";
            }

        }else{
            tempUser = users.get(0);
            highScores = "The only high score is: "+ " Name: "+ tempUser.getName()+ " Score: " + tempUser.getScore()+"\n";
        }
        return highScores;
        
       
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
