package it.develhope.exercise;

public class Tester {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Alma", "Caciula", "Via Cibrario");
        Employee employee2 = new Employee("Laura", "Rossi", "Via Roma");

        Badge employee1Badge = new Badge(employee1);
        Badge employee2Badge = new Badge(employee2);

        employee1Badge.showBadgeDetails();
        employee2Badge.showBadgeDetails();
    }
}
