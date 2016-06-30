package launcher;

import java.awt.Color;
import java.io.File;

public class Configuration {

	public static final String TITLE = "Edgeville Launcher";

	/**
	 * Update paths
	 */
	public static final String CLIENT_VERSION_URL = "http://edgeville.org/server/clientversion.txt";
	public static final String LOCAL_CLIENT_VERSION_PATH = System.getProperty("user.home") + File.separator + "clientversion.txt";
	
	/**
	 * Client
	 */
	public static final String CLIENT_URL = "http://edgeville.org/server/Edgeville.jar";
	public static final String CLIENT_SAVE_NAME = "Edgeville.jar";
	public static final String CLIENT_LOCATION = System.getProperty("user.home") + File.separator + CLIENT_SAVE_NAME;

	/**
	 * Links
	 */
	public static final String FORUM_URL = "http://edgeville.org/";

	public static final Color PROGRESSBAR_COLOR = Color.decode("0x0079C0");
	public static final Color BACKGROUND_COLOR = Color.decode("0x323232");
}
