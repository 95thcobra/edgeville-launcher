package launcher.utility;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;

public class Utility {
	public static Image getImage(String dir) {
		return Toolkit.getDefaultToolkit().getImage(Utility.class.getResource("/data/" + dir));
	}

	public static ImageIcon getImageIcon(String dir) {
		return new ImageIcon(Utility.class.getResource("/data/" + dir));
	}
	
	public static void browse(String url) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(new URL(url).toURI());
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	    }
	}
}
