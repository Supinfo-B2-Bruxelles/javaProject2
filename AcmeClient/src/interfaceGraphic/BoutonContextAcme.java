package interfaceGraphic;

import java.awt.Dimension;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;

public class BoutonContextAcme extends bouttonAcme{
	
	public int longueur=100;
	public int hauteur=20;

	public BoutonContextAcme(Action a) {
		super(a);
		this.redessinerBouton();
		
	}

	public BoutonContextAcme(Icon icon) {
		super(icon);
		this.redessinerBouton();
	}

	public BoutonContextAcme(String text, Icon icon) {
		super(text, icon);
		this.redessinerBouton();
	}

	public BoutonContextAcme(String name) {
		super(name);
		this.redessinerBouton();
	}
	
	public void redessinerBouton()
		{
			this.setPreferredSize(new Dimension(longueur, hauteur));
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

