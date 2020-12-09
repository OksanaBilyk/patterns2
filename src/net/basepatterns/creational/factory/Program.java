package net.basepatterns.creational.factory;

public class Program {

	public static void main(String[] args) {
		DeveloperFactory javaFactory = createDeveloperBySpecialty("java");
		Developer javaDev = javaFactory.createDeveloper();
		javaDev.writeCode();

		DeveloperFactory cppFactory = new CppDeveloperFactory();
		Developer cppDev = cppFactory.createDeveloper();
		cppDev.writeCode();
	}

	static DeveloperFactory createDeveloperBySpecialty(String specialty) {
		if (specialty.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		}
		else if (specialty.equalsIgnoreCase("c++")) {
			return new CppDeveloperFactory();
		}
		else if (specialty.equalsIgnoreCase("php")) {
			return new PhpDeveloperFactory();
		}
		else {
			throw new RuntimeException(specialty + " is unknown specialty.");
		}
	}

}
