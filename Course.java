import java.util.*;

public class Course {
    int ID;
    String Name;
    ArrayList<Session> Contents;
    int Price;

    Boolean Completed;

    public Course(int id ,String name, ArrayList<Session> contents,int price){
        this.ID = id;
        this.Name = name;
        for(int i = 0; i < contents.size();i ++){
            Session Sess = contents.get(i);
            this.Contents.add(Sess);

        }
        this.Price = price;
        this.Completed = false;

    }
    public void addSession(Session Sess, int index){
        this.Contents.add(index,Sess);
    }

    public void removeSession(int sessID){
        this.Contents.remove(sessID);
    }
}
