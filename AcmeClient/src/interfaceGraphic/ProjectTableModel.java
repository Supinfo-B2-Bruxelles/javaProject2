package interfaceGraphic;


import java.util.Vector;



import javax.swing.table.AbstractTableModel;

import main.Project;

public class ProjectTableModel  extends AbstractTableModel{
	
	private static final long serialVersionUID = -3877480850607191592L;
    private static final String[] LABELS = { "Id", "Nom", "Date de début", "Date de fin", "Avancement", "Nombre d'employés"}; 
    private static final Class<?>[] TYPES = { Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class};
    
    private Vector<Project> projet;
    
	public ProjectTableModel() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
