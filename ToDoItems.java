import java.time.LocalDate;

public class ToDoItems {

    String nazwa;
    LocalDate deadline;
    String priorytet;

    ToDoItems(String nazwa, LocalDate deadline, String priorytet){
         this.nazwa = nazwa;
         this.deadline = deadline;
         this.priorytet = priorytet;

    }
    public String getNazwa() {
        return nazwa;
    }
    public LocalDate getDeadline() {
        return deadline;
    }
    public String getPriorytet() {
        return priorytet;
    }

    public String toString() {
        return "nazwa:"+nazwa+"    deadline:"+deadline+"    prorytet:"+priorytet;
    }
}
