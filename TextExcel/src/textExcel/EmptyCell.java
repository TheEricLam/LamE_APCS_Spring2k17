package textExcel;

public class EmptyCell implements Cell {
	
	public EmptyCell(){
		
	}

	@Override
	public String abbreviatedCellText() {
		
		return null;
	}

	@Override
	public String fullCellText() {
		
		return null;
	}

}
