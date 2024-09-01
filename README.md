# Encapsulation
This design follows the principles of object-oriented programming by hiding implementation details and exposing only necessary information.
*Static Nested Classes: The nested classes are defined as static, meaning they do not require an instance of the outer class Classes to be instantiated. This is appropriate here as these classes are logically related but do not need access to any instance-specific data or behavior of Classes.

*Encapsulation: Each class encapsulates its data through private fields and provides public getter methods for accessing this data. This design follows the principles of object-oriented programming by hiding implementation details and exposing only necessary information.

*Object Interaction: The Student class demonstrates composition by holding references to instances of Batch, Faculty, and Course, allowing it to provide detailed information about itself and its related entities.

*Overall, the code models a basic educational system with a focus on encapsulation and object-oriented design principles.
