package launcher;

import launcher.core.Frame;

/**
 * A launcher which keeps your client & cache up to date.
 * 
 * @author Sky | http://www.rune-server.org/members/_sky/
 *
 */
public class Launcher {
	public static Frame frame;
	
	public static void main(String[] args) {
		frame = new Frame();
		frame.init();
	}
}
