package launcher.update;

import java.io.File;

import launcher.Configuration;
import launcher.core.Checksum;
import launcher.core.Client;
import launcher.core.Frame;

public class ClientDownloader implements Runnable {

	private File file = new File(Configuration.CLIENT_LOCATION);

	public void download() {
		Thread thread = new Thread(this);
		thread.start();
	}

	public void update() {
		Thread thread = new Thread(this);
		thread.start();
	}

	private boolean clientExists() {
		if (!file.exists()) {
			new Downloader(Configuration.CLIENT_URL).download();
			return true;
		}
		return false;
	}
	
	private void downloadClient() {
		new Downloader(Configuration.CLIENT_URL).download();
	}

	@Override
	public void run() {
		if (clientExists()) {
			return;
		}
		if (!Checksum.isClientUpToDate()) {
			//Frame.label.setText("Updating client...");
			//Frame.progressBar.setString("Updating client...");
			file.delete();
			downloadClient();
		}
	}
}