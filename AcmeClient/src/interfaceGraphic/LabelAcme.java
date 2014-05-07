package interfaceGraphic;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.JLabel;

public class LabelAcme  extends JLabel{

	public LabelAcme() {
		super();
		this.redessiner();
	}

	public LabelAcme(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		this.redessiner();
	}

	public LabelAcme(Icon image) {
		super(image);
		this.redessiner();
	}

	public LabelAcme(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		this.redessiner();
	}

	public LabelAcme(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		this.redessiner();
	}

	public LabelAcme(String text) {
		super(text);
		this.redessiner();
	}
	
	public void redessiner()
		{
			this.setForeground(Color.CYAN);
		}

	
}
