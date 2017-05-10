/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.mutasem4it.statictest;

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
    public static class B {

        public B() {
            System.out.println("I am B Who R U ☺☻☻☺?");
        }
    }
    //private int count = 0;
    private static int count = 0;

    public A() {
        count++;
        System.out.println("count: " + count);
    }

    public static void m() {
        count++;
        System.out.println("count: " + count);
    }
//     public  void m() {
//        count++;
//        System.out.println("count: " + count);
//    }
}
