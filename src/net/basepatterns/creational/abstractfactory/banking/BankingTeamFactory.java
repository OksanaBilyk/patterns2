package net.basepatterns.creational.abstractfactory.banking;

import net.basepatterns.creational.abstractfactory.Developer;
import net.basepatterns.creational.abstractfactory.ProjectManager;
import net.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.basepatterns.creational.abstractfactory.Tester;


public class BankingTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}
}
