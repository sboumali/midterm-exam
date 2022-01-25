package design;

public abstract class AbstractEmployee implements Employee {

    // Abstract class is not fully abstract

    int yearsOfExperience = 20;

    public abstract void printInfo();

    public abstract void printEmployeeInfo();

    // Abstract method
    public abstract void giveInstructions();

    public abstract void travelTheWorld();


    public static void meeting(){
        System.out.println("The manager scheduled an appointment with his workers");
    }


}