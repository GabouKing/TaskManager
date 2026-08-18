public class Main {
    public static void main(String[] args) {
        System.out.println("Hello GIT!");
        

        TaskRepository taskRepository = new TaskRepository();
        Task task = new Task("Aula 2", "PENDENTE");

        taskRepository.Save(task);

        System.out.println("Task Salva");
    }
}
