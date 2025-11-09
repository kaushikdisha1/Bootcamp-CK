import java.util.*;

// 1.Accept a number and find the sum of all its digits. E.g. 1234 → 10 (1+2+3+4)
class DigitSum {
    void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}

// Sample Input/Output
// Input: 1234
// Output: The sum of the digits is: 10


// 2. Print the multiplication table for any number entered by the user
class TablePrint {
    void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}

// Sample Input/Output
// Input: 5
// Output:
// Multiplication Table for 5:
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50


// 3. Calculate the factorial of a number using a for loop.
class Factorial {
    void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        System.out.println("Factorial = " + f);
    }
}

// Sample Input/Output
// Input: 5
// Output: The factorial of 5 is: 120


// 4. Reverse the digits of an integer using a while loop.
class ReverseDigit {
    void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println("Reversed = " + rev);
    }
}

// Sample Input/Output
// Input: 1234
// Output: The reversed number is: 4321


// 5. Create a Calculator class with methods add, subtract, multiply, and divide.
class Calculator {
    int add(int a,int b){ return a+b; }
    int sub(int a,int b){ return a-b; }
    int mul(int a,int b){ return a*b; }
    double div(int a,int b){
        if(b==0) throw new ArithmeticException("Cannot divide by zero");
        return (double)a/b;
    }
}
class CalcRunner {
    void solve(){
        Scanner sc=new Scanner(System.in);
        Calculator c=new Calculator();
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println("Add = "+c.add(a,b));
        System.out.println("Sub = "+c.sub(a,b));
        System.out.println("Mul = "+c.mul(a,b));
        try{
            System.out.println("Div = "+c.div(a,b));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

// Sample Input/Output
// Input: 10, 2
// Output:
// Addition: 12
// Subtraction: 8
// Multiplication: 20
// Division: 5.0

// Input: 10, 0
// Output:
// Addition: 10
// Subtraction: 10
// Multiplication: 0
// Division: Division by zero is not allowed.


// 6. Create a Student class with fields for name and marks in 3 subjects. Add a method to calculate total and average marks.
class Student {
    private String name;
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public Student(String name, int subject1Marks, int subject2Marks, int subject3Marks) {
        this.name = name;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public int getTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks;
    }

    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    public String getName() {
        return name;
    }
}

class StudentDemo {
    void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks for subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int s3 = sc.nextInt();

        Student student = new Student(name, s1, s2, s3);
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Average Marks: " + student.getAverageMarks());
    }
}

// Sample Input/Output
// Input:
// Enter student name: John
// Enter marks for subject 1: 85
// Enter marks for subject 2: 90
// Enter marks for subject 3: 80
// Output:
// Total Marks for John: 255
// Average Marks for John: 85.0


// 7. Create a BankAccount class with accountNumber, holderName, and balance.Add a constructor to initialize these fields.
class SimpleAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public SimpleAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Initial Balance: " + balance);
    }
}

class SimpleAccountDemo {
    void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String ac = sc.nextLine();
        System.out.print("Enter holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        SimpleAccount acc = new SimpleAccount(ac, name, bal);
        acc.display();
    }
}

// Sample Input/Output
// Input:
// Enter account number: 123456789
// Enter holder name: Alice
// Enter initial balance: 1000.50
// Output:
// Account created successfully!
// Account Number: 123456789
// Holder Name: Alice
// Initial Balance: 1000.50


// 8. Create a class where every time an object is created, a static counter increases. Print how many objects have been created.
class ObjectCounter {
    private static int count = 0;
    public ObjectCounter() { count++; }
    public static int getCount(){ return count; }
}

class ObjectCounterDemo {
    void solve(){
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println("Objects Created: " + ObjectCounter.getCount());
    }
}

// Sample Output
// Number of objects created: 3


// 9. Create a MathUtils class with static methods for max, min, and average. Call these without creating an object.
class MathUtils {
    public static int max(int a, int b){ return (a > b) ? a : b; }
    public static int min(int a, int b){ return (a < b) ? a : b; }
    public static double avg(int a, int b){ return (a + b) / 2.0; }
}
class MathUtilsDemo {
    void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Max: " + MathUtils.max(a, b));
        System.out.println("Min: " + MathUtils.min(a, b));
        System.out.println("Average: " + MathUtils.avg(a, b));
    }
}

// Sample Output
// Max: 20
// Min: 10
// Average: 15.0


