package org.example;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Unit test for simple App. */
public class AppTest {

  /**test that input and output files have same size */
  @Test
  public void inputOutputSameSize() {

    String inputFilePath = "src/main/resources/input.txt";
    String outputFilePath = "src/main/resources/output.txt";

    App.copyFile(inputFilePath, outputFilePath);

    File inputFile = new File(inputFilePath);
    File outputFile = new File(outputFilePath);

    long expectedCopyLength = inputFile.length();
    long actualCopyLength = outputFile.length();

    assertEquals(expectedCopyLength, actualCopyLength);
  }

}
