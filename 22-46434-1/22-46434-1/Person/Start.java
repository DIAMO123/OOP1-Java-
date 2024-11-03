public class Start
{
    public static void main(String[] args)
    {
        Teacher t=new Teacher("Shefat Sir", "25", "Male", "29-2-97", "B+", "CSE", "1,00,000");
        t.viewdetails1();
        t.viewdetails2();
        System.out.println("==========================================================================================================");
        Student s=new Student("kaushik", "18", "Male", "8-2-02", "B+", "22-46434-1", "CSE", "3rd");
        s.viewdetails1();
        s.viewdetails2();
    }
}
