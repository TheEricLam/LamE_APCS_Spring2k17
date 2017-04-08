package textExcel;

public class TextCell implements Cell {
	
	private String values;
	
	public TextCell(String strValue){
		values = strValue;
	}
	
	public TextCell(){
		
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return "          ";
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return values;
	}
	
	public String getCellValue(Location location){
		
		return abbreviatedCellText();
		
	}

}
