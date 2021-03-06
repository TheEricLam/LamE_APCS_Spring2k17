package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private String location;
	
    @Override
    public int getRow()
    {
        int rowNum = Integer.parseInt(location.substring(1))-1; //When asked for 1 it is at index 0
        return rowNum;
    }

    @Override
    public int getCol()
    {
       int colNum = location.charAt(0)-'A'; //When column is at 0, letter will be equal to A
        return colNum;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        location = cellName; 
    }

}
