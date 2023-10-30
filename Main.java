import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        while (true) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("co robimy");
            System.out.println("1--CREATE+ADD");
            System.out.println("2--GET");
            System.out.println("3--USUNIECIE ZADANIA");
            System.out.println("4--KONIEC");
            System.out.print(">>");
            Scanner scanner1 = new Scanner(System.in);
            String scanner = scanner1.next();



            if (scanner.equals("1")) {
                //nazwa

                System.out.println("podaj nazwe");
                System.out.print(">>");
                Scanner nazwaScan = new Scanner(System.in);
                String nazwa = nazwaScan.next();
                //rok
                System.out.println("podaj rok");
                System.out.print(">>");
                Scanner rokScan = new Scanner(System.in);
                String pomocRok = rokScan.next();
                int rok = Integer.parseInt(pomocRok);
                //miesiac
                System.out.println("podaj miesiac");
                System.out.print(">>");
                Scanner miesiacScan = new Scanner(System.in);
                String pomocMiesiac = miesiacScan.next();
                int miesiac = Integer.parseInt(pomocMiesiac);
                //dzien
                System.out.println("podaj dzien");
                System.out.print(">>");
                Scanner dzienScan = new Scanner(System.in);
                String pomocDzien = dzienScan.next();
                int dzien = Integer.parseInt(pomocDzien);
                //priorytet
                System.out.println("podaj priorytet");
                System.out.print(">>");
                Scanner priorytetScan = new Scanner(System.in);
                String priorytet = priorytetScan.next();
                //index
                System.out.println("podaj index");
                System.out.print(">>");
                Scanner indexScan = new Scanner(System.in);
                var index = indexScan.next();

                //dodnie obiektu ToDoItems
                ToDoItems ToDoItems1 = new ToDoItems(nazwa, LocalDate.of(rok, miesiac, dzien), priorytet);
                tasks.AddToDo(Integer.parseInt(index), ToDoItems1);
                System.out.println("dodano obiekt");
            }
            if (scanner.equals("2")) {
                System.out.println("wszystkie indexy = -1");
                System.out.println("konkretny index = numer indexu");
                Scanner pomocB = new Scanner(System.in);
                String pomocA = pomocB.next();

                //wydanie wszystkich indexow
                if (pomocA.equals("-1")) {
                    for (int i = 0; i < tasks.tasks.length; i++) {
                        ToDoItems item = tasks.GetToDo(i);
                        System.out.println(item);
                    }
                } else {
                    if (pomocA.equals("0")) {
                        ToDoItems item0 = tasks.GetToDo(0);
                        System.out.println(item0);
                    } else if (pomocA.equals("1")) {
                        ToDoItems item1 = tasks.GetToDo(1);
                        System.out.println(item1);
                    } else if (pomocA.equals("2")) {
                        ToDoItems item2 = tasks.GetToDo(2);
                        System.out.println(item2);
                    } else if (pomocA.equals("3")) {
                        ToDoItems item3 = tasks.GetToDo(3);
                        System.out.println(item3);
                    } else if (pomocA.equals("4")) {
                        ToDoItems item4 = tasks.GetToDo(4);
                        System.out.println(item4);
                    } else if (pomocA.equals("5")) {
                        ToDoItems item5 = tasks.GetToDo(5);
                        System.out.println(item5);
                    }
                    else if (pomocA.equals("6")) {
                        ToDoItems item6 = tasks.GetToDo(6);
                        System.out.println(item6);
                    }
                    else if (pomocA.equals("7")) {
                        ToDoItems item7 = tasks.GetToDo(7);
                        System.out.println(item7);
                    }
                    else if (pomocA.equals("8")) {
                        ToDoItems item8 = tasks.GetToDo(8);
                        System.out.println(item8);
                    }
                    else if (pomocA.equals("9")) {
                        ToDoItems item9 = tasks.GetToDo(9);
                        System.out.println(item9);
                    }

                }
            }
            if (scanner.equals("3")){
                System.out.println("podaj index ktory chcesz usunac");
                System.out.print(">>");
                Scanner indexPomoc = new Scanner(System.in);
                String indexPomoc1 = indexPomoc.next();
                int index = Integer.parseInt(indexPomoc1);

                Tasks.tasks[index] = null;

                System.out.println("usunieto index");


            }
            if (scanner.equals("4")){
                break;
            }

        }


    }
}
