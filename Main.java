package Study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
    Gender gender;
    
    System.out.println("What gender do you want?");
    System.out.println("(1 = boy) or (2 = girl)");
    int choice = scanner.nextInt();
    
    if(choice == 1) {
    	gender = new Boy();
    	gender.speak();
    }
    else if(choice == 2) {
    	gender = new Girl();
    	gender.speak();
    }
    else {
    	gender = new Gender();
    	gender.speak();
    }
 }

}
