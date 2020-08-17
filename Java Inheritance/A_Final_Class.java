// If you don't want other classes to inherit from a class, 
// use the final keyword

final class Vehicle {
  //...
}

class Car extends Vehicle {
  //...
}

// output : error: cannot inherit from final Vehicle
