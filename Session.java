
public class Session {
    String Name;
    Object Contents;
    Summary_Data Summary;
    Boolean Completed;

    public Session(String name , Object contents, Summary_Data summary){
        this.Name = name;
        this.Contents = contents;
        this.Summary = summary;
        this.Completed = false;
    }

    public boolean completed(){
        return Completed;
    }

    public void complete(){
        this.Completed = true;
    }
}
