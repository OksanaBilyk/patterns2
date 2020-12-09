package net.basepatterns.creational.singleton;

public class ProgramLogger {

	private static ProgramLogger programLogger;
	private static String logfile = "This is a log file.\n\n";

	private ProgramLogger() {

	}

	public static synchronized ProgramLogger getProgramLogger() {
		if (programLogger == null) {
			programLogger = new ProgramLogger();
		}
		return programLogger;
	}

	public void addLogInfo(String logInfo) {
		logfile += logInfo + "\n";
	}

	public void showLogFile() {
		System.out.println(logfile);
	}
}