// 10. Create a Book class with fields title, author, and price. Initialize them using a parameterized constructor.
class Book {
    private String title, author;
    private double price;
    public Book(String t, String a, double p){ title=t; author=a; price=p; }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class BookDemo {
    void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String t = sc.nextLine();
        System.out.print("Enter author: ");
        String a = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();
        new Book(t,a,p).display();
    }
}

// Sample Input/Output
// Input:
// Enter book title: Java Programming
// Enter book author: John Doe
// Enter book price: 29.99
// Output:
// Book Details:
// Title: Java Programming
// Author: John Doe
// Price: 29.99


// 11. Create a Car class with overloaded constructors — one that sets only the model name and another that sets model and price.
class Car {
    private String model;
    private double price;

    public Car(String model) {
        this.model = model;
        this.price = 0.0; // Default price
    }

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void display() { 
        System.out.println("Model: " + model + ", Price: " + price); 
        }
}

class CarDemo {
    void solve(){
        Car c1 = new Car("Toyota");
        Car c2 = new Car("Honda", 450000);
        c1.display();
        c2.display();
    }
}

// Sample Output
// Car 1 Model: Toyota, Price: 0.0
// Car 2 Model: Honda, Price: 25000.0


// 12. Division with Exception
// Accept two integers from user and divide them.
// Handle division by zero using try-catch.
// Print “Division completed” in a finally block.
class DivisionDemo {
    void solve(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter two numbers: ");
            int a=sc.nextInt(), b=sc.nextInt();
            System.out.println("Result = " + (a/b));
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Division Completed.");
        }
    }
}

// Sample Input/Output
// Input:
// Enter first integer: 10
// Enter second integer: 2
// Output:
// Division Result: 5
// Division completed.

// Input:
// Enter first integer: 10
// Enter second integer: 0
// Output:
// Error: Division by zero is not allowed.
// Division completed.


// 13. Nested try-catch
// Write a program where an inner try block may throw ArithmeticException, and an outer try block may throw ArrayIndexOutOfBoundsException.
// Handle both appropriately.
class NestedTryDemo {
    void solve(){
        try{
            try{
                int x = 10/0;
            } catch(ArithmeticException e){
                System.out.println("Inner: Division by zero.");
            }
            int arr[] = {1,2,3};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer: Array index error.");
        }
    }
}

// Sample Output
// Error: Division by zero is not allowed.
// Error: Array index is out of bounds.


// 14. Exception Propagation (Method Chain)
// Write three methods (m1(), m2(), m3()):
// m1() calls m2(), and m2() calls m3().
// m3() divides by zero.
// Observe how the exception propagates up the chain and catch it in m1().
class PropagationDemo {
    static void m3() { 
        int x = 10/0; 
        }
    static void m2() { 
        m3(); 
        }
    static void m1() { 
        m2(); 
        }
    void solve() {
        try { 
            m1(); 
            } catch(Exception e) { 
                System.out.println("Caught in main: Division by zero."); 
                }
    }
}

// Sample Output
// Error: Division by zero is not allowed.

// Re-throw Exception
// Catch an exception inside a try-catch block, print a message,
// then re-throw it to be handled by another catch block at a higher level.
class ReThrowDemo {
    static void methodA() throws Exception {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Caught in methodA: " + e.getMessage());
            throw e; // Re-throwing
        }
    }

    static void methodB() throws Exception {
        throw new Exception("An error occurred in methodB");
    }

    void solve() {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Handled in solve(): " + e.getMessage());
        }
    }
}

// Sample Output
// Caught in methodA: An error occurred in methodB
// Handled in main: An error occurred in methodB


// 15. Custom Exception: InvalidEmailException
// Validate an email string.
// Throw InvalidEmailException if it doesn’t contain an “@” symbol.
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailDemo {
    static void validate(String email) throws InvalidEmailException {
        if(!email.contains("@")) throw new InvalidEmailException("Invalid Email Format");
    }
    void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String e = sc.nextLine();
        try{ 
            validate(e); System.out.println("Valid Email"); 
            } catch(Exception ex){ 
                System.out.println(ex.getMessage()); 
            }
    }
}

// Sample Output
// Error: Invalid email format


