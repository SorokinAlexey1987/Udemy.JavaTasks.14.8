package Main;

/**
 * @author Sorokin Aleksei on 20.05.2022
 **/
public class Main {
    public static void main(String[] args) {
        //initialization
        String[] employees = {
                "Nikita",
                "Egor",
                "Maksim",
                "Slava",
                "Rita"
        };
        String[] second = new String[employees.length + 1];
        for(int i = 0; i < employees.length; i++){
            second[i] = employees[i];
        }
        second[second.length - 1] = "Ivan";
        //print Strings
        for(String name: employees){
            System.out.println(name);
        }
        for (String name: second){
            System.out.println(name);
        }
    }
}
