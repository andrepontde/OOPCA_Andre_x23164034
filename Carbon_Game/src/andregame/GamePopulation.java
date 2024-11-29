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

/**
 *
 * @author andre
 */
public class GamePopulation {
    private ArrayList <Question> qlist;
    private File f;
    
    //This class is used to create a file that contains the array with the Question objects
    //It is then loaded in the game manager so each question is able to be manipulated individually
    //It uses the Singleton design to avoid erros when writting in the file multiple times
    
    //This class is a Developer tool, it could be used just to add, delete or modify questions, but the QuestionsData.dat 
    //file would be enough to run the rest of the code. 
    
    
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
            "How many kilograms of CO2 are emitted to produce 1 kilogram of chicken?", 
            6, 
            "Correct! Producing 1 kg of chicken emits around 6 kg of CO2 due to feed production and farming.", 
            "Wrong! Producing 1 kg of chicken emits about 6 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 kilogram of cheese?", 
            13, 
            "Correct! Producing 1 kg of cheese emits about 13 kg of CO2 due to dairy farming and processing.", 
            "Wrong! Producing 1 kg of cheese emits around 13 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by driving an electric car for 100 miles?", 
            15, 
            "Correct! Driving an electric car for 100 miles emits about 15 kg of CO2, depending on the energy source.", 
            "Wrong! Driving an electric car for 100 miles emits around 15 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 kilogram of chocolate?", 
            18, 
            "Correct! Producing 1 kg of chocolate emits around 18 kg of CO2 due to intensive farming and processing.", 
            "Wrong! Producing 1 kg of chocolate emits about 18 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by using a laptop for 8 hours?", 
            3, 
            "Correct! Using a laptop for 8 hours emits around 3 kg of CO2, depending on power usage.", 
            "Wrong! Using a laptop for 8 hours emits approximately 3 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 liter of bottled water?", 
            2, 
            "Correct! Producing 1 liter of bottled water emits about 2 kg of CO2 due to plastic manufacturing.", 
            "Wrong! Producing 1 liter of bottled water emits around 2 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 kilogram of apples?", 
            1, 
            "Correct! Producing 1 kg of apples emits around 1 kg of CO2 due to transportation and farming.", 
            "Wrong! Producing 1 kg of apples emits about 1 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by taking a hot shower for 10 minutes?", 
            5, 
            "Correct! Taking a 10-minute hot shower emits around 5 kg of CO2 due to water heating.", 
            "Wrong! Taking a 10-minute hot shower emits approximately 5 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by baking bread in the oven for 1 hour?", 
            4, 
            "Correct! Baking bread for 1 hour emits around 4 kg of CO2 due to energy consumption.", 
            "Wrong! Baking bread for 1 hour emits about 4 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 pair of jeans?", 
            33, 
            "Correct! Producing 1 pair of jeans emits around 33 kg of CO2 due to cotton farming and manufacturing.", 
            "Wrong! Producing 1 pair of jeans emits about 33 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 kilogram of rice?", 
            4, 
            "Correct! Producing 1 kg of rice emits around 4 kg of CO2 due to methane emissions from flooded fields.", 
            "Wrong! Producing 1 kg of rice emits about 4 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 kilogram of potatoes?", 
            2, 
            "Correct! Producing 1 kg of potatoes emits around 2 kg of CO2 due to low energy and resource use.", 
            "Wrong! Producing 1 kg of potatoes emits about 2 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by using an LED light bulb for 10 hours?", 
            1, 
            "Correct! Using an LED light bulb for 10 hours emits about 1 kg of CO2, making it energy-efficient.", 
            "Wrong! Using an LED light bulb for 10 hours emits around 1 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 kilogram of bread?", 
            6, 
            "Correct! Producing 1 kg of bread emits around 6 kg of CO2 due to farming and baking processes.", 
            "Wrong! Producing 1 kg of bread emits about 6 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 kilogram of tofu?", 
            3, 
            "Correct! Producing 1 kg of tofu emits around 3 kg of CO2 due to soybean farming.", 
            "Wrong! Producing 1 kg of tofu emits about 3 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by watching TV for 5 hours?", 
            2, 
            "Correct! Watching TV for 5 hours emits about 2 kg of CO2, depending on the TV's energy consumption.", 
            "Wrong! Watching TV for 5 hours emits around 2 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted to produce 1 liter of milk?", 
            10, 
            "Correct! Producing 1 liter of milk emits around 10 kg of CO2 due to dairy farming.", 
            "Wrong! Producing 1 liter of milk emits about 10 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by sending 1,000 emails?", 
            1, 
            "Correct! Sending 1,000 emails emits around 1 kg of CO2 due to server energy consumption.", 
            "Wrong! Sending 1,000 emails emits about 1 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 kilogram of pasta?", 
            5, 
            "Correct! Producing 1 kg of pasta emits around 5 kg of CO2 due to wheat farming and processing.", 
            "Wrong! Producing 1 kg of pasta emits about 5 kg of CO2."
        ));
        qlist.add(new Question(
            "How many kilograms of CO2 are emitted by producing 1 smartphone?", 
            70, 
            "Correct! Producing 1 smartphone emits around 70 kg of CO2 due to mining and manufacturing.", 
            "Wrong! Producing 1 smartphone emits about 70 kg of CO2."
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
