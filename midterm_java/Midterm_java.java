package midterm_java;
import java.util.ArrayList;
import java.util.Scanner;
import static midterm_java.midterm_storage.content;

public class Midterm_java {
     public static void main(String[] args){
        content = new ArrayList<Object>();
        try {
            System.out.println("Hi.");
            System.out.println("Please enter the size of the array: ");
            Scanner numberSize = new Scanner(System.in); 
            int nums = numberSize.nextInt();
            int i=0;
        do {
            System.out.print("Enter the name here: ");
            String newInputName= numberSize.next();
            if (newInputName.matches("-?\\d+(\\.\\d+)?")){
                System.out.print("Invalid Input"); 
                System.out.print("\n"); 
                System.out.print("\n");
            }else{
                System.out.print("Enter the age here: ");
                Integer newInputAge= numberSize.nextInt();
                if (newInputAge instanceof Integer){
                    midterm_storage<String> name = new midterm_storage<>();
                    name.setName(newInputName);
                    midterm_storage<Integer> num = new midterm_storage<>();
                    num.setAge(newInputAge);
                    String nameAdd = name.getName();
                    Integer ageAdd = num.getAge();
                    if (nameAdd instanceof String && ageAdd instanceof Integer){
                        content.add(nameAdd);
                        content.add(String.valueOf(ageAdd));
                        i++;
                        System.out.println(content);                   
                    }else{
                        System.out.print("Invalid Input.");
                        System.out.print("");   
                    }
                }else {
                    System.out.print("Invalid Input.");
                    System.out.print("");   
                }   
            }
        } while(i<nums);
            } catch (Exception e){
                System.out.println("Something went wrong!");
        }
    }
}