public class Parameter {
    static void checkValue(int Value){
    if (Value < 20) {
      System.out.println("Sold");

    // If Value is greater than 2o, print "access granted"
    } else {
      System.out.println("Not enough money");
    }

  }

  public static void main(String[] args) {
    checkValue(20); // Call the checkValue method and pass along an Value of 20
  }
}

