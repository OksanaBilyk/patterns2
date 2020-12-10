package net.basepatterns.structural.bridge;

public class CppDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("CppDev writes C++ code");
	}
}
