/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

public class DataBoxDemo {

    public static void main(String[] args) {

        // Store student's name as String
        DataBox<String> studentName
                = new DataBox<>("Mehtab");

        // Store student's ID as Integer
        DataBox<Integer> studentID
                = new DataBox<>(24018);

        System.out.println("Student Name: "
                + studentName.getValue());

        System.out.println("Student ID: "
                + studentID.getValue());
    }
}
