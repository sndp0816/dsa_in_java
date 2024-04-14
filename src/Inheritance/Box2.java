package Inheritance;

public class Box2 extends Box{

    double weight;

    Box2(){
        this.weight=-1;

        //this will print the parent value of the variable
        System.out.println(super.length);
    }

//    let assume you make the length variable private still we can use here because it's extend the box class

    Box2(double l,double b,double h,double weight){
        //used to initialize value form the parent class
        super(l,b,h); //this is calling the parent class constructor
        this.weight=weight;

    }



}
