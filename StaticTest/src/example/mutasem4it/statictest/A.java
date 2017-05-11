/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.mutasem4it.statictest;

import java.util.ArrayList;

/**
 *
 * @author Mutasem
 */
public class A {

//    public class B {
//
//        public B() {
//            System.out.println("I am B Who R U ☺☻☻☺?");
//        }
//    }
    /********static class************/
    public static class B {

        public B() {
            System.out.println("I am B Who R U ☺☻☻☺?");
        }
    }
    //private int count = 0;
    /*********static member *******/
    private static int count = 0;

    public A() {
        count++;
        System.out.println("count: " + count);
    }
/*************static method***********/
    public static void m() {
        count++;
        System.out.println("count: " + count);
    }
//     public  void m() {
//        count++;
//        System.out.println("count: " + count);
//    }
    /*****************static block**********/
    private static ArrayList<String> words;
    static {
    words=new  ArrayList<>();
    words.add("Hi");
    words.add("I am");
    words.add("☻☻☻Mutasem☻☻☻");
    
    }
}
