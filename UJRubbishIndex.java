
public class UJRubbishIndex 
{
	private String Data;
	
	public UJRubbishIndex()
	{
		
	}
	
	public String getSourceText()
	{
		return Data;
	}
	
	public void setSourceText(String Data)
	{
		this.Data = Data;
	}
	
	@Override
	public String toString()
	{
		return Data;
	}
}