// 16. Customer POJO
// Create a Customer class with id, name, email.
// Create 3 objects and print their details using a list.
class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}
class CustomerDemo {
    void solve(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Alice", "alice@example.com"));
        customers.add(new Customer(2, "Bob", "bob@example.com"));
        customers.add(new Customer(3, "Charlie", "charlie@example.com"));

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

// Sample Output
// Customer ID: 1, Name: Alice, Email: alice@example.com
// Customer ID: 2, Name: Bob, Email: bob@example.com
// Customer ID: 3, Name: Charlie, Email: charlie@example.com


// 17. Mini Banking Application
// Create a BankAccount class with deposit(), withdraw(), and getBalance() methods.
// Add exception handling for invalid amounts and overdrafts.
// Keep track of total accounts using a static variable.
class BankAccount {
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount() {
        this.balance = 0;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdraw amount or insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

class SimpleBankDemo {
    void solve(){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        try {
            account1.deposit(500);
            account1.withdraw(200);
            System.out.println("Account 1 Balance: " + account1.getBalance());

            account2.deposit(300);
            account2.withdraw(400); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}

// Sample Output
// Account 1 Balance: 300.0
// Error: Invalid withdraw amount or insufficient funds
// Total Bank Accounts: 2


// 18. Employee Management System
// Create an Employee class (POJO).
// Extend it with FullTimeEmployee and PartTimeEmployee subclasses.
// Override a method to calculate salary differently for each.
// Use polymorphism to call methods on a list of employees.
class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double calculateSalary() {
        return 0.0;
    }
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
class EmployeeDemo {
    void solve(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Alice", 1, 3000.0));
        employees.add(new PartTimeEmployee("Bob", 2, 20.0, 80));

        for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.calculateSalary());
        }
    }
}

// Sample Output
// Employee ID: 1, Name: Alice, Salary: 3000.0
// Employee ID: 2, Name: Bob, Salary: 1600.0


// 19. Product Catalog (with Encapsulation & Exceptions)
// Create a Product class with private fields for id, name, and price.
// Throw a custom exception if price is negative.
// Create 3–5 product objects and display their details.
class NegativePriceException extends Exception {
    public NegativePriceException(String message) {
        super(message);
    }
}
class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) throws NegativePriceException {
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}
class ProductDemo {
    void solve(){
        List<Product> products = new ArrayList<>();
        try {
            products.add(new Product(1, "Laptop", 999.99));
            products.add(new Product(2, "Smartphone", 499.99));
            products.add(new Product(3, "Headphones", -50.0)); // This will throw an exception
        } catch (NegativePriceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }
}

// Sample Output
// Error: Price cannot be negative
// Product ID: 1, Name: Laptop, Price: 999.99
// Product ID: 2, Name: Smartphone, Price: 499.99
// Product ID: 3, Name: Headphones, Price: -50.0
// (Note: The last product will not be added due to the exception)

//Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n===== MENU (Programs 6 to 19) =====");
            System.out.println("1. Digit Sum");
            System.out.println("2. Print Table");
            System.out.println("3. Factorial");
            System.out.println("4. Reverse Digit");
            System.out.println("5. Calculator");
            System.out.println("6. Student Marks");
            System.out.println("7. Bank Account");
            System.out.println("8. Object Counter");
            System.out.println("9. Math Utils");
            System.out.println("10. Book");
            System.out.println("11. Car");
            System.out.println("12. Division Exception");
            System.out.println("13. Nested Try");
            System.out.println("14. Exception Propagation");
            System.out.println("15. Email Validation");
            System.out.println("16. Customer List");
            System.out.println("17. Mini Banking System");
            System.out.println("18. Employee Payroll");
            System.out.println("19. Product Catalog");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            int ch = sc.nextInt();
            switch(ch){
                case 1: new DigitSum().solve(); break;
                case 2: new TablePrint().solve(); break;
                case 3: new Factorial().solve(); break;
                case 4: new ReverseDigit().solve(); break;
                case 5: new CalcRunner().solve(); break;
                case 6: new StudentDemo().solve(); break;
                case 7: new SimpleAccountDemo().solve(); break;
                case 8: new ObjectCounterDemo().solve(); break;
                case 9: new MathUtilsDemo().solve(); break;
                case 10: new BookDemo().solve(); break;
                case 11: new CarDemo().solve(); break;
                case 12: new DivisionDemo().solve(); break;
                case 13: new NestedTryDemo().solve(); break;
                case 14: new PropagationDemo().solve(); break;
                case 15: new EmailDemo().solve(); break;
                case 16: new CustomerDemo().solve(); break;
                case 17: new SimpleBankDemo().solve(); break;
                case 18: new EmployeeDemo().solve(); break;
                case 19: new ProductDemo().solve(); break;
                case 0: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
            
            sc.close();
    }
}