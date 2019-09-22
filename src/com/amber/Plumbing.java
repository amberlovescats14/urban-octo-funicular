package com.amber;

public class Plumbing {
    private PlumbingCompany thePlumbingCompany;

    public Plumbing(PlumbingCompany thePlumbingCompany) {
        this.thePlumbingCompany = thePlumbingCompany;
    }



    public void completionDetails(){
        thePlumbingCompany.showDetails();
    }

}
