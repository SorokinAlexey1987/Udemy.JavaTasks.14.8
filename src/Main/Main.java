package Main;

import java.util.HashSet;

/**
 * @author Sorokin Aleksei on 20.05.2022
 **/
public class Main {
    public static void main(String[] args) {
        //initialization

       MyArrayList employees = new MyArrayList();
       employees.add("Nikita");
       employees.add("Egor");
       employees.add("Ivan");
       employees.add("Sergey");
       employees.add("Ivan");
        //System.out.println(employees.getSize());
       for (int i = 1; i <= 5; i++) {
           employees.add("Employees " + i);
       }

       //employees.remove(2);
       //employees.remove("Alexey");

       for (int i = 0; i < employees.getSize(); i++) {
           System.out.println(employees.get(i));
       }

       HashSet<String> names = getEmployees();
       for (String name : names) {
           System.out.println(name);
       }
    }
    public static HashSet<String> getEmployees () {
        HashSet<String> employees = new HashSet<>();
        employees.add("Nikita");
        employees.add("Egor");
        employees.add("Ivan");
        employees.add("Sergey");
        employees.add("Ivan");
        return employees;
    }

}
