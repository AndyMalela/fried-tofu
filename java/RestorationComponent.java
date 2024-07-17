import java.util.Date;
import java.util.List;

public abstract class RestorationComponent {
    private String id;
    private ComponentType type;
    private ComponentStatus status;
    private Date startDate;
    private Date completionDate;
    private List<RestorationTask> tasks;

    public void updateStatus(ComponentStatus newStatus) {
        // Implementation
    }

    public void addTask(RestorationTask task) {
        // Implementation
    }

    // Getters and setters
}