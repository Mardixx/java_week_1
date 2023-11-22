import java.util.Random;

public class challenge4 {
    public static void main(String args[]) {
        Integer[] arr;

        Random rand = new Random();

        arr = new Integer[4];

        Integer rand_int1 = rand.nextInt(10);
        Integer rand_int2 = rand.nextInt(10);
        Integer rand_int3 = rand.nextInt(10);
        Integer rand_int4 = rand.nextInt(10);

        arr[0] = rand_int1;
        arr[1] = rand_int2;
        arr[2] = rand_int3;
        arr[3] = rand_int4;


        for(Integer i = 0; i < arr.length; i++) {
            try {
                if (i > 0) {
                    System.out.println((arr[i] / arr[i - 1]));
                } else {
                    System.out.println((arr[i] / arr[i]));
                }
            } catch (Exception e){
                System.out.println(1);
            }
        }
    }
}