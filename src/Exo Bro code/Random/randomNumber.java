import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(9999); //Limits size of random (0 to 9999)
        int z = random.nextInt(10000) + 1; //Limits size of random (1 to 10000)
        double y = random.nextDouble(); //From 0 to 1
        boolean b = random.nextBoolean(); //True or False



        System.out.println(x);
        System.out.println(z);
        System.out.println(y);
        System.out.println(b);

    }

}