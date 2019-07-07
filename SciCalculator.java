import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int operation = 0;

        double currentResult = 0;
        double totalResult=0;
        double firstOperand=0;
        double secondOperand=0;
        int fl=0;

        int calculation = 0;
        System.out.println("Current Result: 0.0");

        do {
            //Calculator menu with four functions
            if(fl==0)
            { printMenu(); }
            fl=0;
            // read as string and convert to integer value
            operation = Integer.parseInt(scnr.nextLine());

            if(operation>=1 && operation<=6)
            {

                System.out.print("Enter first operand: ");
                String firstOperandStr = scnr.nextLine();
                // if result is entered use result as the operand value
                if ("RESULT".equalsIgnoreCase(firstOperandStr)) {
                    firstOperand = currentResult;
                } else {
                    // convert the input to double
                    firstOperand = Double.parseDouble(firstOperandStr);
                }

                System.out.print("Enter second operand: ");
                String secondOperandStr = scnr.nextLine();
                if ("RESULT".equalsIgnoreCase(secondOperandStr)) {
                    secondOperand = currentResult;
                } else {
                    secondOperand  = Double.parseDouble(secondOperandStr);
                }

                System.out.println();
            }
            // Operation dictation based on users choice.
            switch (operation) {

                case 0:
                    //Exit
                    System.out.println("\nThanks for using this calculator. Goodbye!");
                    System.exit(0);

                case 1:
                    //Addition
                    currentResult = firstOperand + secondOperand;
                    calculation++;
                    totalResult = totalResult + currentResult;
                    System.out.println("Current Result " + currentResult);
                    break;
                case 2:
                    //Subtraction
                    currentResult = firstOperand - secondOperand;
                    calculation++;
                    totalResult = totalResult + currentResult;
                    System.out.println("Current Result " + currentResult);
                    break;
                case 3:
                    //Multiplication
                    currentResult = firstOperand * secondOperand;
                    calculation++;
                    totalResult = totalResult + currentResult;
                    System.out.println("Current Result " + currentResult);
                    break;
                case 4:
                    //Division
                    currentResult = firstOperand / secondOperand;
                    calculation++;
                    totalResult = totalResult + currentResult;
                    System.out.println("Current Result " + currentResult);
                    break;
                case 5:
                    //Expo.
                    currentResult = Math.pow(firstOperand, secondOperand);
                    calculation++;
                    totalResult = totalResult + currentResult;
                    System.out.println("Current Result " + currentResult);
                    break;

                case 6:
                    //Log
                    currentResult = Math.log(firstOperand) / Math.log(secondOperand);
                    calculation++;
                    totalResult = totalResult + currentResult;
                    System.out.println("Current Result " + currentResult);
                    break;

                case 7:
                    //Average
                    if(calculation==0)
                    {
                        System.out.println("\nError: No calculations yet to average!");
                        System.out.print("\nEnter Menu Selection: ");
                        fl=1;
                        break;
                    }
                    System.out.println("\nSum of calculation: "+ totalResult);
                    System.out.println("Number of Calculations: " + calculation);
                    System.out.printf("Average of Calculations: %.2f", totalResult/calculation);
                    System.out.println();
                    System.out.print("\nEnter Menu Selection: ");
                    fl=1;
                    break;

                default:
                    System.out.println("\nError: Invalid selection!");
                    System.out.print("\nEnter Menu Selection: ");
                    fl=1;


            }
        } while (operation != 0);
        scnr.close();
    }

    public static void printMenu()
    {
        System.out.println("");
        System.out.println("Calculator Menu");
        System.out.println("---------------");

        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println();
        System.out.print("Enter Menu Selection: ");
    }
}
