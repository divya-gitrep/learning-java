package chapter9;

public class Employee extends Person {

    private String employeeID;
    private String title;

    public Employee(){
        super("Divya");

        System.out.println("In employee default constructor");
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
