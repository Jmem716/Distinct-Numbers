/* Author: Jaime Maldonado
 * Program asks user for 10 
 * integers and returns whatever 
 * integers are distinct
 */ 

import java.util.ArrayList;

import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {	

    	//Prompt for user to enter 10 integers
        System.out.println("Enter 10 integers: ");
        
        //Scan object is created. User input will go in userInput object
        Scanner userInput = new Scanner(System.in);
        
        //Array list created
        ArrayList<Integer> list = new ArrayList<>();
        
        //For loop will ensure user input is placed within all 10 indexes
        for (int i = 0; i < 10; i++) {
        	
        	list.add(userInput.nextInt());
        } 
        
        //Invoking removeDuplicate method and sending list in parameters
        removeDuplicate(list);
        
        //Printing out list 
        System.out.println("\nThe distinct integers are: ");
        System.out.println(list);
    }

    //removeDuplicate method expecting an int array through local variable list
    public static void removeDuplicate(ArrayList<Integer> list) {

    	//testArray object created 
        ArrayList<Integer> testArray = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {

        	/*All elements in original list will be passed on to testArray ensuring
        	 not to send duplicates*/
            if (!testArray.contains(list.get(i))) {
            	
                testArray.add(list.get(i));
            }
        }
        
        //Clears out original list
        list.clear();
        //Adds new list to former array
        list.addAll(testArray);

    }
}