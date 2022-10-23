/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceone;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Student.Admin
 */
public class classOne<Bread> {
    public static ArrayList<Object> content;
    private Bread key;
    private int Price;
    public static ArrayList<String> cities;  
    public void setBread(Bread inputedPrice) {
        this.key = inputedPrice;
    }
    public void setAge(int inputedPrice){
        this.Price = inputedPrice;
    }
    public Bread getBread(){ 
        return key; 
    }
    public int getAge() { 
        return Price; 
    } 
}
