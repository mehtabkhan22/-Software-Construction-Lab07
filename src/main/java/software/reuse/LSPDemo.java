/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

public class LSPDemo {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        System.out.println("Rectangle Area: "
                + rectangle.calculateArea());

        System.out.println("Square Area: "
                + square.calculateArea());
    }
}
