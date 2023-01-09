import java.util.*;
@Entitiy
@Table(name = 'Courses');
public class Course {
    @Id @GeneratedValue
    @Column(name = 'id')
    int ID;
    @Column(name = 'name')
    String Name;
    ArrayList<Session> Contents;
    @Colum(name = 'price')
    int Price;

    Boolean Completed;

    public Course(){
    }
    public int getID(){
        return ID;
    }
    public void setName(String name){
        this.Name = name;
    }

    public void setPrice(int price){
        this.Price = price;
    }
    public void setStatus(boolean completed){
        this.Completed = completed;
    }
    public void addSession(Session Sess, int index){
        this.Contents.add(index,Sess);
    }

    public void removeSession(int sessID){
        this.Contents.remove(sessID);
    }
}
