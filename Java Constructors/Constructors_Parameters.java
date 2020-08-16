public class Constructors_Parameters {
  int x; // create a class attribute

  public Constructors_Parameters(int y) {
    x = y; //set value of x is equal to parameter y
  }

  public static void main(String[] args) {
    Constructors_Parameters myObj = new Constructors_Parameters(5); //create an object of class
    System.out.println(myObj.x); //print value of attribute x in class 
  }
}

// Outputs 5
