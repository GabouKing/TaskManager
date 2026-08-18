public class Task {
    private String decription;
    private String Status;

    public Task(String decription, String status) {
        this.decription = decription;
        Status = status;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
