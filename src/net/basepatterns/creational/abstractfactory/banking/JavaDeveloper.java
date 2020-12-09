package net.basepatterns.creational.abstractfactory.banking;

import net.basepatterns.creational.abstractfactory.Developer;


public class JavaDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("JavaDev writes java code");
	}
}
