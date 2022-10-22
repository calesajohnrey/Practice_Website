package midterm_java;

import java.util.ArrayList;



public class midterm_storage<Name> {
    public static ArrayList<Object> content;
    private Name key;
    private int Age;
  
    public void setName(Name key) {
        this.key = key;
        
    }
    public void setAge(int Age){
        this.Age = Age;
    }
  
    public Name getName(){ 
        return key; 
    }
    
    public int getAge() { 
        return Age; 
    }
  
   
}