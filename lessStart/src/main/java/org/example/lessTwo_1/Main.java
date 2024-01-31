package org.example.lessTwo_1;

public class Main {
    public static void main (String[] args) {
        Vector vector1 = new Vector(1.0,1.0,1.0);
        Vector vector2 = new Vector(2.0,1.0,2.0);
        System.out.println("vector1 = " + vector1);
        System.out.println("vector1.length() = " + vector1.length());
        System.out.println("vector1.scalar(vector2) = " + vector1.scalar(vector2));
        System.out.println("vector1.multiply(vector2) = " + vector1.multiply(vector2));
    }


}
