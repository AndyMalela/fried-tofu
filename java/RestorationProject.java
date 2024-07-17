import java.util.Date;
import java.util.List;

public class RestorationProject {
    private String id;
    private String carId;
    private Date startDate;
    private Date estimatedCompletionDate;
    private Date actualCompletionDate;
    private ProjectStatus status;
    private List<RestorationComponent> components;

    public void updateStatus(ProjectStatus newStatus) {
        // Implementation
    }

    public void addComponentRestoration(RestorationComponent component) {
        // Implementation
    }

    // Getters and setters
}