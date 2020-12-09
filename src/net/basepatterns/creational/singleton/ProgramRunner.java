package net.basepatterns.creational.singleton;

public class ProgramRunner {

	public static void main(String[] args) {
		System.out.println(ProgramLogger.getProgramLogger().toString());
//		System.out.println(ProgramLogger.getProgramLogger().toString());	//the same instance

		ProgramLogger.getProgramLogger().addLogInfo("1st log...");
		ProgramLogger.getProgramLogger().addLogInfo("2nd log...");
		ProgramLogger.getProgramLogger().addLogInfo("3rd log...");

		ProgramLogger.getProgramLogger().showLogFile();
	}
}
