## Day-03

### **Object-Oriented Programming System** :
Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.

- Object
- Class
- Inheritance
- Polymorphism
- Abstraction
- Encapsulation


![Java OOPs Concepts - Javatpoint](https://user-images.githubusercontent.com/106432362/194367667-fd4d63d2-a02b-4a91-9768-214da60895a2.jpeg)

### **Object** :
Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.
An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

<img width="520" alt="creating an object " src="https://user-images.githubusercontent.com/106432362/194375136-cad72f43-7674-44f8-bf68-0b8554c21f93.png">


**An object has three characteristics** :

**State** :
represents the data (value) of an object.
**Behavior** : 
represents the behavior (functionality) of an object such as deposit, withdraw, etc.
**Identity** : 
An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user.



When an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.

**‘this’ keyword** :  
‘this’ keyword in Java that refers to the current instance of the class. In OOPS it is used to pass the current object as a parameter to another method refer to the current class instance variable


<img width="520" alt="Syntax of object " src="https://user-images.githubusercontent.com/106432362/194374971-6c7197a7-9c00-43fc-b406-ff30372895de.png">




### **Class** :
Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated. 

**A class in Java can contain**:

- Fields
- Methods
- Constructors
- Blocks
- Nested class and interface

<img width="520" alt="Syntax of Class" src="https://user-images.githubusercontent.com/106432362/194374231-e8e0c662-34fd-4149-afc9-ec2c0761ee61.png">

**Instance variable in Java** :
A variable which is created inside the class but outside the method is known as an instance variable. Instance variable doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.


## **Constructor** :
- Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 
- Constructors have the same name as class or structure. 
- Constructors don’t have a return type. (Not even void)
- Constructors are only called once, at object creation.

**There can be three types of constructors in Java** : 
1. **Non-Parameterized constructor** : A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.



2. **Parameterized constructor** : Constructor which has parameters is called a parameterized constructor. It is used to provide 
different values to distinct objects. 
