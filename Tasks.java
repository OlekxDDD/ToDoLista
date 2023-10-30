public class Tasks {
    static ToDoItems[] tasks = new ToDoItems[10];

    void AddToDo(int index, ToDoItems zadanie){
        tasks[index] = zadanie;
    }

    ToDoItems GetToDo(int index){
        ToDoItems item = tasks[index];
        return item;
    }
}
