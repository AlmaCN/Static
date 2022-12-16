package it.develhope.exercise;

public class Employee {

    /*
    Ho creato la classe Employee a cui ho assegnato le variabili name, surname e address
     */
    public String name, surname, address;

    /*
    Ho creato il costruttore Employee che prende tre parametri e ho assegnato i parametri alle variabili
    della classe
     */
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    /*
    Ho creato il metodo getEmployeeDetails che stampa in console i dettagli dell'employee
     */
    public void getEmployeeDetails(){
        System.out.printf("The name of the employee is %s %s and lives in %s \n", name, surname, address);
    }
}
