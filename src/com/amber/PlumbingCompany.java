package com.amber;

public class PlumbingCompany {
    private String companyName;
    private String date;

    public PlumbingCompany(){
        this("Beyer Boys", "Next Day Service");
    }
    public PlumbingCompany(String companyName, String date) {
        this.companyName = companyName;
        this.date = date;
    }
    public void showDetails(){
        System.out.println(companyName + " will install plumbing, " + date );
    }
}
