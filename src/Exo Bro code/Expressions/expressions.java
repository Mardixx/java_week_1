public class expressions {

    public static void main(String[] args) {

        int friends = 10;

        //double friends = 10; //Only for double type division

        friends = friends + 1; //Adds one friend to friends
        friends++; //Adds one friend to friends (shorthand)
        friends = friends - 1; //Removes one friend to friends
        friends--; //Removes one friend to friends (shorthand)
        friends = friends * 1; //Multiplies friends by one
        friends = friends / 1; //Divides friends by one (only gives you the whole number not the .5498714 of an eneven number)
        //friends = (double) friends / 3; //Divides friends by three and stores it in a double data type
        friends = friends % 2; //Gives you the remainder of the division

        System.out.println(friends); //Prints friends
    }

}