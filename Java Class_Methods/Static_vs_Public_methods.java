public class Static_vs_Public_methods {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Static_vs_Public_methods myObj = new Static_vs_Public_methods(); // Create an object of Static_vs_Public_methods Class
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
