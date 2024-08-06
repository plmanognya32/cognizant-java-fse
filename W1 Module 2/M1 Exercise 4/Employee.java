public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String obtainEmployeeId() {
        return employeeId;
    }

    public String obtainEmployeeName() {
        return name;
    }

    public String obtainEmployeePosition() {
        return position;
    }

    public double obtainEmployeeSalary() {
        return salary;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public void setEmployeePosition(String position) {
        this.position = position;
    }

    public void setEmployeeSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Id='" + employeeId + '\'' + ", Employee Name='" + name + '\'' + ", Employee Position='"
                + position + '\'' + ", Employee Salary=" + salary;
    }
}
