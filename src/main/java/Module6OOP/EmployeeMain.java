package Module6OOP;


public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan Petrov", "1/12/1950", 1564, "Calgary");
        Accountant accountant1 = new Accountant("Anna Karenina", "10/12/1980", 4687, "Regina");
        Accountant accountant2 = new Accountant("Roxy Mac", "7/6/1987", 6954, "Calgary");
        Clerk clerk1 = new Clerk("Patrick McLaren", "5/11/1984", 4567, "Vancouver");
        Clerk clerk2 = new Clerk("Peter Deer", "25/01/1974", 4565, "Toronto");

        System.out.println("______________________________________");
        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(clerk1.toString());
        System.out.println("______________________________________");

        manager.fireEmployee("Patrick McLaren");
        manager.hireEmployee("Owen Green");;
        accountant1.createReport();
        accountant2.openAccount();
        clerk1.makeCall("Jane Austin");
        clerk2.getCall ("Lea Velosso");


        System.out.println("______________________________________");
        accountant1.setName("Anna Petrova");

        System.out.println(accountant1.toString());

    }

}

