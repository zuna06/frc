package Lesson3;

public class LessonThree {
    public static void main(String[] args) {

        Car lowrider = new Car(); //Creates an object using the Car class

        //Think of a class as a blueprint
        //and an object a creation that is built
        //using that blueprint

        //For simple classes you can always set object variables like so:
        lowrider.model = "Lincoln Continental";
        lowrider.setModel("Lincoln Continental");



        lowrider.owner = "Abi";
        lowrider.year = 1965;

        //From now on we will mostly only be using getters and setters to get you in the habit

        Car mercuryCoupe = new Car();
        mercuryCoupe.setModel("Mercury Eight");
        mercuryCoupe.setOwner("Tanish");
        mercuryCoupe.setYear(1950);
        mercuryCoupe.getModel();

        lowrider.getModel();


        //Notice how I am able to access those static methods and variables without even creating an object
        Car.staticVar = 50;
        Car.setStaticVar(75);
        Car.getStaticVar();

        //I can also access those same methods and variable from an object with the value remaining as 75
        lowrider.getStaticVar();
        mercuryCoupe.getStaticVar();

        //If you have the Java extension enabled you can notice that an error shows up under those above 2 lines
        //That's because you should only access static methods and variables in a static manner, not from an object

        //FIGURE THIS SHIT OUT OR YOU ARE OFF THE TEAM AND YOU SHOULD KILL YOURSELF NOW YOU DUMBASS
        //NO ONE IS HERE FOR YOU SO JUST COMMIT SUICIDE AS SOON AS POSSIBLE AND MAKE SURE YOU GIVE ME
        //ALL YOUR STUFF SO IT CAN BE PUT TO USE1


        //Create your own class on anything you would like
        //Give it at least 3 characteristics and a getter and setter for each
        //Then implment it in a seperate java file
    }
}
