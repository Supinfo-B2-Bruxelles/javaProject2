package interfaceGraphic;

import javax.swing.Icon;
import javax.swing.JLabel;

public class BoutonLabel extends JLabel{

	public Integer id;
	
	public BoutonLabel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoutonLabel(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public BoutonLabel(Icon image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public BoutonLabel(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public BoutonLabel(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public BoutonLabel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public BoutonLabel(String text, Integer id)
		{
			super(text);
			this.id=id;
		}
}
