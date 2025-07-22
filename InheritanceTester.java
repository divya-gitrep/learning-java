package chapter9;

public class InheritanceTester {
    public static void main(String args[]) {

        Mother mom = new Mother();
        mom.setName("Asha");

        System.out.println(mom.getName() + "is a" + mom.getGender());

    //Person person = new Person();
   // Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("test");

    
}
}
