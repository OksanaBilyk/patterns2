package net.basepatterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

	public JavaTeamLead(final Developer developer) {
		super(developer);
	}

	@Override
	public String makeJob() {
		return super.makeJob() + sendWeekReport();
	}

	public String sendWeekReport() {
		return "Send week report to customer.\n";
	}
}
