package Inheritance;

public class Box {

//    private double length;
//    anything in private you can only use in that particular file where you initialize the variable
    double length;
    double breath;
    double height;

    Box(){
        this.length=-1;
        this.breath=-1;
        this.height=-1;
    }
    Box(double sides){

//        super();   // Object class

        this.length=sides;
        this.breath=sides;
        this.height=sides;
    }
    Box(double length,double breath,double height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }

    //Copy constructor
    Box(Box old){
        this.length = old.length;
        this.breath = old.breath;
        this.height = old.height;
    }

    public void Check(){
        System.out.println("Running the info");
    }

}
