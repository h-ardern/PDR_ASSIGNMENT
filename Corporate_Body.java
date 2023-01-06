import java.util.*;

public class Corporate_Body {

    /* String to store Company's name */
    String Name;
    HashSet<String> Employees;

        public Corporate_Body(String name,ArrayList<String> emps){
            this.Name = name;
            for(int i = 0 ; i < emps.size(); i++){
                this.Employees.add(emps.get(i));
            }

        }

        public void add_Employee(String emp){
            this.Employees.add(emp);
        }

        public void remove_Employee(String emp){
            this.Employees.add(emp);
        }
}
