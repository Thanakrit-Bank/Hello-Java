// for example, the Scanner class, which is used to get user input

import java.util.Scanner;
// java.util is a package, while Scanner is a class of the java.util package

// Using the Scanner class to get user input

class Import_a_Class {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
