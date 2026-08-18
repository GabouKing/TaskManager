import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private static final String ARCHIVE = "tasks.csv";

    public void Save(Task task) {
        try (FileWriter writer = new FileWriter(ARCHIVE, true)){

            writer.write(
                    task.getDecription()
                    +","
                    +task.getStatus()
                    +System.lineSeparator()
            );

        } catch(IOException exception){
            System.out.println("Error while writing to file whith message: " + exception.getMessage());
        }
    }

    public List<Task> Load() {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVE))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                String decription = data[0];
                String status = data[1];

                Task task = new Task(decription, status);
                tasks.add(task);
            }
        } catch(IOException exception){
            System.out.println("Error while reading file whith message: " + exception.getMessage());
        }
        return tasks;
    }
}
