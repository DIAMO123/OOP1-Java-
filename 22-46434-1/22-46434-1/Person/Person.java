import java.lang.*;
public class Person
{
    String name, age, gender, dob, bg;
    public Person(){}
    public Person(String name, String age, String gender, String dob, String bg)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.dob=dob;
        this.bg=bg;
    }

    void setname(String name){this.name=name;}
    void setage(String age){this.age=age;}
    void setgender(String gender){this.gender=gender;}
    void setdob(String dob){this.dob=dob;}
    void setbg(String bg){this.bg=bg;}

    String getname(){return name;}
    String getage(){return age;}
    String getgender(){return gender;}
    String getdob(){return dob;}
    String getbg(){return bg;}

    void viewdetails1()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Blood Group: "+bg);
    }
}
