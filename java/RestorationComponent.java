import java.util.ArrayList;
import java.util.List;

public abstract class RestorationComponent {

    private String id;
    private Enum type;
    private Enum status;
    private Date startDate;
    private Date completionDate;
    private double progress;
    private List<RestorationTask> tasks;

    public RestorationComponent() {
        this.tasks = new ArrayList<>();
    }

    public void updateStatus(Enum newStatus) {
        // method implementation
        updateProgress();
    }

    public void addTask(RestorationTask task) {
        this.tasks.add(task);
        updateProgress();
    }

    public void updateProgress() {
        double totalProgress = 0;
        for (RestorationTask task : tasks) {
            totalProgress += task.getProgress();
        }
        this.progress = totalProgress / tasks.size();
    }

    public double getProgress() {
        return progress;
    }
}
