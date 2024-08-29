package practiceProblem;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // creating a treeset of employees
TreeSet<Employees> empset = new TreeSet<Employees>();
/*---------------inserting employees----------*/
        empset.add(new Employees(101,"anu",20,50000));
        empset.add(new Employees(109,"sumit",24,70000));
        empset.add(new Employees(121,"suman",18,8000));
        empset.add(new Employees(102,"nikky",19,12000));
        empset.add(new Employees(95,"ashu",59,2000));
        /*----------Displaying Employees----------*/
        System.out.println("\n----------Employees List-------------");
        for(Employees employees:empset){
            System.out.println(employees);
        }
    }
}
