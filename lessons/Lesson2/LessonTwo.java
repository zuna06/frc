package Lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        //Quick Review of last class cus idek if they understood it completly
        
        int intNum;
        float floatNum;
        double doubleNum;

        char charVar;
        String stringVar;

        //Arrays -> add [] after type, don't need to specify length if defining the array
        int[] intArr = {1, 2, 3};

        
        
        //For Loops
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        
        //While Loops


        //If..else

        int x = 5;
        int y = 7;
        int z = 7;

        if (x <= y || y == z) {
            System.out.println("x is less than or equal to y and z");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("Conditions not met");
        }
        
        //Switch Statement
        //Numerical Example
        //Works with other types too
        int switchNum = 3;

        switch (switchNum) {
            case 1:
                System.out.println("Number is equal to one");
                break;
            case 2:
                System.out.println("Number is equal to two");
                break;
            case 3:
                System.out.println("Number is equal to three");
                break;    
            default:
                System.out.println("Number is out of range");
                break;
        }

        //That's it for review
        
        //Time for intro on methods

        printFullName("Tanish", "Ambala"); //prints "Tanish Ambala"

        int sum = sumOfTwo(50, 100);
        //Since this method returns something, it needs to be stored or displayed in some way
        //we can do this by either storing it in a variable and printing it out, or by printing it out
        //without storing it
        System.out.println(sum);

        System.out.println(sumOfTwo(50, 150));

        //Now straight to fuckin OOP
        //./Lesson3/LessonThree.java :O
    }

    public static void printFullName(String fullName, String lastName) {
        System.out.println("Your name is " + fullName + ' ' + lastName);
    }

    public static int sumOfTwo(int num1, int num2) {
        return num1 + num2;
    }

    //Known as methods, they are functions but in java they are called methods of the class they are a part of
    //The text right after static represents the return type of the method
    //A return type is the data type that will be returned from that method
    //For our first method there is no return type because we are not returning anything, we just print out the full name
    //However, our second method has a return type of int, or integer, because we return the sum of 2 integers which is an integer
    //A return type can be any of the data types that are supported by java, they are chosen based on what the purpose of the method is

    //Static keyword will be discussed in lesson 3, if you wanna explain rn go ahead
}