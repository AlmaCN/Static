package it.develhope.exercise;

import java.util.Random;

public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static int keepTrackOfEmployeesNumber(){
        return totalNumberOfEmployees + 1;
    }

    private String generateBadgeIdCode(){
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

    public void showBadgeDetails(){
        System.out.println(totalNumberOfEmployees = keepTrackOfEmployeesNumber());
        employee.getEmployeeDetails();
        System.out.println(badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
