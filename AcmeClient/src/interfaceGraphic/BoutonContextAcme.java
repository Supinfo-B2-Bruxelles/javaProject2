package interfaceGraphic;

import java.awt.Dimension;

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
		}
}

