import java.lang.reflect.Array;
import java.util.*;


public class Consultant {
    String First_Name;
    String Last_Name;
    HashSet<Integer> Clients;
    HashSet<Session> Sessions;

    public Consultant(String fn, String ln, ArrayList<Integer> Cl, ArrayList<Session> Sess) {
        this.First_Name = fn;
        this.Last_Name = ln;
        for (int i = 0; i < Cl.size(); i++) {
            this.Clients.add(Cl.get(i));
        }
        for (int i = 0; i < Sess.size(); i++) {
            this.Sessions.add(Sess.get(i));
        }
    }

    public void AddClient(int Cl){
        this.Clients.add(Cl);
    }
    public void RemoveClient(int Cl){
        this.Clients.remove(Cl);
    }
    public void RemoveSession(Session Sess){
        this.Sessions.remove(Sess);
    }
    public void AddSession(Session Sess){
        this.Sessions.add(Sess);
    }
}
