import java.util.Scanner; 

/**
 * plays the game FizzBuzz 
 *If a number to be spoken is divisible by 3, say the word Fizz
 *If a number to be spoken is divisible by 5, say the word Buzz
 *If a number to be spoken is divisible by both 3 and 5, say the word FizzBuzz
 *Otherwise, say the original number
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a Scanner for user input 
     Scanner input = new Scanner(System.in); 

     // prompt the user to insert a number for FizzBuzz 
     System.out.println("Please enter a number to play FizzBuzz"); 
     
     // create variable for FizzBuzz number 
     int BF_number = input.nextInt(); 

     // create variable for the remainder of the FizzBuzz number to use in the "if statement" 
     int remainder_1 = BF_number % 3; 

     int remainder_2 = BF_number % 5; 


     // create "if statement" to tell the user what they need to say for FizzBuzz 
      if (remainder_2 == 0 && remainder_1 == 0){
       System.out.println("You should say FizzBuzz"); 
     }if (remainder_1 == 0 && remainder_2 != 0) {
       System.out.println("You should say Fizz"); 
     }else if (remainder_2 == 0 && remainder_1 != 0) {
       System.out.println("You should say Buzz"); 
     }if (remainder_1 != 0 && remainder_2 != 0) {
       System.out.println("You should say " + BF_number);
     }


    
  }
}
