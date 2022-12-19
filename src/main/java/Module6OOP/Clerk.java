package Module6OOP;

public class Clerk extends Employee {

    public Clerk(String employeeName, String employeeDateOfBirth, int employeeId, String employeeAddress) {
        super(employeeName, Consts.CLERK_TYPE, employeeDateOfBirth, employeeId, Consts.CLERK_DEFAULT_SALARY, employeeAddress);
    }

    public void makeCall(String customerName) {
        System.out.println("______________________________________");
        System.out.println(String.format(getTitle() + " " + getName() + " " + "connected to customer %s", customerName));
    }

    public void getCall(String customerName) {
        System.out.println(String.format(getTitle() + " " + getName() + " " + "answered to customer %s", customerName));
    }
}
