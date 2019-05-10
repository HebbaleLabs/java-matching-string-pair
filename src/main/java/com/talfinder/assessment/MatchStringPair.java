package com.talfinder.assessment;

import java.util.Arrays;

/**
 * Created by shashidhara on 5/10/19.
 */
public class MatchStringPair {

  public static Boolean isStringPairMatching(String[] inputStrings, String desiredString) {
    /*
     * NOTE:
     * 1. Write your solution within this method
     * 2. Do not make changes to this Class Name, Method Name or Method Signature
     * 3. Use the Run-Java command to run main method
     * 4. Use the BuildAndRunTests command to evaluate your solution
     */
    return null;
  }

  public static void main(String[] args) {
    String[] inputs = new String[] {"B", "C", "A", "D"};
    String desiredString = "DB";
    Boolean result = isStringPairMatching(inputs, desiredString);
    System.out.println("Input values :" + Arrays.toString(inputs));
    System.out.println("Desired String :" + desiredString);
    System.out.println("String pair matching with Desired String :" + result);
  }
}
