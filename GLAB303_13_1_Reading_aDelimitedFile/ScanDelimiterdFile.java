package com.perscholas.GLAB303_13_1_Reading_aDelimitedFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String FilePath = "C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\cars.csv";
            File file = new File(FilePath);
            Scanner sc = new Scanner(file);

            //After the split, we can store data in ArrayList. We could store that line as a String[] array as shown below:
            ArrayList<String[]> data = new ArrayList<String[]>();
            //The hasNext() method verifies whether the file has another line
            while (sc.hasNextLine()) {
                //Use the nextLine() method to read a line.
                String input = sc.nextLine();
                String[] line = input.split(",");
                data.add(line);
            }

            for (String[] feilds : data) {
                System.out.println("Car name :" + feilds[0]);
                System.out.println("MPG :" + feilds[1]);
                System.out.println("Cylinders :" + feilds[2]);
                System.out.println("Displacement: " + feilds[3]);
                System.out.println("HorsePower: " + feilds[4]);
                System.out.println("Weight: " + feilds[5]);
                System.out.println("Acceleration: " + feilds[6]);
                System.out.println("Model: " + feilds[7]);
                System.out.println("Origin: " + feilds[8]);
                System.out.println("===============================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }


    }
}
