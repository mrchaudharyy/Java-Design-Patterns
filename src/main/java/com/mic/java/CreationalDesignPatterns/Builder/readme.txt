What is Builder Design Pattern?
 -> If we have a complex logic to build an object that involve multiple objects creation steps such as
    For creating Address object we may need Person object in its constructor.

    Public class Address(String id, Person person){
    // initialize
    }

    Here we can use builder pattern and remove the logic in the client code and abstract in into a separate class.
