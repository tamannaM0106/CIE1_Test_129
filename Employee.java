public class Employee extends Person{
    public String emp_id = "E168";
    public int salary = 158000;
    public void emp_details(){
        System.out.println("Employee ID:"+emp_id+"\nSalary:"+salary);
    }
    public static void main(String[] args){
        Employee p1 = new Employee();
        p1.person_display();
        p1.displayAge("16-03-2004");
        p1.emp_details();
    }
}