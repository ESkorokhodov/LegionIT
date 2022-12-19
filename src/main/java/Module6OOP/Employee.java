package Module6OOP;

public abstract class Employee {
    private String Name;
    private String title;
    private String dateOfBirth;
    private int id;
    private double salary;
    private String address;

    public Employee(String employeeName, String employeeTitle, String employeeDateOfBirth, int employeeId, double employeeSalary, String employeeAddress) {
        this.Name = employeeName;
        this.title = employeeTitle;
        this.dateOfBirth = employeeDateOfBirth;
        this.id = employeeId;
        this.salary = employeeSalary;
        this.address = employeeAddress;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary() {
        System.out.println("The salary was sent to the employee bank account");
    }

    public String toString() {
        String txt = String.format("Employee name  %s, title %s, dateOfBirth %s, salary %f, address %s, id %d", Name, title, dateOfBirth, salary, address, id);
        return txt;
    }

}
