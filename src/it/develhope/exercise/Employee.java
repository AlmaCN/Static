package it.develhope.exercise;

public class Employee {

    public String name, surname, address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public void getEmployeeDetails(){
        System.out.printf("The name of the employee is %s %s and lives in %s \n", name, surname, address);
    }
}
