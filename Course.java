import java.util.*;

public class Course {
    int ID;
    String Name;
    HashMap<Integer,Session> Contents;
    int Price;

    public Course(int id ,String name, ArrayList<Session> contents,int price){
        this.ID = id;
        this.Name = name;
        for(int i = 0; i < contents.size();i ++){
            Session Sess = contents.get(i);
            this.Contents.put(Sess.ID,Sess);

        }
        this.Price = price;

    }
    public.v
}
