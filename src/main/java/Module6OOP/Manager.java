package Module6OOP;

public class Manager extends Employee {

    public Manager(String employeeName, String employeeDateOfBirth, int employeeId, String employeeAddress) {
        super(employeeName, Consts.MANAGER_TYPE, employeeDateOfBirth, employeeId, Consts.MANAGER_DEFAULT_SALARY, employeeAddress);
    }

    public void hireEmployee(String employeeName) {
        System.out.println(String.format("The employee %s was hired by " + getTitle() +" " + getName(), employeeName));

    }

    public void fireEmployee(String employeeName) {
        System.out.println(String.format("The employee %s was fired by  " + getTitle() +" " + getName(), employeeName));

    }

}
