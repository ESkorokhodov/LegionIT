package Module6OOP;

public class Accountant extends Employee {


    public Accountant(String employeeName, String employeeDateOfBirth, int employeeId, String employeeAddress) {
        super(employeeName, Consts.ACCOUNTANT_TYPE, employeeDateOfBirth, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, employeeAddress);
    }

    public void createReport() {
        System.out.println("______________________________________");
        System.out.println("Report created by  " + getTitle() + "  " + getName());
    }

    public void openAccount() {
        System.out.println("Account opened by  " + getTitle() + "  " + getName());
    }
}
