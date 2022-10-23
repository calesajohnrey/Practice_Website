/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiceone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static practiceone.classOne.cities;
import static practiceone.classOne.content;

public class PracticeOne {

    static void intro() throws Exceptions {
        System.out.println(" ");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This are the elements in the ArrayList: ");
        System.out.println(content);
        System.out.println(" --------------------------------------------- ");
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please select your option:");
        System.out.println("A. Add an element in the array.");
        System.out.println("B. Remove an element in the array.");
        System.out.println("C. Display all elements in the array.");
        System.out.println("D. Clear elements in the array");
        System.out.println("E. Exit the program!");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = input.next();
        if (inputChar instanceof String) {
            String convertChar = inputChar.toUpperCase();
            switch (convertChar) {
                case "A":
                    addElement();
                case "B":
                    removeElement();
                case "C":
                    displayElement();
                case "D":
                    clearArray();
                case "E":
                    exitElement();
                default:
                    System.out.println("Invalid input");
                    intro();
            }
        }
        throw new Exceptions("Incorrect input");
    }

    static void prompt() throws Exceptions {
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        Scanner prompt = new Scanner(System.in);
        System.out.println("Do you want to go back: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if (null == answer) {
            System.out.println("Invalid input.");
            System.out.println(" ");
            prompt();
        } else {
            switch (answer) {
                case "y":
                    System.out.println(" ");
                    intro();
                case "n":
                    System.out.println(" ");
                    exitElement();
                default:
                    System.out.println("Invalid input.");
                    System.out.println(" ");
                    prompt();
            }
        }

    }

    static void exitElement() throws Exceptions {
        Scanner prompt = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("Do you want to exit: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if ("y".equals(answer)) {
            System.out.println("Exiting the program!");
            System.exit(0);
        } else if ("n".equals(answer)) {
            System.out.println(" ");
            prompt();
        } else {
            System.out.println(" ");
            throw new Exceptions("Incorrect input");
        }

    }

    static void addElement() throws Exceptions {
        System.out.println("");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This is the interface for adding an element!");
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter the new bread name here (String only): ");
        String newInputBreadName = prompt.next();
        //        conditional for string input name
        if (newInputBreadName instanceof String) {

            classOne<String> name = new classOne<>();
            name.setBread(newInputBreadName);
            String nameAdd = name.getBread();
            content.add(nameAdd);
            System.out.println(" ");
            System.out.println("Added new bread in the restaurant!");
            System.out.println(" ");
        } else {
            throw new Exceptions("Incorrect input");
        }

        System.out.print("Enter the new new price here (Integer only): ");
        Integer newInputPrice = prompt.nextInt();
//        conditional for int input
        if (newInputPrice instanceof Integer) {
            Integer stringed = newInputPrice;
            double newObject = Double.valueOf(stringed);
            if (newObject > 0.0) {
                classOne<Integer> name = new classOne<>();
                name.setAge(newInputPrice);
                content.add(String.valueOf(newInputPrice));
                System.out.println(" ");
                System.out.println("Added new item in the Array!");
                System.out.println(" ");
                prompt();
            } else {
                System.out.print("");
                System.out.print("Too low");
                System.out.print("");
                addElement();
            }
        } else {
            throw new Exceptions("Incorrect input");
        }
    }

    static void removeElement() throws Exceptions {
        System.out.println("");
        System.out.println("This is the interface for removing an element!");
        System.out.println(" --------------------------------------------- ");
        System.out.println("This are the elements in the ArrayList: ");
        System.out.println(content);
        System.out.println(" --------------------------------------------- ");
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter the item here: ");
        Object newInputItem = prompt.nextLine();
        if (newInputItem instanceof String) {
            System.out.println("Invalid input");
        } else {
            if ("".equals(newInputItem)) {
                System.out.println("");
                System.out.println("No value entered!");
                System.out.println("Try again");
                removeElement();
            } else {
                String newItem = newInputItem.toString();
                String newItems = newItem.toLowerCase();
                if (content.contains(newItems)) {
                    content.remove(String.valueOf(newItem));
                    System.out.println(content);
                    prompt();
                } else {
                    throw new Exceptions("Incorrect input");
                }
            }
        }
    }

    static void displayElement() throws Exceptions {
        System.out.println("");
        System.out.println("This is the interface for viewing all element!");
        System.out.println("+---------------------------------------------+");
        System.out.println("This are the elements in the ArrayList: ");
        System.out.println(content);
        System.out.println("");
        Collections.shuffle(cities);
        System.out.println(cities.get(0));
        prompt();
    }

    static void clearArray() throws Exceptions {
        Scanner prompt = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("+---------------------------------------------+");
        System.out.println(" ");
        System.out.println("Do you want to clear the elements in array: [y] or [n]?");
        System.out.println(" ");
        System.out.print("Enter it here: ");
        String inputChar = prompt.nextLine();
        String answer = inputChar.toLowerCase();
        if (null == answer) {
            System.out.println("Invalid input.");
            clearArray();
        } else {
            switch (answer) {
                case "y":
                    System.out.println(" ");
                    System.out.println("Exiting the program!");
                    content.clear();
                    System.out.println(content);
                    intro();
                    break;
                case "n":
                    prompt();
                    break;
                default:
                    System.out.println("Invalid input.");
                    clearArray();
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exceptions {
        content = new ArrayList<Object>();
        cities = new ArrayList<String>(Arrays.asList("Manila", "Cebu", "Davao", "Bohol", "Samar"));
        intro();
    }
}
