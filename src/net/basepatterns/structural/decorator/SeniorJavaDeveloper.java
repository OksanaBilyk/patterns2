package net.basepatterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

	public SeniorJavaDeveloper(final Developer developer) {
		super(developer);
	}

	@Override
	public String makeJob(){
		return super.makeJob() + makeCodeReview();
	}

	public String makeCodeReview(){
		return "Make code review.\n";
	}
}
