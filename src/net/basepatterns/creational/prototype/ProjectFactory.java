package net.basepatterns.creational.prototype;

public class ProjectFactory {

	Project project;

	public ProjectFactory(final Project project) {
		this.project = project;
	}

	Project cloneProject() {
		return (Project) project.copy();
	}
}
