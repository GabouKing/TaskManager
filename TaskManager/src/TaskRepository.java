import java.io.FileWriter;
import java.io.IOException;

public class TaskRepository {
    private static final String ARCHIVE = "tasks.csv";

    public void Save(Task task) {
        try (FileWriter writer = new FileWriter(ARCHIVE, true)){

            writer.write(
                    task.getDecription()
                    +","
                    +task.getStatus()
            );

        } catch(IOException exception){
            System.out.println("Error while writing to file whith message: " + exception.getMessage());
        }
    }
}
