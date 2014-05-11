package interfaceGraphic;

import java.awt.Component;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ButtonRenderer extends BoutonContextAcme implements TableCellRenderer{

	
	
	public ButtonRenderer(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public ButtonRenderer(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public ButtonRenderer(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public ButtonRenderer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int col) {
	    //On écrit dans le bouton ce que contient la cellule
	    setText((value != null) ? value.toString() : "");
	    //On retourne notre bouton
	    return this;
	  }


	
	}
