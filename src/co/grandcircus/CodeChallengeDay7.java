package co.grandcircus;

import java.util.Scanner;



public class CodeChallengeDay7
{
   public static void main(String[] args) {
      String[] firstName = { "Amber", "Kim", "Kevin", "Shawn", "Adam", "Jack", "Rachel", "Lisa", "Charles", "Alfred" };
      String[] lastName = { "LastName1", "LastName2", "LastName3", "LastName4", "LastName5", "LastName6", "LastName7",
            "LastName8", "LastName9", "LastName10" };
      String[] HomeTown = { "Detroit, Mi", "Dearborn, Mi", "Dearborn Heights, Mi", "Dexter, Mi", "Dayton, Ohio",
            "Dallas, Texas", "Denver, Colarado", "Detroit, Mi", "Pandoa, Ohio", "Pittsburgh, PA" };
      String[] favFood = { "banana", "tomatoe", "orange", "stawberry", "raspberry", "blueberry", "blackberry",
            "gooseberry", "huckleberry", "poisonberry" };
      System.out.println("Which student would you like to learn more about? Enter a number 1-10:");
      Scanner scan = new Scanner(System.in);
      int input = 0;
      String temporarySingleFirstName = null;
      String temporaryHomeTown = null;
      String temporaryFav = null;
      boolean tryTryAgain = true;
      do {
         try {
            input = scan.nextInt();
            scan.nextLine();
            temporarySingleFirstName = firstName[input - 1];
            System.out.println("You chose: " + temporarySingleFirstName + " " + lastName[input - 1]);
            tryTryAgain = false;
         } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("This student does not exist. Choose a number 1-10");
         } catch (IllegalArgumentException iae) {
            System.out.println("That's not a number. Please try again.");
         }
      } while (tryTryAgain);
      boolean keepTrying = true;
      do {
         temporaryHomeTown = HomeTown[input - 1];
         System.out.println();
         System.out.println(
               "What would you like to know about " + temporarySingleFirstName + "? Hometown or Favorite Food?");
         String input2 = scan.nextLine();
         if (input2.equalsIgnoreCase("Hometown")) {
            System.out.println(temporarySingleFirstName + " is from " + temporaryHomeTown);
         }
         else if (input2.equalsIgnoreCase("Favorite food")) {
            temporaryFav = favFood[input - 1];
            System.out.println(temporarySingleFirstName + " loves " + temporaryFav);
         }
         else {
            System.out.println("That data is not available. Please try again.");
         }
         System.out.println("Would you like to know more (yes/no)?");
         String yesNo = scan.nextLine();
         if (yesNo.equalsIgnoreCase("yes")) {
         }
         else {
            keepTrying = false;
         }
      } while (keepTrying == true);
   }
}