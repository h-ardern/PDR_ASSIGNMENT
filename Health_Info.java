import java.util.HashSet;

public class Health_info
{
    public Health_info() 
    {

        this.Conditions = new HashSet<String>() ; 
        this.PastSessions = new ArrayList<String>() ;
    }
    public void addClientConditions(String ClientID ) 
        {

            if( this.Conditions.contains( ClientID) ) return ;
            this.Conditions.add( ClientID);
        }
    public void PastSessions(String ClientID ) 
        {
            Set<String> PastSessions =new HashSet<>(Summary);
            if( PastSessions.contains( ClientID) ) return ;
            this.PastSessions.add(ClientID);

        }


}

