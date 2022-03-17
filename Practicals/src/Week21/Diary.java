package Week21;

import java.util.ArrayList;
import java.util.Collections;

public class Diary {
    private ArrayList<Job> jobs;
    public Diary() {
        this.jobs = new ArrayList<Job>();
    }
    public void add(Job job) {
        this.jobs.add(job);
    }
    public void remove(Job job) {
        this.jobs.remove(job);
    }
    public String printDiary() {
        StringBuilder sb = new StringBuilder();
        for(Job job: jobs){
            sb.append(job.toString());
            sb.append("\n");
        }
        return sb.toString();
    }


}
