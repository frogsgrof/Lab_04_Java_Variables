public class Main {
    public static void main(String[] args) {

        // int variable declarations
        int intOperandA = 4;
        int intOperandB = 12;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        // double variable declarations
        double doubleOperandA = 13.4;
        double doubleOperandB = 12.6;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        // assigning int operation vars
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        // assigning double operation vars
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        // print statements for int operations
        System.out.println("The sum using ints of  " + intOperandA + "  and  " + intOperandB +  "  is  " + intSum + ".");
        System.out.println("The product using ints of  " + intOperandA + "  and  " + intOperandB +  "  is  " + intProduct + ".");
        System.out.println("The difference using ints of  " + intOperandA + "  and  " + intOperandB +  "  is  " + intDifference + ".");
        System.out.println("The quotient using ints of  " + intOperandA + "  and  " + intOperandB +  "  is  " + intQuotient + ".");
        System.out.println("The modulo using ints of  " + intOperandA + "  and  " + intOperandB +  "  is  " + intModulo + ".");

        // print statements for double operations
        System.out.println("The sum using doubles of  " + doubleOperandA + "  and  " + doubleOperandB +  "  is  " + doubleSum + ".");
        System.out.println("The product using doubles of  " + doubleOperandA + "  and  " + doubleOperandB +  "  is  " + doubleProduct + ".");
        System.out.println("The difference using doubles of  " + doubleOperandA +  " and  " + doubleOperandB +  "  is  " + doubleDifference + ".");
        System.out.println("The quotient using doubles of  " + doubleOperandA + "  and  " + doubleOperandB +  "  is  " + doubleQuotient + ".");
        System.out.println("The modulo using doubles of  " + doubleOperandA + "  and  " + doubleOperandB +  "  is  " + doubleModulo + ".");

        // pt II: initializing the variables
        int numKids = 1;
        boolean raining = false;
        double gasPrice = 3.41;
        int favNumber = 713;
        double shoeSize = 6.5;
        String birthMonth = "August";
        String name = "Isabelle Henson";

        // printing those variables in order
        System.out.println("The number of kids in my family is " + numKids + ".");

        if (raining) {
            System.out.println("It is currently raining."); // I wanted a nicer way of printing the rain variable
        } else {
            System.out.println("It is not currently raining.");
        }

        System.out.println("The current gas price is " + gasPrice + ".");
        System.out.println("My favorite number is " + favNumber + ".");
        System.out.println("My shoe size is " + shoeSize + ".");
        System.out.println("My birth month is " + birthMonth + ".");
        System.out.println("My name is " + name + ".");

    }

}