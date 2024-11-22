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

/**
 *
 * @author andre
 */
public class GamePopulation {
    private ArrayList <Question> qlist;
    private File f;
    
    //This class is used to create a file that contains the array with the Question object
    //It is then loaded in the game manager so each question is able to be manipulated individually
    //It uses the Singleton design to avoid erros when writting in the file multiple times
    
    
    //Constructors
    private GamePopulation(){
        qlist = new ArrayList<>();
        f = new File("QuestionData.dat"); 
        populate();
        //When calles, the entire code runs and populates all of the question objects automatically
    }
    
    
    private static GamePopulation INSTANCE = new GamePopulation();
    
    public static GamePopulation getInstance(){
        return INSTANCE;
    }
    
    private void populate(){
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 kilogram of beef?", 
            270, 
            "Correct! Producing beef emits around 270 kg of CO2 due to methane emissions and land use.", 
            "Wrong! Producing beef has a large carbon footprint because of methane and high resource usage."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by driving a gasoline car for 1,000 miles?", 
            240, 
            "Correct! On average, driving 1,000 miles emits around 240 kg of CO2.", 
            "Wrong! Gasoline cars emit significant CO2 due to fossil fuel combustion."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 does an average flight emit per passenger for 1,000 miles?", 
            250, 
            "Correct! Flights emit approximately 250 kg of CO2 per passenger for 1,000 miles.", 
            "Wrong! Air travel has one of the highest carbon footprints per mile."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 does heating a home with gas for one month emit?", 
            200, 
            "Correct! Heating a home with gas for a month emits around 200 kg of CO2.", 
            "Wrong! Gas heating contributes significantly to household CO2 emissions."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by using a washing machine for a year?", 
            175, 
            "Correct! Running a washing machine for a year emits about 175 kg of CO2.", 
            "Wrong! Washing machines consume energy, contributing to CO2 emissions."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 does producing 1 kilogram of cheese emit?", 
            130, 
            "Correct! Producing cheese emits about 130 kg of CO2 due to dairy farming.", 
            "Wrong! Cheese has a significant carbon footprint, though lower than beef."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by eating 1 kilogram of chocolate?", 
            190, 
            "Correct! Chocolate production emits about 190 kg of CO2, mostly from cocoa farming.", 
            "Wrong! Chocolate production has a high footprint due to processing and resource use."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by heating a swimming pool for a year?", 
            800, 
            "Correct! Heating a swimming pool for a year emits around 800 kg of CO2.", 
            "Wrong! Pool heating consumes significant energy, increasing CO2 emissions."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to manufacture a car?", 
            900, 
            "Correct! Manufacturing a car emits about 900 kg of CO2, primarily due to material extraction and assembly.", 
            "Wrong! Car manufacturing has a high carbon footprint due to resource use and energy demands."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are saved by recycling 1 ton of aluminum?", 
            1000, 
            "Correct! Recycling 1 ton of aluminum saves about 1,000 kg of CO2 emissions.", 
            "Wrong! Recycling aluminum reduces emissions significantly by saving energy in production."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce a kilogram of rice?", 
            400, 
            "Correct! Rice production emits around 400 kg of CO2 per kilogram, primarily from methane.", 
            "Wrong! Rice paddies produce methane, contributing to greenhouse gas emissions."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by using an air conditioner for one summer?", 
            500, 
            "Correct! Using an air conditioner for one summer emits about 500 kg of CO2.", 
            "Wrong! Air conditioning consumes large amounts of electricity, increasing CO2 emissions."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by taking 10 showers with hot water?", 
            100, 
            "Correct! Taking 10 hot showers emits around 100 kg of CO2, depending on energy sources.", 
            "Wrong! Heating water for showers contributes significantly to emissions."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 liter of milk?", 
            120, 
            "Correct! Producing milk emits around 120 kg of CO2 due to dairy farming.", 
            "Wrong! Milk production contributes to emissions, though lower than meat."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 kilogram of bread?", 
            150, 
            "Correct! Producing bread emits about 150 kg of CO2, primarily from farming and baking.", 
            "Wrong! Bread production involves emissions from farming and energy use in baking."
        ));
        
        try{
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(qlist);
            oStream.close();
            System.out.println("\nQuestions created succesfully!");
            
            //Added some exception handling 
        }catch(IOException e){
            System.out.println("Question Array not saved correctly");
        }
    }
       
    //This function is for debbuging only
    public void printAll(){
        for (Question temp: qlist){
            System.out.println("\n" + temp.toString());
        }
        
    }
}
