package interfaceGraphic;

import java.awt.Color;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButton;

public class radioAcme extends JRadioButton{

	public radioAcme() {
		super();
		this.redessiner();
	}

	public radioAcme(Action a) {
		super(a);
		this.redessiner();
	}

	public radioAcme(Icon icon, boolean selected) {
		super(icon, selected);
		this.redessiner();
	}

	public radioAcme(Icon icon) {
		super(icon);
		this.redessiner();
	}

	public radioAcme(String text, boolean selected) {
		super(text, selected);
		this.redessiner();
	}

	public radioAcme(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		this.redessiner();
	}

	public radioAcme(String text, Icon icon) {
		super(text, icon);
		this.redessiner();
	}

	public radioAcme(String text) {
		super(text);
		this.redessiner();
	}
	
	public void redessiner()
		{
			this.setBackground(Color.BLUE);
			this.setForeground(Color.CYAN);
		}

}
