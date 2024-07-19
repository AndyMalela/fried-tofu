import java.util.ArrayList;
import java.util.List;

public class RestorationProject {

    private String id;
    private String carId;
    private Date startDate;
    private Date estimatedCompletionDate;
    private Date actualCompletionDate;
    private Enum status;
    private double progress;
    private List<RestorationComponent> components;

    public RestorationProject() {
        this.components = new ArrayList<>();
    }

    public void updateStatus(Enum newStatus) {
        // method implementation
    }

    public void addComponentRestoration(RestorationComponent component) {
        this.components.add(component);
        updateProgress();
    }

    public void updateProgress() {
        double totalProgress = 0;
        for (RestorationComponent component : components) {
            totalProgress += component.getProgress();
        }
        this.progress = totalProgress / components.size();
    }

    public double getProgress() {
        return progress;
    }
}
