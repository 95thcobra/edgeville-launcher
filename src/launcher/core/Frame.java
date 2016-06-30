package launcher.core;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

import launcher.Configuration;
import launcher.utility.Utility;
import launcher.core.buttons.Button;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	public static JLabel label = new JLabel("");
	public static final int BUTTON_Y = 30;
	public static final int BUTTON_X = 30;
	public static final int X_DIFF = 150;
	public static final int BUTTON_WIDTH = 130;
	public static final int BUTTON_HEIGHT = 60;
	public static JButton btnUpdate = new Button("Fetch Update", new Rectangle(BUTTON_X + X_DIFF, BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT));
	public static JProgressBar progressBar;
	
	public static boolean downloadingClient = false;

	public static final int FRAME_WIDTH = 358;
	public static final int FRAME_HEIGHT = 200;
	
	public Frame() {
		setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		setTitle(Configuration.TITLE);
		//setIconImage(Utility.getImage("icon.png"));
	}
	
	public void close() {
		dispose();
	}

	public void init() {
		setup();
		//setBackground();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void setBackground() {
		JLabel background = new JLabel(Utility.getImageIcon("background.png"));
		add(background);
	}

	public void setup() {
		add(new Button("Play Now", new Rectangle(BUTTON_X, BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT)));
		//add(btnUpdate);
		add(new Button("Forum", new Rectangle(BUTTON_X + X_DIFF, BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT)));
		//add(new Button("Store", new Rectangle(BUTTON_X + (3 * X_DIFF), BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT)));
		//add(new Button("Vote", new Rectangle(BUTTON_X + (4 * X_DIFF), BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT)));

		label.setBounds(50, 150, 500, 50);
		label.setForeground(new Color(116, 118, 120));
		label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
		add(label);

		progressBar = new JProgressBar();
		progressBar.setValue(100);
		progressBar.setString("");
		progressBar.setPreferredSize(new Dimension(620, 50));
		progressBar.setStringPainted(true);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		//progressBar.setForeground(Color.decode("0x049a04"));
		add(progressBar, BorderLayout.SOUTH);

	}
}
