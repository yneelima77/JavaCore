package com.perscholas.GLAB303_13_2_NewNIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles = {"C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\file1.txt", "C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\file2.txt"};

        //Files contents will be written in these files
        String outputFile = "C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\nioOutputExample2.txt";

        //Get channel for output file
        FileOutputStream fileOut = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fileOut.getChannel();
        for (int i = 0; i < inputFiles.length; i++) {
            //Get channel for input files
            FileInputStream fileIn = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fileIn.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fileIn.close();
        }
        //finally close the target channel
        targetChannel.close();
        fileOut.close();
    }
}
