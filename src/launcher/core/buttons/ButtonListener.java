package launcher.core.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import launcher.Configuration;
import launcher.core.Checksum;
import launcher.core.Client;
import launcher.core.Frame;
import launcher.update.Update;
import launcher.utility.Utility;

public class ButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand().toLowerCase();
		switch (command) {
		case "play now":
			File client = new File(Configuration.CLIENT_LOCATION);
			if (!client.exists() || !Checksum.isClientUpToDate()) {
				Frame.progressBar.setString("Updating client.");
				Update.check();
				return;
			}
			Client.runClient();
			break;

		case "forums":
			Utility.browse(Configuration.FORUM_URL);
			break;

		}
	}
}
