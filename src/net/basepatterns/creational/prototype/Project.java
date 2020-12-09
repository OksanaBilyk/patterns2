package net.basepatterns.creational.prototype;

public class Project implements Copyable {
	private int id;
	private String projectName;
	private String sourceCode;

	public Project(final int id, final String projectName, final String sourceCode) {
		this.id = id;
		this.projectName = projectName;
		this.sourceCode = sourceCode;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(final String projectName) {
		this.projectName = projectName;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(final String sourceCode) {
		this.sourceCode = sourceCode;
	}

	@Override
	public Object copy(){
		Project copy =  new Project(id, projectName, sourceCode);
		return copy;
	}

	@Override
	public String toString() {
		return "Project{" + "id=" + id + ", projectName='" + projectName + '\'' + ", sourceCode='" + sourceCode + '\'' + '}';
	}
}
