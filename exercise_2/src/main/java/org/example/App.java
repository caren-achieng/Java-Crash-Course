package org.example;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Write a program that copies text files: reads a line from one file and writes it to another file
 */
public class App {


  public static void copyFile(String inputFilePath, String outputFilePath) {

    File inputFile = new File(inputFilePath);
    File outputFile = new File(outputFilePath);

    try {

      if (outputFile.createNewFile()) {
        System.out.println("output file created: " + outputFile.getName());
      } else {
        System.out.println("output file already exists: " +  outputFile.getName());
      }

      try (Scanner myReader = new Scanner(inputFile);
        FileWriter myWriter = new FileWriter(outputFile)) { 

        while (myReader.hasNext()) {
          String textLine = myReader.nextLine();
          System.out.println("read line: " + textLine);
          //  \n or \r\n for 'new line' may actually differ depending on the input file
          myWriter.write(textLine + "\r\n");
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }

  public static void main(String[] args) {

    String inputFilePath = "src/main/resources/input.txt";
    String outputFilePath = "src/main/resources/output.txt";

    copyFile(inputFilePath, outputFilePath);

  }

}
