import java.lang.*;
public class Student extends Person
{
    String id, course, semester;
    public Student(){}
    public Student(String name, String age, String gender, String dob, String bg,String id,String course, String semester)
    {
        super(name, age, gender, dob, bg);
        this.id=id;
        this.course=course;
        this.semester=semester;
    }
    void setid(String id){this.id=id;}
    void setcouse(String course){this.course=course;}
    void setsemester(String semester){this.semester=semester;}

    String getid(){return id;}
    String getcourse(){return course;}
    String getsemester(){return semester;}

    void viewdetails2()
    {
        System.out.println("ID: "+id);
        System.out.println("Course: "+course);
        System.out.println("Semester: "+semester);
    }
}