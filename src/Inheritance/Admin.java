package Inheritance;

public class Admin {

    /*
    you can create multiple variable in both parent and child class
    if you want to access you have to initialized
     */


    public static void main(String[] args) {
//        Box box = new Box();

//        Box box = new Box(4);
//
//
//        System.out.println(box.length+" "+box.breath+" "+box.height);

        Box2 boxtwo = new Box2();
//        c obj = new c();


        System.out.println(boxtwo.weight+" "+boxtwo.height);
        System.out.println();


        /*

        what is hierarchical Inheritance?

        let assume you created the parent class P then created the more classes A,B,C
        if you extend P in Class A,B,C then it's know as hierarchical Inheritance.

        What is Hybrid Inheritance?

        the combination of single and multiple inheritance is known as Hybrid Inheritance.


        why java doesn't support multiple inheritance?


        image you created class A and class B both have the variable int n then you create new class C
        when you call variable n using C class with same name in both the parent class it will confuse
        that's why java doesn't support multiple inheritance.

        But you can achieve it by using interfaces.

         */

    }

}
