// Jordan Lyle, 9/15/2022, View.java for Assignment 2

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	BufferedImage turtle_image;
	JButton b1;
	Model model;

	View(Controller c, Model m)
	{
		model = m;
		try
		{
			this.turtle_image = ImageIO.read(new File("turtle.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace(System.err);
			System.exit(1);
		}
		c.setView(this);
		b1 = new JButton("Don't push me");
		b1.addActionListener(c);
		this.add(b1);
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(128, 255, 255));
    	g.fillRect(0, 0, this.getWidth(), this.getHeight());
    	g.drawImage(this.turtle_image, model.turtle_x, model.turtle_y, null);
	}

	void removeButton()
	{
    	this.remove(b1);
    	this.repaint();
	}	
}
