public class player
{
    String Name, ID, City, Email;
    player(){}
    player(String Name, String ID, String City, String Email)
    {
        this.Name=Name;
        this.ID=ID;
        this.City=City;
        this.Email=Email;
    }
    void setName(String Name){this.Name=Name;}
    void setID(String ID){this.ID=ID;}
    void setCity(String City){this.City=City;}
    void setEmail(String Email){this.Email=Email;}

    String getName(){return Name;}
    String getID(){return ID;}
    String getCity(){return City;}
    String getEmail(){return Email;}

    void ViewDetails()
    {
        System.out.println("Name: "+ Name);
        System.out.println("ID: "+ ID);
        System.out.println("City: "+ City);
        System.out.println("Email: "+ Email);
    }

    public static void main(String[] args)
    {
        player p= new player("kaushik", "22-46434-1", "Dhaka", "kaushikroy930@gmail.com");
        p.ViewDetails();
        p.setName("kaushik");
        p.setID("22-46434-1");
        p.setCity("Dhaka");
        p.setEmail("kaushik@hotmail.com");
        p.getName();
        p.getID();
        p.getCity();
        p.getEmail();
        p.ViewDetails();
    }
}
