package net.basepatterns.creational.abstractfactory.badapproach;

import net.basepatterns.creational.factory.PhpDeveloper;


public class WebsiteProject {

	public static void main(String[] args) {
		PhpDeveloper phpDeveloper = new PhpDeveloper();
		ManualTester manualTester = new ManualTester();
		ProjectManager projectManager = new ProjectManager();

		System.out.println("Creating project ...");
		phpDeveloper.writeCode();
		manualTester.testCode();
		projectManager.manageProject();
	}

}
