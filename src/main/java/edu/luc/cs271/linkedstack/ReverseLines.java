package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    final String line;
    // TODO recursively read and print successive input lines until EOF, then pescrint them out in
    // reverse order
    System.out.println("Please input a string or press enter to finish");
    line = input.nextLine();
    if (!line.isEmpty()) printReverse(input);
    System.out.println(line);
  }
}
