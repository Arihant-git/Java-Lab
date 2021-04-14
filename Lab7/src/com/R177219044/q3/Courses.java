package com.R177219044.q3;

interface CompulsoryCourses{
	static final int numberofCC = 4;
	static final int numberofSems = 8;
	void numberofcourses();
	void approxfees();
}

class AIML implements CompulsoryCourses {
	
	public void numberofcourses() {
		int totalcourses = numberofCC+2;
		System.out.println("Total number of courses: "+totalcourses);
	}
	
	public void approxfees() {
		int approxfees = numberofSems*180000;
		System.out.println("Approx fees for the whole course: "+approxfees+" Rs.");
	}
}


class CloudTechnology implements CompulsoryCourses {
	
	public void numberofcourses() {
		int totalcourses = numberofCC+1;
		System.out.println("Total number of courses: "+totalcourses);
	}
	
	public void approxfees() {
		int approxfees = numberofSems*140000;
		System.out.println("Approx fees for the whole course: "+approxfees+" Rs.");
	}
}


class Cyberlaws implements CompulsoryCourses {
	
	public void numberofcourses() {
		int totalcourses = numberofCC+3;
		System.out.println("Total number of courses: "+totalcourses);
	}
	
	public void approxfees() {
		int approxfees = numberofSems*200000;
		System.out.println("Approx fees for the whole course: "+approxfees+" Rs.");
	}
}

public class Courses {
	public static void main(String args[]) {
		AIML aimlc1 = new AIML();
		aimlc1.numberofcourses();
		aimlc1.approxfees();
		
		System.out.println();
		CloudTechnology ctc2 = new CloudTechnology();
		ctc2.numberofcourses();
		ctc2.approxfees();
		
		System.out.println();
		Cyberlaws clc3 = new Cyberlaws();
		clc3.numberofcourses();
		clc3.approxfees();
	}

}
