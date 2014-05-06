package interfaceGraphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class bouttonAcme extends JButton implements MouseListener{
	
	public int longueur=100;
	public int hauteur=100;
	public String type;
	
	public bouttonAcme(Action a) {
		super(a);
		this.redessinerBoutton();
	}

	public bouttonAcme(Icon icon) {
		super(icon);
		this.redessinerBoutton();
	}

	public bouttonAcme(String text, Icon icon) {
		super(text, icon);
		this.redessinerBoutton();
	}

	public bouttonAcme(String name) {
		super(name);
		//type de boutton
		this.type=name;
		this.redessinerBoutton();
	}
	
	
	public void redessinerBoutton()
		{
			//dessin du boutton
			this.setBorderPainted(false);
			this.setBackground(Color.cyan);
			this.setMargin(new Insets(0,0,0,0));
			this.setForeground(Color.BLUE);
			this.setSize(longueur, hauteur);
			this.setPreferredSize(new Dimension(hauteur, longueur));
			
			
			
			this.addMouseListener(this);
			
			
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
