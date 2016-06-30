package launcher.core.buttons;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import launcher.utility.Utility;

@SuppressWarnings("serial")
public class Button extends JButton implements MouseListener{
	public Button(String text, Rectangle bounds) {
		super(text.toUpperCase());
		//this.setIcon(Utility.getImageIcon("button.png"));
		//this.setRolloverIcon(Utility.getImageIcon("button-hover.png"));
		this.setHorizontalTextPosition(SwingConstants.CENTER);
		//this.setBorderPainted(false);
		//this.setContentAreaFilled(false);
		//this.setForeground(Color.WHITE);
		this.setFocusable(false);
		this.addActionListener(new ButtonListener());
		this.setBounds(bounds);
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
