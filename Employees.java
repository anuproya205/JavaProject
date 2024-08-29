package practiceProblem;
//Write a program to create a treeset of 5
// employees(empid,salary,name,age)
public class Employees implements Comparable<Employees>{
    private int empId;
    private String empName;
    private int age;
    private float salary;

    public Employees(int empId, String empName
    , int age, float salary){
     this.empId=empId;
     this.empName=empName;
     this.age=age;
     this.salary=salary;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public  String toString(){
        return "Employee id:"+empId+
                "\n Name:"+empName+
                "\n Age:"+age+
                "year \n salary :Rs"+salary+
                "\n----------------------\n";
    }
    public int compareTo(Employees other){
        return this.age-other.age;
    }
}
