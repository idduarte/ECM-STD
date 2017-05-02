package aldair.emc_std;

import aldair.emc_std.controller.AppController;

public class Launcher {
	
	public Launcher() {
		AppController appController = new AppController();
	}
	
	public static void main(String[] args) {
		Launcher app = new Launcher();
	}

}
