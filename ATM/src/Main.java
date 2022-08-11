import java.util.Scanner;

/**
 * @author India Green
 *
 * This program acts as an ATM machine for customers where their bills are displayed and they can add,
 * subtract, or transfer bills or you can use it in operator mode to display, add and withdraw bills
 */

public class Main {

    //Runs program
    public static void main(String[] args) {
        Mode();
    }

    //Asks if you want to be in customer or operator mode then goes to that mode
    public static void Mode() {
        System.out.println("What mode? (type operator or customer)");
        String a = scan.nextLine();
        if (a.equalsIgnoreCase("operator")) {
            Operator();
        }
        else if (a.equalsIgnoreCase("customer")) {
            Customer();
        }
        else
        {
            System.out.println("Invalid selection. Retry\n");
            Mode();
        }
    }

    //first screen in operator mode, if password is entered correctly, goes to OperatorWithdrawDepositOrExit()
    public static void Operator() {

        String pass = "password";

        System.out.println("Enter operator password: ");
        String s = scan.nextLine();
        if (s.equalsIgnoreCase(pass)) {
            OperatorWithdrawDepositOrExit();

        } else
        {
            System.out.println("Invalid password. Retry\n");
            Operator();
        }
    }

    //Displays # of bills then asks whether you'd like to deposit, withdraw or exit
    public static void OperatorWithdrawDepositOrExit(){
        System.out.println("\nNumber of Bills:\n100 Dollar Bills: " + hundredDollarBills +
                "\n50 Dollar Bills: " + fiftyDollarBills + "\n20 Dollar Bills: " + twentyDollarBills +
                "\nFive Dollar Bills: " + fiveDollarBills);
        System.out.println("\nType 1 to deposit, 2 to withdraw, 3 to exit");
        int input = scan.nextInt();
        scan.nextLine();
        if (input == 1) {
            OperatorDeposit();
        }
        else if (input == 2) {
            OperatorWithdraw();
        }
        else if (input == 3) {
            System.out.println("Thank you. Have a nice day");
        }
        else{
            System.out.println("Invalid selection. Retry\n");
            OperatorWithdrawDepositOrExit();
        }

    }

    //Asks whether you want to withdraw from hundred, fifty, twenty, or five dollar bills
    public static void OperatorWithdraw()
    {
        System.out.println("\nType 1 to withdraw from 100s, 2 to withdraw from 50s, 3 to withdraw from 20s" +
                ", 4 to withdraw from 5s");
        int input2 = scan.nextInt();
        if (input2 == 1) {
            WithdrawHundredDollarBills();
        }
        else if (input2 == 2) {
            WithdrawFiftyDollarBills();
        }
        else if (input2 == 3) {
            WithdrawTwentyDollarBills();
        }
        else if (input2 == 4) {
            WithdrawFiveDollarBills();
        }
        else{
            System.out.println("Invalid selection. Retry.\n");
            OperatorWithdraw();
        }
    }

    //withdraws specified amount from hundred dollar bills
    public static void WithdrawHundredDollarBills(){
        System.out.println("How many 100 dollar bills would you like to withdraw?");
        int takeOut = scan.nextInt();
        if (takeOut <= hundredDollarBills) {
            hundredDollarBills = hundredDollarBills - takeOut;
            System.out.println("100 Dollar Bills Total: " + hundredDollarBills);
            OperatorAnotherTransaction();
        }
        else
        {
            System.out.println("Invalid input. Retry\n");
            WithdrawHundredDollarBills();
        }
    }

    //withdraws specified amount from fifty dollar bills
    public static void WithdrawFiftyDollarBills(){
        System.out.println("How many 50 dollar bills would you like to withdraw?");
        int takeOut = scan.nextInt();
        if (takeOut <= fiftyDollarBills) {
            fiftyDollarBills = fiftyDollarBills - takeOut;
            System.out.println("50 Dollar Bills Total: " + fiftyDollarBills);
            OperatorAnotherTransaction();
        }
        else
        {
            System.out.println("Invalid input. Retry\n");
            WithdrawFiftyDollarBills();
        }
    }

