package com.company.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[]  programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper()),
                new WebSite(new LayoutDeveloper())
        };
        for (Program program: programs){
            program.developProgram();
        }
    }
}
