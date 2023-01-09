import java.util.*;

@Entity
@Table(name = 'Clients');
public class Client {
@ID @GeneratedValue
    @Column(name = 'id')
    int ID;
    @Column(name ='firstName')
    String firstName;
    @Column(name = 'lastName')
    String lastName;
    @Column(name = 'Age')
    int Age;
    @Column(name = 'billingType')
    String billingType;
    HashSet<Integer> Consultant;
    HashSet<Course> Course;
  
    enum Level{
        Corporate,
        Individual
    }
    
    public Client()
    {
    public void setID(int id)
    {
    this.ID = id;
    }
    public void setfirstName(string firstname)
    {
    this.firstName = firstname;
    }
    public void setlastName(string lastname)
    {
    this.lastName = lastname;
    }
    public void setAge(int age)
    {
    this.Age = age;
    }
    public void setbillingType(string billingtype)
    {
    this.billingType = billingtype;
    }
    
    public void setConsultant(int consultantID)
    {
    this.Consultant.add(consultantID);
    }
    public void setCourse(int crsID, String crsName)
    {
    this.Course.add(crsID, crsName);
    }
    }
}
