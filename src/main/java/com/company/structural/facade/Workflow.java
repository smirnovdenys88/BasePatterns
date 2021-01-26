package com.company.structural.facade;

public class Workflow {
    private Developer developer = new Developer();
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void readHadrahar(){
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