    //withdraws specified amount from twenty dollar bills
    public static void WithdrawTwentyDollarBills(){
        System.out.println("How many 20 dollar bills would you like to withdraw?");
        int takeOut = scan.nextInt();
        if (takeOut <= twentyDollarBills) {
            twentyDollarBills = twentyDollarBills - takeOut;
            System.out.println("20 Dollar Bills Total: " + twentyDollarBills);
            OperatorAnotherTransaction();
        }
        else
        {
            System.out.println("Invalid input. Retry\n");
            WithdrawTwentyDollarBills();
        }
    }
    //withdraws specified amount from five dollar bills
    public static void WithdrawFiveDollarBills() {
        System.out.println("How many 5 dollar bills would you like to add?");
        int takeOut = scan.nextInt();
        if (takeOut <= fiveDollarBills) {
            fiveDollarBills = fiveDollarBills - takeOut;
            System.out.println("5 Dollar Bills Total: " + fiveDollarBills);
            OperatorAnotherTransaction();
        }
        {
            System.out.println("Invalid input. Retry\n");
            WithdrawFiveDollarBills();
        }
    }

    // Deposits money to specified account then updates amount
    public static void OperatorDeposit(){
        System.out.println("\nType 1 to add to 100s, 2 to add to 50s, 3 to add to 20s" +
                ", 4 to add to 5s");
        int input2 = scan.nextInt();
        if (input2 == 1) {
            System.out.println("How many 100 dollar bills would you like to add?");
            int add = scan.nextInt();
            hundredDollarBills = add + hundredDollarBills;
            System.out.println("100 Dollar Bills Total: " + hundredDollarBills);
            OperatorAnotherTransaction();
        }
        else if (input2 == 2) {
            System.out.println("How many 50 dollar bills would you like to add?");
            int add = scan.nextInt();
            fiftyDollarBills = add + fiftyDollarBills;
            System.out.println("50 Dollar Bills Total: " + fiftyDollarBills);
            OperatorAnotherTransaction();
        }
        else if (input2 == 3) {
            System.out.println("How many 20 dollar bills would you like to add?");
            int add = scan.nextInt();
            twentyDollarBills = add + twentyDollarBills;
            System.out.println("20 Dollar Bills Total: " + twentyDollarBills);
            OperatorAnotherTransaction();
        }
        else if (input2 == 4) {
            System.out.println("How many 5 dollar bills would you like to add?");
            int add = scan.nextInt();
            fiveDollarBills = add + fiveDollarBills;
            System.out.println("5 Dollar Bills Total: " + fiveDollarBills);
            OperatorAnotherTransaction();
        }
        else{
            System.out.println("Invalid selection. Retry.\n");
            OperatorDeposit();
        }
    }

    //Asks if you want to do another transaction
    public static void OperatorAnotherTransaction(){
        System.out.println("\nWould you like to do another transaction?");
        scan.nextLine();
        String a = scan.nextLine();
        if (a.equalsIgnoreCase("yes")) {
            OperatorWithdrawDepositOrExit();
        }
        else if (a.equalsIgnoreCase("no")) {
            System.out.println("Thank you. Have a nice day");
        }
        else{
            System.out.println("Invalid selection. Retry\n");
            OperatorAnotherTransaction();
        }
    }

    //first screen in customer mode
    public static void Customer() {
        System.out.println("Please enter pin number:");
        CustomerAccounts();
    }

