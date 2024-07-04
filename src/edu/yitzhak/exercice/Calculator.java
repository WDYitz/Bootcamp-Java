package edu.yitzhak.exercice;

/**
 * <h3>Calculator</h3>
 * The Calculator class implements an application that simply performs basic
 * arithmetic operations.
 * 
 * <b>Note:</b> This class is part of the edu.yitzhak.exercice package.
 * 
 * @author Yitzhak Rodriguez
 * @version 1.0
 * @since 2024-07-01
 */

public class Calculator {
  /**
   * This method adds two numbers.
   * 
   * @param firstNumber
   * @param secondNumber
   * @return int This returns the sum of two numbers.
   */

  public int add(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  public int multiply(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }

  public int subtract(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }

  public int divide(int firstNumber, int secondNumber) {
    return firstNumber / secondNumber;
  }
}
