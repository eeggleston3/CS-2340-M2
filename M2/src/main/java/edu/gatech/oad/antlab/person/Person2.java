package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob, Avery Bartlett
 * @version 1.1
 */
public class Person2 {

    public static void main(String [] args) {
        System.out.print(calc("Abartlett8"));
    }
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private static String calc(String input) {
	  //Person 2 put your implementation here
		String output = "";
		Random rand = new Random();
		for (char c : input.toCharArray()) {
            output = (rand.nextInt(2) == 0) ? c + output : output + c;
		}
	  return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
