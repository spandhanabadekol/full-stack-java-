package assignmentDay02;

import java.util.Scanner;
public class Student {

public  String name;

public  String getName() {
        return name;
        }
public void setName(String newName) {
        name=newName;
        }
public static void main(String[] args) {
        Student s=new Student();
        s.setName("Spandhana");
        //String name= s.getName();
        //System.out.println("Name: " + name);
        System.out.println("Name : " +s.getName());

        }
        }
