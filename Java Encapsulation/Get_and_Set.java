/* Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must 
	- declare class variables/attributes as private
	- provide public get and set methods to access and update the value of a private variable
*/

// The get method returns the variable value, and the set method sets the value.

// Encapsulation 
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name; // returns the value of the variable name
  }

  // Setter
  public void setName(String newName) {
    // 'this' keyword is used to refer to the current object
    this.name = newName; // takes a parameter (newName) and assigns it to the name variable
  }
}

// use the getName() and setName() methods to acccess and update the variable
public class Get_and_Set {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
