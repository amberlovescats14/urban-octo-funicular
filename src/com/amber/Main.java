package com.amber;

public class Main {

    public static void main(String[] args) {
	    var jones = new MoveIn("Jones");

        var jonesPlumbing = new PlumbingCompany();
	    var plum = new Plumbing(jonesPlumbing);

	    var jonesElectric = new Electric(true);

	    var jonesHouse = new House(jonesElectric, plum, jones);
	    jonesHouse.greeting();
	    jonesHouse.electricity();
	    jonesHouse.plumbing();
    }
}
//composition: passing a class in a constructor
// u can only extend from one class at a time
// composition can be more
// thePC.getMotherBoard().loadProgram("MacOS")