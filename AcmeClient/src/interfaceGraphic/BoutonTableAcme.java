package interfaceGraphic;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class BoutonTableAcme extends DefaultCellEditor{

	
		protected BoutonContextAcme button;
		private boolean   isPushed;
		private ButtonListener bListener = new ButtonListener();
		public Integer id;
		
	   
	  //Constructeur avec une CheckBox
	  public BoutonTableAcme(JCheckBox checkBox) {
	    //Par d�faut, ce type d'objet travaille avec un JCheckBox
	    super(checkBox);
	    //On cr�e � nouveau un bouton
	    button = new BoutonContextAcme("Modifier");
	    button.setOpaque(true);
	    //On lui attribue un listener
	    button.addActionListener(bListener);
	  }
	  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) { 
	    //On pr�cise le num�ro de ligne � notre listener
	    bListener.setRow(row);
	    //Idem pour le num�ro de colonne
	    bListener.setColumn(column);
	    //On passe aussi le tableau en param�tre pour des actions potentielles
	    bListener.setTable(table);
	      
	    //On r�affecte le libell� au bouton
	    button.setText( (value == null) ? "" : value.toString() );
	    //On renvoie le bouton
	    return button;
	  }
	   
	  //Notre listener pour le bouton
	  class ButtonListener implements ActionListener{        
	    private int column, row;
	    private JTable table;
	    private int nbre = 0;
	    private BoutonContextAcme button;
	        
	    public void setColumn(int col){this.column = col;}
	    public void setRow(int row){this.row = row;}
	    public void setTable(JTable table){this.table = table;}
	    
	    public BoutonContextAcme getButton(){return this.button;}
	        
	    public void actionPerformed(ActionEvent event) {
	    	 System.out.println("coucou du bouton : " + ((BoutonContextAcme)event.getSource()).getText());
	         //On affecte un nouveau libell� � une celulle de la ligne
	         //((AbstractTableModel)table.getModel()).setValueAt("New Value " + (++nbre), this.row, (this.column -1));   
	         //Permet de dire � notre tableau qu'une valeur a chang� � l'emplacement d�termin� par les valeurs pass�es en param�tres
	         //((AbstractTableModel)table.getModel()).fireTableCellUpdated(this.row, this.column - 1);
	         this.button = ((BoutonContextAcme)event.getSource());
	    }
	  }     

}
