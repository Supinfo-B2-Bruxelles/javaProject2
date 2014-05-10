package interfaceGraphic;


import java.util.Vector;



import javax.swing.table.AbstractTableModel;

import main.Project;

public class ProjectTableModel  extends AbstractTableModel{
	
	private static final long serialVersionUID = -3877480850607191592L;
    private static final String[] LABELS = { "Id", "Nom", "Date de d�but", "Date de fin", "Avancement", "Nombre d'employ�s"}; 
    private static final Class<?>[] TYPES = { Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class};
    
    private Vector<Project> projet;
    
	public ProjectTableModel(Vector<Project> projets) {
		super();
		this.projet=projets;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumnCount() {
		
		return LABELS.length;
	}

	@Override
	public int getRowCount() {
		
		return this.projet.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
