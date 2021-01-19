package com.company.structural.decorator;

public class TeamLeadJavaDeveloper extends DecoratorDeveloper {
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String sendReportToClient(){
        return " Send week report to client...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReportToClient();
    }
}
