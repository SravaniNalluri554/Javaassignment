package com.Zemosos.github.sravani.Zemosos_github_sravani.singleresp.good;

public class ResumeSearch {
	/** ResumeSearch class is also having additional responsibility of search resume */
	  private Resume resume;

	  public ResumeSearch(Resume resume) {
	    this.resume = resume;
	  }

	  public void searchResume() {
	    System.out.println("technology: " + resume.getTechnology());
	    System.out.println("yearOfExperience: " + resume.getYearsOfExperience());
	  }

}
