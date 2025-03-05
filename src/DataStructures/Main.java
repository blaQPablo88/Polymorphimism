
package DataStructures;

import  java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};


        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car: cars) {
            System.out.println(car);
        }

        System.out.println("\nNew work");

        // average age
        double avg = average(ages);
        System.out.println("The average age is: " + avg);

        //lowest age
        double lowAge = lowestAge(ages);
        System.out.println("The lowest age in the array is: " + lowAge);

        // Sort an ArrayList of Integers
        int num = pracArrayList();
        System.out.println("Sort an ArrayList of Integers: " + num);
    }

    // average age
    public static double average(int ages[]) {

        double sum = 0;
        double avg;
        for (int age : ages) {
            sum += age;
        }
        avg = sum / (ages.length);
        return avg;
    }

    //lowest age
    public static int lowestAge(int ages[]) {
        int lowAge = ages[0];

        for (int age : ages) {
            if (lowAge > age) {
                lowAge = age;
            }
        }

        return lowAge;
    }

    // sort an ArrayList of Integers
    public static int pracArrayList() {
        ArrayList <Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(35);
        myNumbers.add(57);
        myNumbers.add(283);
        myNumbers.add(92);
        myNumbers.add(25);
        myNumbers.add(06);
        myNumbers.add(58);
        myNumbers.add(82);

        Collections.sort(myNumbers);
        System.out.println(myNumbers.size());

        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.println(myNumbers.get(i));
            if (myNumbers.get(4) == 58) {
                myNumbers.set(4, 85);
            }
        }
        System.out.println(myNumbers.size());

        return myNumbers.get(2);
    }
}