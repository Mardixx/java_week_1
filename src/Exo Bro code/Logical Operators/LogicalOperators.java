import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        //&& AND operator
        /*int temp = 6;

        if(temp > 30) {
            System.out.println("It is hot outside!");
        } else if(temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }*/

        //|| OR operator

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Press q or Q to quit the current game");
        String response = scanner.next(); //Next key pressed is stored

        if(response.equals("q") || response.equals("Q")) { //Check if input is equal to q or Q
            System.out.println("You quit the current game");
        } else {
            System.out.println("You are playing the current game");
        }*/

        //! NOT operator

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press q or Q to quit the current game");
        String response = scanner.next(); //Next key pressed is stored

        if(!response.equals("q") && !response.equals("Q")) { //Check if input is equal to q or Q
            System.out.println("You are playing the current game");

        } else {
            System.out.println("You quit the current game");
        }
    }

}