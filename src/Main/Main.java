package Main;

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
       employees.add("Maxim");
       employees.add("Alexey");
       for (int i = 1; i <= 10; i++) {
           employees.add("Сотрудник " + i);
       }

       employees.remove(2);

       employees.remove("Alexey");

       employees.remove("Roman");

       for (int i = 0; i < employees.getSize(); i++) {
           System.out.println(employees.get(i));
       }
    }
}
