package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        File textOutput = new File("textOutput.txt");
        Scanner fileScanner = new Scanner(new File("textInput.txt"));
        FileWriter fw = new FileWriter(textOutput);
        ArrayList<String> userInput = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            userInput.add(fileScanner.nextLine());
        }
        for (int i = 0; i < userInput.size(); i++) {
            fw.write(userInput.get(i) + ",\n");
        }
        fw.close();
        fileScanner.close();
    }
}
