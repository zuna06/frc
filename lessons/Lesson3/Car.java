package Lesson3;

public class Car {

    //Class (blueprint) for Car

    //This car class has 3 characteristics as shown below
    //When an object is created using this class I can assign a model, owner, and year for that object
    public String model;
    public String owner;
    public int year;

    //Getters and Setters

    //In java we follow a convention that has getter and setter methods as part of our classes to retrieve or set data
    //I can always do carObject.year == 1950; but there are some cases which we will explore later that would require
    //the use of getters and setters


    //Notice how these methods don't have the static keyword while our previous methods and main method do?
    //That because these methods belong to a specific instance

    //Basically a static method belongs to the class it is declared in and cannot be multiplied and reused in seperate classes
    //A non static method like the ones below are created with a specific object instance and can be used in 2 different objects 
    //without conflicting with each other

    //If I created 2 different objects of Class Car I could use the getModel method on both of them and it would return seperate values
    //assuming the models are different of course

    //What if I do have a static variable method in my class?

    public static int staticVar;
    
    public static void getStaticVar() {
        System.out.println(staticVar);
    }

    public static void setStaticVar(int newStaticVar) {
        staticVar = newStaticVar;
    }


    public void getModel() {
        System.out.println(model);
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void getOwner(){
        System.out.println(owner);
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public void getYear(){
        System.out.println(year);
    }

    public void setYear(int newYear) {
        year = newYear;
    }
}