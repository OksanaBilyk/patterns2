package net.basepatterns.creational.abstractfactory.website;

import net.basepatterns.creational.abstractfactory.Developer;


public class PhpDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("PhpDev writes php code...");
	}
}
