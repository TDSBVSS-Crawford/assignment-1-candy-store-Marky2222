import java.util.Scanner;
public class CandyStore {
    public static void main(String[] args) {
        // Main method. 
        candyChoices();
    } //end main

    public static String candyChoices() {
        // this method should print out all the candy choices and prompt the user to make a choice
        Scanner input = new Scanner(System.in);
        System.out.println("Here are the candy options:" + " a) Reese's pieces: $2.50/0.5 kg" + " b) Skittles: $1.75/1 kg" + " c) Jubjubes $0.50/1 kg" + " d) Lollipops 1 for $0.50 or 5 for $2.00" + " e) Smarties $1.50/1 kg");
        System.out.print("Which one do you want?");
        String choice = input.nextLine();
        System.out.print("How much do you want?");
        Double quantity = input.nextDouble();

        if (choice = a); {
        System.out.print("Total cost for" + quantity + "kg of" + choice + "is");
    }
    if (choice = a); {
        System.out.print("Total cost for" + quantity + "kg of" + choice + "is");
    } 
    if (choice = b); {
        System.out.print("Total cost for" + quantity + "kg of" + choice + "is");
    }
    if (choice = c); {
        System.out.print("Total cost for" + quantity + "kg of" + choice + "is");
    }
    if (choice = d); {
        System.out.print("Total cost for" + quantity + "kg of" + choice + "is");
    }
    if (choice = e); {
        System.out.print("Total cost for" + quantity + "kg of" + choice + "is");
    }

        System.out.print("Total cost for" + quantity + "kg" + " of" + choice + "is");
        return (quantity + choice);  //change this return statement to return the user's choice
        
    }

    public static double calculateCost(String choice, double qty) {
        // this method should calculate the total cost of purchasing a type of candy
        
        
        
        
        return 0.0;
    }
} // end class
