import java.util.Scanner;


public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    String noun1, pnoun, noun2, place, adjective, noun3;

        System.out.println("What is a noun?");
        noun1 = read.nextLine();

        System.out.println("What is a plural noun?");
        pnoun = read.nextLine();

        System.out.println("what is a Noun?");
        noun2 = read.nextLine();

        System.out.println("What is a place?");
        place = read.nextLine();

        System.out.println("What is an adjective?");
        adjective = read.nextLine();

        System.out.println("what is a noun?");
        noun3 = read.nextLine();

        System.out.println("Be kind to your " + noun1 + "-footed " + pnoun );
        System.out.println("For a duck may be somebody's " + noun2 );
        System.out.println("Be kind to your " + pnoun + "in " + place );
        System.out.println("Where the weather is always " + adjective );
        System.out.println("You may think that this is the poem " + noun3 );
    }



}