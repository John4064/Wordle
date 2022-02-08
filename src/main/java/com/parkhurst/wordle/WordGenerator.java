package com.parkhurst.wordle;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class WordGenerator {
    /**@brief: Will Generate a randomly select word from the list
     * @return Returns a 5 letter word
     */
    public static String getWord() throws IOException {
        String filName = "\\words.txt";
        try {
            Random rand = new Random();
            //Current word list has size 5757 length
            int fileLen = 5757;
            int int_random = rand.nextInt(fileLen);

            String line32 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+"\\src\\main\\resources\\com\\parkhurst\\wordle"+filName)).get(int_random);
            return line32;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "";
        }
    }
}
