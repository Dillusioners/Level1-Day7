// Importing necessary packages
import java.util.*;

// EmployeeManagement class
class GymManagement{
// Creating Scanner object to get user input
static Scanner scanner = new Scanner(System.in);

// Creating an ArrayList to store employee records
static ArrayList<Employee> employeeList = new ArrayList<>();

// Main method
public static void main(String[] args) {
    boolean exit = false;
    
    // Displaying options to user using a while loop
    while (!exit) {
        System.out.println("\n Welcome to the Gym Management System!\n"
                         + "Please select an option:\n"
                         + "1. Add an Member\n"
                         + "2. Remove an Member\n"
                         + "3. Search for an Member\n"
                         + "4. View all Member\n"
                         + "5. Exit\n"
                         + "\n => Enter your option:- ");
        
        // Getting user input
        int choice = scanner.nextInt();
        
        // Switch case to perform different operations based on user input
        switch (choice) {
            case 1:
                addEmployee(); // Add a new employee record
                break;
            case 2:
                removeEmployee(); // Remove an existing employee record
                break;
            case 3:
                searchEmployee(); // Search for a specific employee record
                break;
            case 4:
                viewAllEmployees(); // View all employee records
                break;
            case 5:
                exit = true; // Exit the program
                break;
            default:
                System.out.println("Invalid input, please try again.  \n \n \n"); // Display error message for invalid input
        }
    }
}

// Method to add a new employee record
static void addEmployee() {
    scanner.nextLine(); // Consume the newline character left behind by scanner.nextInt()
    System.out.println("Please enter the Member's name:");
    String name = scanner.nextLine(); // Getting employee name from user input
    System.out.println("Please enter the Member's address:");
    String address = scanner.nextLine(); // Getting employee address from user input
    System.out.println("Please enter the Member's phone number:");
    String phone = scanner.nextLine(); // Getting employee phone number from user input
    System.out.println("Please enter the Member's salary:");
    double salary = scanner.nextDouble(); // Getting employee salary from user input
    
    // Creating a new Employee object with the user input and adding it to employeeList ArrayList
    Employee newEmployee = new Employee(name, address, phone, salary);
    employeeList.add(newEmployee);
    System.out.println("Member added successfully! \n \n \n"); // Displaying success message
}

// Method to remove an existing employee record
static void removeEmployee() {
    scanner.nextLine(); // Consume the newline character left behind by scanner.nextInt()
    System.out.println("Please enter the name of the Member to remove:");
    String name = scanner.nextLine(); // Getting employee name to remove from user input
    
    // Looping through employeeList ArrayList to search for employee with specified name
    for (Employee employee : employeeList) {
        if (employee.getName().equals(name)) { // If employee is found, remove it from employeeList ArrayList
            employeeList.remove(employee);
            System.out.println("Member removed successfully!  \n \n \n"); // Displaying success message
            return;
        }
    }
    
    System.out.println("Member not found. \n \n \n"); // Displaying error message if employee not found
}

// Method to search for a specific employee record
static void searchEmployee() {
    scanner.nextLine(); // Consume the newline character left behind by scanner.nextInt()
    System.out.println("Please enter the name of the Member to search for:");
    String name = scanner.nextLine(); // Getting employee name to search for from user
        
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) { // If employee is found, remove it from employeeList ArrayList
                System.out.println("Member ID:- " + employee);// Displaying ID
                System.out.println("Member Name:- " + employee.getName());// Displaying Name
                System.out.println("Member Address:- " + employee.getAddress());// Displaying Address
                System.out.println("Member Phone:- " + employee.getPhone());// Displaying Phone
                System.out.println("Member Salary:- " + employee.getSalary());// Displaying Salary
                return;
            }
        }
        
        System.out.println("Member not found.  \n \n \n"); // Displaying error message if employee not found
    }
    
    static void viewAllEmployees() {
        for (Employee employee : employeeList) { // Looping all employees
				System.out.println("\n ******************");
                System.out.println("Member ID:- " + employee);// Displaying ID
                System.out.println("Member Name:- " + employee.getName());// Displaying Name
                System.out.println("Member Address:- " + employee.getAddress());// Displaying Address
                System.out.println("Member Phone:- " + employee.getPhone());// Displaying Phone
                System.out.println("Member Salary:- " + employee.getSalary());// Displaying Salary
                System.out.println("****************** \n");
                return;
        }
    }
}

class Employee { // Making the class to store the employee
    private String name; // Storing Name
    private String address; // Storing Address
    private String phone; // Storing Phone
    private double salary;// Storing Salary
    
    public Employee(String name, String address, String phone, double salary) {
        this.name = name; // Storing Name
        this.address = address;// Storing Address
        this.phone = phone;// Storing Phone
        this.salary = salary;// Storing Salary
    }
    
    public String getName() {
        return name; // Giving Name
    }
    
    public String getAddress() {
        return address;// Giving address
    }
    
    public String getPhone() {
        return phone;// Giving Phone
    }
    
    public double getSalary() {
        return salary;//Giving Salary
    }
    
    public void setAddress(String address) {
        this.address = address;// Updating Address
    }
    
    public void setPhone(String phone) {
        this.phone = phone;//Updating Phone
    }
    
    public void setSalary(double salary) {
        this.salary = salary;//Updating Salary
    }
    
}
