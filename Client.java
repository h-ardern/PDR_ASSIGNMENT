public class Client {
int ID;
    String firstName;
    String lastName;
    int Age;
    HashSet<Integer> Consultant;
    HashSet<Course> Course;
  
    enum Level{
        Corporate,
        Individual
    }
    
    public Client(int id, String firstname, String lastname, int age, ArrayList<Integer> con1, ArrayList<Course> crs)
    {
        this.ID = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.Age = age;
        for(int i = 0; i < con1.size(); i++)
        {
            this.Consultant.add(con1.get(i));
        }
        for(int i = 0; i < crs.size(); i++)
        {
            this.Course.add(crs.get(i));
        }
        
    }
}
