

public class MultiDimensionalArrays{

    public static void main(String[] args) {

        /* String[][] cars = new String[3][3]; */ //Creating multidimensional array in which the numbers define rows and columns

        String[][] cars = {
                            {"Camaro ", "Corvette ", "Silverado "},
                            {"Mustang ", "Ranger ", "F-150 "},
                            {"Ferrarri ", "Lamborghini ", "Tesla "}
                           }; //Same but directly set values to array's rows and columns

        /* cars[0][0] = "Camaro ";
        cars[0][1] = "Corvette ";
        cars[0][2] = "Silverado ";
        cars[1][0] = "Mustang ";
        cars[1][1] = "Ranger ";
        cars[1][2] = "F-150 ";
        cars[2][0] = "Ferrarri ";
        cars[2][1] = "Lamborghini ";
        cars[2][2] = "Tesla "; */

        for(int i = 0; i < cars.length; i++) {
            System.out.println(); //Blank line
            for(int j = 0; j < cars[i].length; j++) {
            System.out.print(cars[i][j]);
        }
        }

    }

}