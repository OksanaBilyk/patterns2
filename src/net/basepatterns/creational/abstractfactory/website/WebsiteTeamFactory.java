package net.basepatterns.creational.abstractfactory.website;

import net.basepatterns.creational.abstractfactory.Developer;
import net.basepatterns.creational.abstractfactory.ProjectManager;
import net.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.basepatterns.creational.abstractfactory.Tester;
import net.basepatterns.creational.abstractfactory.website.ManualTester;
import net.basepatterns.creational.abstractfactory.website.PhpDeveloper;
import net.basepatterns.creational.abstractfactory.website.WebsitePM;


public class WebsiteTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new WebsitePM();
	}
}
