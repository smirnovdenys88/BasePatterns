package com.company.structural.facade;

public class SpringRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solveProblems();

        workflow.readHadrahar();
    }
}
