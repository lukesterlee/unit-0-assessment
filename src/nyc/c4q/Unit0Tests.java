package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();
        Person alan = declareAndReturnPersonNamedAlanTuringFromLondon();
        System.out.println(isFromLondon(alan));
        HashMap<String, Person> people = declareAndReturnHashmapOfAlanTuringAndGraceHopper();
        changeTuringsCityToPrinceton(people);
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        long sum = 0;
        for (int i = 1; i < 10000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
      return (n%2 != 0);
    }

    public static boolean isMultipleOfThree(int n) {
      return (n%3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
      return (n%3 == 0 && n%2 != 0);
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String result = "";
        for (int i = 1; i <= times; i++) {
            result += input;
        }
        return result;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        int index = input.toLowerCase().indexOf("q");
        if (index != -1) {
            return input.substring(0, index);
        } else
            return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person p1 = new Person("Ada");
        return p1;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person p1 = new Person("Alan Turing");
        p1.setCity("London");
        return p1;
    }

    public static boolean isFromLondon(Person person) {
        String city = person.getCity();
        if (city == null)
            return false;
        else
            return person.getCity().equalsIgnoreCase("London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Guilford"));
        places.add(new Place("West Palm Beach"));
        places.add(new Place("Cancun"));
        return places;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String, Person> people = new HashMap<String, Person>();

        Person alan = new Person("Alan Turing");
        Person grace = new Person("Grace Hopper");
        alan.setCity("London");
        grace.setCity("Arlington");

        people.put("Alan Turing", alan);
        people.put("Grace Hopper", grace);
        return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        Person alan = new Person("Alan Turing");
        alan.setCity("Prinston");
        people.put("Alan Turing", alan);

    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
