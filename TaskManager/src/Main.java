public class Main {
    public static void main(String[] args) {
        System.out.println("Hello GIT!");
        

        TaskRepository taskRepository = new TaskRepository();
        Task task = new Task("Aula 2", "PENDENTE");
        Task task1 = new Task("Task 1", "COMPLETA");
        Task task2 = new Task("Task 2", "PENDENTE");

        taskRepository.Save(task);
        taskRepository.Save(task1);
        taskRepository.Save(task2);

        var listTasks = taskRepository.Load();
        for(var taskRead : listTasks){
            System.out.printf("TAREFA: %s, STATUS: %s\n", taskRead.getDecription(),  taskRead.getStatus());
        }
        //System.out.println("Task Salva");

    }
}
