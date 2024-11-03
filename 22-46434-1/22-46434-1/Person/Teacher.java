import java.lang.*;
public class Teacher extends Person
{
    String dept, salary;
    public Teacher(){}
    public Teacher(String name, String age, String gender, String dob, String bg, String dept, String salary)
    {
        super(name,age,gender,dob,bg);
        this.dept=dept;
        this.salary=salary;
    }
    void setdept(String dept){this.dept=dept;}
    void setslary(String salary){this.salary=salary;}
    String getdept(){return dept;}
    String getsalary(){return salary;}

    void viewdetails2()
    {
        System.out.println("Departement: "+dept);
        System.out.println("Salary: "+salary);
    }
}
