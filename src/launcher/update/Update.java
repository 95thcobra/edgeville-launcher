package launcher.update;

public class Update {
	public static void check() {
		new ClientDownloader().update();
	}
}
