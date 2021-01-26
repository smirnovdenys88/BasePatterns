package com.company.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker tracker){
        if (tracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        }else {
            System.out.println("Developer is reading a Habrahabr...");
        }
    }
}