    //shows Customer Accounts once correct pin number is inputted that matches an account
    public static void CustomerAccounts() {

        int inputInt = scan.nextInt();
        scan.nextLine();
        //checks if input is equal to a pin number, if so displays their account information and they're able to
        // add, withdraw and transfer funds
        if (inputInt == personOnePin) {
            System.out.println("\nIndia Green");
            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);
            WithdrawDepositOrTransfer();
        }
        else if (inputInt == personTwoPin) {
            System.out.println("\nSally Johnson");
            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);
            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personThreePin) {

            System.out.println("\nEric Black");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personFourPin) {

            System.out.println("\nJennifer Star");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personFivePin) {

            System.out.println("\nPhilip May");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personSixPin) {

            System.out.println("\nSally Johnson");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personSevenPin) {

            System.out.println("\nBen Stall");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personEightPin) {

            System.out.println("\nBrad Moon");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personNinePin) {

            System.out.println("\nLarry Brown");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }

        else if (inputInt == personTenPin) {

            System.out.println("\nBilly Bob");

            System.out.println("Checking Account: $" + cBalance);
            System.out.println("Savings Account: $" + sBalance);

            WithdrawDepositOrTransfer();
        }
        else {
            System.out.println("Invalid pin. Retry\n");
            Customer();
        }
    }

    // Asks whether you want to withdraw, deposit or transfer
    public static void WithdrawDepositOrTransfer(){
        System.out.println("\nWhat would you like to do?\nWithdraw\tDeposit\tTransfer");
        String c = scan.nextLine();
        if (c.equalsIgnoreCase("withdraw")) {
            Withdraw();
        } else if (c.equalsIgnoreCase("deposit")) {
            Deposit();
        } else if (c.equalsIgnoreCase("transfer")) {
            Transfer();
        }
        else{
            System.out.println("Invalid selection. Retry\n");
            WithdrawDepositOrTransfer();
        }
    }

    // Asks if you want to do another transaction
    public static void AnotherTransaction(){
        System.out.println("\nWould you like to do another transaction?");
        scan.nextLine();
        String a = scan.nextLine();
        if (a.equalsIgnoreCase("yes")) {
            WithdrawDepositOrTransfer();
        }
        else if (a.equalsIgnoreCase("no")) {
            System.out.println("Thank you. Have a nice day");
        }
        else{
            System.out.println("Invalid selection. Retry\n");
            AnotherTransaction();
        }
    }

    // Deducts amount and updates the amount
    public static void Withdraw() {
        System.out.println("Withdraw from which account? (type checking or savings)");
        String inputString = scan.nextLine();
        if (inputString.equalsIgnoreCase("checking")) {
            WithdrawFromChecking();
        }
        else if (inputString.equalsIgnoreCase("savings")) {
            WithdrawFromSavings();
        }
        else {
            System.out.println("Invalid selection. Retry\n");
            Withdraw();
        }

    }

    // Deducts amount from checking account and updates the amount
    public static void WithdrawFromChecking() {
        System.out.println("How much would you like to withdraw?");
        double d = scan.nextDouble();
        if (d > cBalance) {
            System.out.println("Invalid Amount. Retry\n");
            WithdrawFromChecking();
        }
        else {
            cNewBalance = cBalance - d;
            cBalance = Math.round(cNewBalance * 100.00) / 100.00;

            System.out.println("Checking Account New Balance: $" + cBalance);
            AnotherTransaction();
        }
    }

    // Deducts amount from savings account and updates the amount
    public static void WithdrawFromSavings(){
        System.out.println("How much would you like to withdraw?");
        double d = scan.nextDouble();
        if (d > sBalance) {
            System.out.println("Invalid Amount. Retry\n");
            WithdrawFromSavings();
        } else {
            sNewBalance = sBalance - d;
            sBalance = Math.round(sNewBalance * 100.00) / 100.00;
            System.out.println("Savings Account New Balance: $" + sBalance);
            AnotherTransaction();
        }
    }

    // Asks what account you want money deposited to then updates amount
    public static void Deposit() {
        System.out.println("Deposit to which account? (checking or savings)");
        String s = scan.nextLine();
        if (s.equalsIgnoreCase("checking")) {
            System.out.println("How much would you like to deposit?");
            double d = scan.nextDouble();
            cNewBalance = cBalance + d;
            cBalance = Math.round(cNewBalance * 100.00) / 100.00;
            System.out.println("Checking Account New Balance: $" + cBalance);
            AnotherTransaction();

        }
        else if (s.equalsIgnoreCase("savings")) {
            System.out.println("How much would you like to deposit?");
            double d = scan.nextDouble();
            sNewBalance = sBalance + d;
            sBalance = Math.round(sNewBalance * 100.00) / 100.00;
            System.out.println("Savings Account New Balance: $" + sBalance);
            AnotherTransaction();

        }
        else {
            System.out.println("Invalid selection. Retry\n");
            Deposit();
        }
    }

    // Asks how you would like your money transferred
    public static void Transfer(){
        System.out.println("Would you like to transfer between accounts or to another recipient? (type between " +
                "or another)");
        String s = scan.nextLine();
        if (s.equalsIgnoreCase("between")) {
            TransferBetween();
        }
        else if (s.equalsIgnoreCase("another")) {
            TransferToAnotherUser();
        }
        else {
            System.out.println("Invalid selection. Retry.\n");
            Transfer();
        }

    }

    // Updates amount between accounts
    public static void TransferBetween() {
        System.out.println("Type 1 to transfer from savings to checking. Type 2 to transfer from checking" +
                " to savings");
        int i = scan.nextInt();
        scan.nextLine();
        if (i == 1)
            HowMuchAddedToChecking();
        else if (i == 2)
            HowMuchAddedToSavings();
        else {
            System.out.println("Invalid selection. Retry\n");
            TransferBetween();

        }

    }

    //Adds specified amount to checking account
    public static void HowMuchAddedToChecking(){
        System.out.println("How much would you like to add to your checking account?");
        double d = scan.nextDouble();
//        scan.nextLine();
        if (d > sBalance) {
            System.out.println("Invalid selection. Retry.\n");
            HowMuchAddedToChecking();
        }

        else {
            sNewBalance = sBalance - d;
            sBalance = Math.round(sNewBalance * 100.00) / 100.00;
            cNewBalance = cBalance + d;
            cBalance = Math.round(cNewBalance * 100.00) / 100.00;
            System.out.println("New Savings Account Balance: $" + sBalance);
            System.out.println("New Checking Account Balance: $" + cBalance);
            AnotherTransaction();
        }
    }

    //Adds specified amount to savings account
    public static void HowMuchAddedToSavings(){
        System.out.println("How much would you like to add to your savings account?");
        double d = scan.nextDouble();
//        scan.nextLine();
        if (d > sBalance) {
            System.out.println("Invalid selection. Retry.\n");
            HowMuchAddedToSavings();
        }
        else {
            cNewBalance = cBalance - d;
            cBalance = Math.round(cNewBalance * 100.00) / 100.00;
            sNewBalance = sBalance + d;
            sBalance = Math.round(sNewBalance * 100.00) / 100.00;
            System.out.println("New Savings Account Balance: $" + sBalance);
            System.out.println("New Checking Account Balance: $" + cBalance);
            AnotherTransaction();
        }
    }


    // Updates amount after money is transferred to another user
    public static void TransferToAnotherUser() {
        System.out.println("Which account would you like to send from? (type checking or savings)");
        String str = scan.nextLine();
        if (str.equalsIgnoreCase("checking"))
            SentFromChecking();

        else if (str.equalsIgnoreCase("savings"))
            SentFromSavings();

        else{
            System.out.println("Invalid selection. Retry\n");
            TransferToAnotherUser();
        }
    }

    // deducts amount out of checking then updates checking amount
    public static void SentFromChecking(){
        System.out.println("How much would you like to send?");
        double send = scan.nextDouble();
//        scan.nextLine();
        if (send > cBalance) {
            System.out.println("Number larger than amount in checking. Retry");
            SentFromChecking();
        }
        else {
            cNewBalance = cBalance - send;
            cBalance = (cNewBalance * 100.00) / 100.00;
            System.out.println("New Checking Account Balance: " + cBalance);
            AnotherTransaction();
        }
    }

    // deducts amount out of savings then updates savings amount
    public static void SentFromSavings(){
        System.out.println("How much would you like to send?");
        double send = scan.nextDouble();
//        scan.nextLine();
        if (send > cBalance) {
            System.out.println("Number larger than amount in savings. Retry");
            SentFromSavings();
        }
        else {
            cNewBalance = cBalance - send;
            cBalance = (cNewBalance * 100.00) / 100.00;
            System.out.println("New Checking Account Balance: " + cBalance);
            AnotherTransaction();
        }
    }

    //sets pin numbers to people
    static int personOnePin = 1111;
    static int personTwoPin = 1001;
    static int personThreePin = 2345;
    static int personFourPin = 4069;
    static int personFivePin = 7912;
    static int personSixPin = 9090;
    static int personSevenPin = 0000;
    static int personEightPin = 1216;
    static int personNinePin = 3333;
    static int personTenPin = 8928;

    static Scanner scan = new Scanner(System.in);

    static double cBalance = 100.32;
    static double sBalance = 954.55;
    static double cNewBalance;
    static double sNewBalance;

    static int hundredDollarBills = 100;
    static int fiftyDollarBills = 100;
    static int twentyDollarBills = 100;
    static int fiveDollarBills = 100;
}
