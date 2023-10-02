// Jordan Lyle, 9/15/2022, Controller.java for Assignment 2

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Controller implements ActionListener, MouseListener, KeyListener
{
	boolean keyLeft;
	boolean keyRight;
	boolean keyUp;
	boolean keyDown;
	View view;
	Model model;
	Controller(Model m)
	{
		model = m;
	}

	void setView(View v)
	{
    	view = v;
	}

	public void mousePressed(MouseEvent e)
	{
		model.setDestination(e.getX(), e.getY());
	}

	public void mouseReleased(MouseEvent e) {    }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {    }
	public void mouseClicked(MouseEvent e) {    }

	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_RIGHT: keyRight = true; break;
			case KeyEvent.VK_LEFT: keyLeft = true; break;
			case KeyEvent.VK_UP: keyUp = true; break;
			case KeyEvent.VK_DOWN: keyDown = true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_RIGHT: keyRight = false; break;
			case KeyEvent.VK_LEFT: keyLeft = false; break;
			case KeyEvent.VK_UP: keyUp = false; break;
			case KeyEvent.VK_DOWN: keyDown = false; break;
		}
	}

	public void keyTyped(KeyEvent e)
	{
	}

	void update()
	{
		if(keyRight) 
		{
			model.dest_x += 4;
		}
		if(keyLeft) 
		{
			model.dest_x -= 4;
		}
		if(keyDown) 
		{
			model.dest_y += 4;
		}
		if(keyUp) 
		{
			model.dest_y -= 4;
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		view.removeButton();
	}
}
