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
            "Does producing 1 liter of almond milk generate more or less CO2 than 1 liter of cow’s milk?", 
            false, 
            "Correct! Producing 1 liter of cow’s milk emits around 3.2 kg of CO2, whereas almond milk produces only around 0.7 kg.", 
            "Wrong! Producing cow’s milk emits around 3.2 kg of CO2, whereas almond milk produces only about 0.7 kg."
        ));

        qlist.add(new Question(
            "Does driving an electric car for 100 km emit more or less CO2 than a gasoline car for the same distance?", 
            false, 
            "Correct! An electric car emits around 15 kg of CO2 per 100 km (depending on the electricity source), while a gasoline car emits around 24 kg.", 
            "Wrong! An electric car emits around 15 kg of CO2 per 100 km, while a gasoline car emits about 24 kg."
        ));

        qlist.add(new Question(
            "Does producing 1 kilogram of cheese generate more or less CO2 than 1 kilogram of chicken meat?", 
            true, 
            "Correct! Producing 1 kg of cheese emits around 13.5 kg of CO2, while chicken meat emits around 10 kg.", 
            "Wrong! Producing 1 kg of cheese emits about 13.5 kg of CO2, compared to around 10 kg for chicken meat."
        ));

        qlist.add(new Question(
            "Does producing 1 pair of jeans emit more or less CO2 than producing 1 pair of running shoes?", 
            true, 
            "Correct! Producing a pair of jeans emits around 33 kg of CO2, while running shoes emit around 14 kg.", 
            "Wrong! Producing a pair of jeans emits about 33 kg of CO2, whereas running shoes emit only about 14 kg."
        ));

        qlist.add(new Question(
            "Does streaming 10 hours of HD video generate more or less CO2 than driving 10 km in a gasoline car?", 
            false, 
            "Correct! Streaming 10 hours of HD video emits around 2 kg of CO2, while driving 10 km in a gasoline car emits around 2.4 kg.", 
            "Wrong! Streaming 10 hours of HD video emits about 2 kg of CO2, compared to around 2.4 kg from driving 10 km."
        ));

        qlist.add(new Question(
            "Does producing 1 kilogram of rice emit more or less CO2 than producing 1 kilogram of potatoes?", 
            true, 
            "Correct! Producing 1 kg of rice emits around 4 kg of CO2, whereas potatoes emit only around 0.5 kg.", 
            "Wrong! Producing 1 kg of rice emits about 4 kg of CO2, while potatoes emit only about 0.5 kg."
        ));

        qlist.add(new Question(
            "Does flying 500 km on a plane emit more or less CO2 than traveling the same distance by train?", 
            true, 
            "Correct! Flying emits around 90 kg of CO2 for 500 km, while traveling by train emits only around 15 kg.", 
            "Wrong! Flying emits about 90 kg of CO2 for 500 km, whereas traveling by train emits only around 15 kg."
        ));

        qlist.add(new Question(
            "Does producing 1 kilogram of tofu emit more or less CO2 than producing 1 kilogram of beef?", 
            false, 
            "Correct! Producing 1 kg of tofu emits around 2 kg of CO2, while beef emits around 27 kg.", 
            "Wrong! Producing tofu emits about 2 kg of CO2, whereas beef emits a massive 27 kg."
        ));

        qlist.add(new Question(
            "Does using a dishwasher emit more or less CO2 than washing dishes by hand for 10 minutes?", 
            true, 
            "Correct! A dishwasher uses around 0.9 kg of CO2 per cycle, while hand washing can use around 2 kg, depending on water heating.", 
            "Wrong! A dishwasher emits about 0.9 kg of CO2 per cycle, while hand washing can use up to 2 kg."
        ));

        qlist.add(new Question(
            "Does producing 1 liter of bottled water emit more or less CO2 than producing 1 liter of tap water?", 
            true, 
            "Correct! Bottled water production emits around 0.5 kg of CO2 per liter, while tap water emits only around 0.05 kg.", 
            "Wrong! Bottled water emits around 0.5 kg of CO2 per liter, compared to just 0.05 kg for tap water."
        ));
        qlist.add(new Question(
            "Does producing 1 kilogram of plastic emit more or less CO2 than producing 1 kilogram of glass?", 
            false, 
            "Correct! Producing 1 kg of plastic emits around 6 kg of CO2, while glass production emits around 0.8 kg.", 
            "Wrong! Producing plastic emits about 6 kg of CO2, while glass production only emits around 0.8 kg."
        ));

        qlist.add(new Question(
            "Does using an electric kettle emit more or less CO2 than boiling water on a gas stove for 5 minutes?", 
            false, 
            "Correct! An electric kettle emits around 0.05 kg of CO2, whereas boiling on a gas stove emits around 0.2 kg.", 
            "Wrong! An electric kettle emits only about 0.05 kg of CO2, compared to around 0.2 kg for a gas stove."
        ));

        qlist.add(new Question(
            "Does producing 1 kilogram of pork emit more or less CO2 than producing 1 kilogram of lamb?", 
            false, 
            "Correct! Pork production emits around 12 kg of CO2 per kilogram, whereas lamb emits around 39 kg.", 
            "Wrong! Pork emits about 12 kg of CO2 per kilogram, while lamb produces around 39 kg."
        ));

        qlist.add(new Question(
            "Does producing 1 kilogram of aluminum emit more or less CO2 than producing 1 kilogram of steel?", 
            true, 
            "Correct! Aluminum production emits around 11 kg of CO2 per kg, while steel emits around 1.8 kg.", 
            "Wrong! Aluminum emits about 11 kg of CO2 per kg, compared to 1.8 kg for steel."
        ));

        qlist.add(new Question(
            "Does using a desktop computer for 8 hours emit more or less CO2 than using a laptop for the same time?", 
            true, 
            "Correct! A desktop emits around 0.4 kg of CO2 in 8 hours, while a laptop emits only around 0.1 kg.", 
            "Wrong! Desktops emit around 0.4 kg of CO2 in 8 hours, compared to just 0.1 kg for a laptop."
        ));

        qlist.add(new Question(
            "Does growing 1 kilogram of coffee beans emit more or less CO2 than growing 1 kilogram of tea leaves?", 
            true, 
            "Correct! Coffee production emits around 17 kg of CO2 per kg, while tea only emits around 1.5 kg.", 
            "Wrong! Coffee production emits about 17 kg of CO2 per kg, compared to just 1.5 kg for tea."
        ));

        qlist.add(new Question(
            "Does manufacturing a bicycle emit more or less CO2 than manufacturing a motorcycle?", 
            false, 
            "Correct! Manufacturing a bicycle emits around 5 kg of CO2, whereas a motorcycle emits around 80 kg.", 
            "Wrong! A bicycle emits about 5 kg of CO2, while a motorcycle emits around 80 kg during production."
        ));

        qlist.add(new Question(
            "Does charging a smartphone for a year emit more or less CO2 than charging a laptop for a year?", 
            true, 
            "Correct! Charging a smartphone emits around 3 kg of CO2 annually, while a laptop emits around 20 kg.", 
            "Wrong! A smartphone emits around 3 kg of CO2 per year, compared to 20 kg for a laptop."
        ));

        qlist.add(new Question(
            "Does producing 1 kilogram of bread emit more or less CO2 than producing 1 kilogram of rice?", 
            false, 
            "Correct! Bread production emits around 1.1 kg of CO2 per kg, while rice emits around 4 kg.", 
            "Wrong! Bread emits around 1.1 kg of CO2, whereas rice emits about 4 kg per kilogram."
        ));

        qlist.add(new Question(
            "Does taking a 10-minute shower emit more or less CO2 than taking a 10-minute bath?", 
            false, 
            "Correct! A 10-minute shower emits around 1.5 kg of CO2, while a bath emits around 3 kg.", 
            "Wrong! A 10-minute shower emits about 1.5 kg of CO2, compared to 3 kg for a bath."
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
