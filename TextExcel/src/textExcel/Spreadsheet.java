package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int row;
	private int column;
	private Cell[][] excelSpreadsheet = new Cell[row][column];	// 2D array of cells with 20 rows and 12 columns
	private String newFirstRow = "";
	
	public Spreadsheet() {
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				excelSpreadsheet[i][j] = new EmptyCell();
			
			}
		}
		newFirstRow += "   ";
		for(int i = 0; i < 12; i++){
			char letter = (char) ('A' + i);
			String firstRow ="|" + letter + "         ";
			
			newFirstRow += firstRow;
		}
	}
	
	@Override
	public String processCommand(String command)
	{
		if(command.equals("clear")){ // clears the entire spreadsheet
			for(int i = 0; i < row; i++){
				for(int j = 0; j < column; j++){
					excelSpreadsheet[i][j] = new EmptyCell();
				}
			}
			return getGridText();			
		}
		
		if(command.contains("=")){ // assigning a value to a cell
			String[] splitCommand = command.split("=");
			SpreadsheetLocation location = new SpreadsheetLocation(splitCommand[0]);
			excelSpreadsheet[location.getCol()][location.getRow()] = new TextCell(splitCommand[1]);
			return command;
		}
		
		
		if(command.contains("clear ")){ //clears the cell at the location
			String[] splitLocation = command.split(" ");
			SpreadsheetLocation location = new SpreadsheetLocation(splitLocation[1]);
			excelSpreadsheet[location.getCol()][location.getRow()] = new EmptyCell();
			
			
		}
		return command;
	}
		//SpreadsheetLocation cellLocation = new SpreadsheetLocation(command);
		//return excelSpreadsheet[cellLocation.getCol()][cellLocation.getRow()].fullCellText();	
	

	

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		row = 20;
		return row;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		column = 12;
		return column;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText(){
		String spreadSheet = newFirstRow;
		spreadSheet += "|"; // puts a "|" at the end of the first row
		spreadSheet += "\n1  |";
		for(int i = 0; i < 20; i++){
			int newNum = i + 2 ;
			for(int j = 0; j < 12; j++){ 
				spreadSheet += "          |";
				
				if(j == 11){
					int rowNum = newNum;
					spreadSheet += "\n";
					if(rowNum < 10){
						spreadSheet += rowNum+"  |";
					}else if(rowNum < 21){
						spreadSheet += rowNum+" |";
					}
				}
			}
		}
		
		
		return spreadSheet;
		
	}

}