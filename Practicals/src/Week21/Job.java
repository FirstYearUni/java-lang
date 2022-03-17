package Week21;
import java.lang.*;

public class Job implements Comparable<Job> {
    private String description;

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public int getPriority() {
        return priority;
    }
    private boolean isComplete;
    private int priority;

    public Job(String description, boolean isComplete, int priority){
       this.description = description;
       this.isComplete = isComplete;
       this.priority = priority;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Description:");
        sb.append(" ");
        sb.append(this.description);
        sb.append(" Completion:");
        sb.append(" ");
        sb.append(this.isComplete);
        sb.append(" Priority:");
        sb.append(" ");
        sb.append(this.priority);
        return sb.toString();
    }
    @Override
    public int compareTo(Job job) {
        return 0;
    }
}
