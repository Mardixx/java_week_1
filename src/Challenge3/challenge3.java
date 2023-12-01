import java.util.Random;
import java.util.ArrayList;

public class challenge3
{
    public static void main(String[] args)
    {
        Random randInt = new Random();

        Integer[] array =  new Integer[5];

        array[0] = randInt.nextInt(99);
        array[1] = randInt.nextInt(99);
        array[2] = randInt.nextInt(99);
        array[3] = randInt.nextInt(99);
        array[4] = randInt.nextInt(99);

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < 10)
            {
                System.out.println("Smaller than 10: " + array[i]);
            } else {
                System.out.println("No condition: " + array[i]);
            }
        }

    }
}