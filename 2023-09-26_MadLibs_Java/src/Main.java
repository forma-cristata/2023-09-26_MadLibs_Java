/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */
//Kaci Craycraft
//kcraycraft45

import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("Please write a singular noun (type done if finished): ");
        String noun1 = input.nextLine();


        while(!noun1.equalsIgnoreCase("done"))
        {
            System.out.print("Please choose another singular noun: ");
            String noun2 = input.nextLine();
            System.out.print("Please choose an adjective: ");
            String adj1 = input.nextLine();
            System.out.print("Please choose another adjective: ");
            String adj2 = input.nextLine();
            System.out.print("Please choose a verb (past tense): ");
            String verb = input.nextLine();
            System.out.println("You chose two nouns: " + noun1 + ", " + noun2 + ". You chose two adjectives: " + adj1 + ", " + adj2 + ". You chose one verb: " + verb + ".");
            int int_random = rand.nextInt(5);
            if(int_random == 1)
            {
                System.out.println("We are the " + adj1 + " men.  We are the " + adj2 + " " + noun2 + ". Our dried " + noun1 + " when we " + verb + " together are quiet and meaningless.");
            }
            else if(int_random == 2)
            {
                System.out.println(verb.toUpperCase() + " " + noun1 + " -if at all- not as " + adj1 + ", " + adj2 + " souls, but only as the hollow " + noun2 + ", the stuffed men.");
            }
            else if(int_random == 3)
            {
                System.out.println("Eyes I dare not meet in" + adj1 + " " + noun1 + ".  In death's " + adj2 + " " + noun2 + ", these do not " + verb + ".");
            }
            else if(int_random == 4)
            {
                System.out.println("This is the " + adj1 + " land, this is the " + adj2 + " land.  Here the stone " + noun1 + " are " + verb + ", here they receive the supplication of a dead man's " + noun2 + ".");
            }
            else if(int_random == 5)
            {
                System.out.println("This " + verb + " the way the " + adj1 + " " + noun2 + " ends, " + adj2 + " " + noun1 + " is the way the world ends, not with a bang but a whimper.");
            }
            System.out.print("Please write a singular noun (type done if finished): ");
            noun1 = input.nextLine();

        }

        if(noun1.equalsIgnoreCase("done"))
        {
            input.close();
            System.out.println("Thank you for using Kaci's Mad Libs!!");
        }

    }


}
