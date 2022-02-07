package com.parkhurst.wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordGenerator {

    /**@brief: Will import a predefined wordsList for the game!
     * @return Returns a String array of words
     */
    private static String []importFil(){
        String []words = new String[55];
        try{
            File wordList = new File("words.txt");
            Scanner myReader = new Scanner(wordList);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("An Error has occurred in Importing wordlist");
            e.printStackTrace();
        }

        return words;
    }
    public static void main(String []args){
        //WordleApp.class.getResource("wordle-view.fxml");
        String []wordList = importFil();
        if(wordList.length == 0){
            System.out.println(-3);
        }else{
            System.out.println(3);
        }

    }
}
