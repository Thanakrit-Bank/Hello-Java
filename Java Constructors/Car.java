public class Car {
  // create class attributes
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    // set value of class attributes
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang"); // Create an object of class Car 
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
