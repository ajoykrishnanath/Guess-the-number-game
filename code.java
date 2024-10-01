/*
        Create a class Game, which will allows a user to play "Guess the Number"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getters and setters for noOfGuesses
        use properties such as noOfGuesses(int), etc to get this task done!
 */
//package Learning.com;
// Remove this line: package Learning.com; add package according to your folder in pc
import java.util.Random;
import java.util.Scanner;

class GuessTheGame{
    Scanner sc = new Scanner(System.in);
    int num;
    Random rand= new Random();
    int cn=rand.nextInt(1,101);

    //setters
    public int takeUserInput(){
        System.out.println("Enter your number in the range [1,100]");
        num=sc.nextInt();
        return num;
    }

//    //getters
//    public void showInput(){
//        System.out.println("Your entered number is "+num);
//    }

    public void showComGenNum(){
        System.out.println("Computer generated number is "+cn);
    }

    public void isCorrectNumber(){
        int a=0;
        while (true) {
            takeUserInput();
            if (cn == num) {
                a++;
                System.out.println("You have correctly guessed the number in " + a + " attempts");
                break;
            }
            else if (num > cn) {
                a++;
                System.out.println("Your entered number is greater than computer generated number");
            }
            else{
                a++;
                System.out.println("Your entered number is smaller than computer generated number");
            }
        }
        sc.close();
    }
}
public class code {
    public static void main(String[] args) {
        GuessTheGame P1= new GuessTheGame();
//        P1.takeUserInput();
//        P1.showInput();
//        P1.showComGenNum();
        P1.isCorrectNumber();
    }
}
