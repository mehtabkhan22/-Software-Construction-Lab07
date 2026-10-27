/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.5));
        students.add(new Student(101, 3.8));
        students.add(new Student(102, 3.2));

        // Sort by roll number in ascending order
        Collections.sort(students);

        System.out.println("Sorting by Roll Number (Ascending):");

        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by CGPA in descending order
        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorting by CGPA (Descending):");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
