package com.perscholas.GLAB303_13_2_NewNIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles = {"C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\file1.txt", "C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\file2.txt"};

        // Specify out file with path location
        //Files contents will be written in these files
        String outputFile = "C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\nioOutput1.txt";

        // Get Channel for destination or outputFile
        FileOutputStream fileOut = new FileOutputStream(outputFile);
        FileChannel targetChannel1 = fileOut.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {
            // Get channel for inputFiles
            FileInputStream fileIn = new FileInputStream(inputFiles[i]);
            FileChannel SrcChannel = fileIn.getChannel();
            long size = SrcChannel.size();

            //ByteBuffer abstarct class  is used to store and restore bytes().
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            //System.out.println((char)buf.get());
            while (SrcChannel.read(buf) > 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    //System.out.println(buf.get());
                    targetChannel1.write(buf);
                }
            }


        }


    }
}
