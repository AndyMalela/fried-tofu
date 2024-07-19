public class RestorationTask {

    private String id;
    private String description;
    private Enum status;
    private Member assignedMember;
    private double progress;

    public void updateStatus(Enum newStatus) {
        // method implementation
        if (newStatus == Enum.Completed) {
            this.progress = 100;
        } else if (newStatus == Enum.InProgress) {
            this.progress = 50;
        } else {
            this.progress = 0;
        }
    }

    public void assignMember(Member member) {
        this.assignedMember = member;
    }

    public double getProgress() {
        return progress;
    }
}
