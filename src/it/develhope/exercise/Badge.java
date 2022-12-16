package it.develhope.exercise;

import java.util.Random;

public class Badge {

    /*
    Ho creato la classe Badge a cui ho assegnato le variabili totalNumberOfEmployees, badgeIdCode e una variabile
    di tipo Employee chiamata employee
     */
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    /*
    Ho creato il metodo keepTrackOfEmployeesNumber in cui ho agguinto 1 a totalNumberOfEmployees
     */
    private static int keepTrackOfEmployeesNumber(){
        return totalNumberOfEmployees + 1;
    }

    /*
    Ho creato il metodo generateBadgeIdCode per avere una stringa di tipo XYZnamesurnameXYZ per gli employee
     */
    private String generateBadgeIdCode(){
        /*
        Ho cercato un metodo su google per creare una stringa random da 3 caratteri, in cui e stata creata
        una strnga d'alfabeto con caratteri maiuscoli.
        E stato creato un oggetto sb di tipo StringBuilder.
        E stato creato un oggetto random di tipo Random.
        E stato implementato il costrutto for per creare appunto la string e poi il risultato e stato assegnato
        a sb.toString().
         */
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 3;
        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();

        return randomString + employee.name + employee.surname + randomString;
    }

    /*
    Ho creato il metodo showBadgeDetails in cui ho stampato il numero di employee totali con badge, i dettagli
    dell'employee ed il badgeIdCode
     */
    public void showBadgeDetails(){
        System.out.println(totalNumberOfEmployees = keepTrackOfEmployeesNumber());
        employee.getEmployeeDetails();
        System.out.println(badgeIdCode);
    }

    /*
    Ho creato il metodo costruttore di Badge che prende come parametro un oggetto di tipo Employee e richimato in esso
    il metodo keepTrackOfEmployeesNumber, e assegnato employeeThatNeedsBadge a employee, e generateBadgeIdCode a
    badgeIdCode.
     */
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
