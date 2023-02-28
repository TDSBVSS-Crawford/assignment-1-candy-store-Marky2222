public class CandyStore {
    import java.util.Scanner;
    public static void main(String[] args) {
        // Main method. 
        
    } //end main

    public static String candyChoices() {
        // this method should print out all the candy choices and prompt the user to make a choice
        Scanner input = new Scanner(System.in);
        System.out.print("Here are the candy options:" + "a) Reese's pieces: $2.50/0.5 kg" + "b) Skittles: $1.75/1 kg" + "c) Jubjubes $0.50/1 kg" + "d) Lollipops 1 for $0.50 or 5 for $2.00" + "e) Smarties $1.50/1 kg");
        System.out.print("Which one do you want?");
        String choice = input.nextLine();
        System.out.print("How much do you want?");
        Double quantity = input.nextDouble();

        return choice + quantity; //change this return statement to return the user's choice
    }

    public static Double calculateCost(String choice, int qty) {
        // this method should calculate the total cost of purchasing a type of candy
        return 0.0;
    }
} // end class
