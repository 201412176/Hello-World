import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class main 
{
	public static void ReadTextfileFully(String Filename)
	{
		File read = new File(Filename);
		String text = "";
		Scanner scread = null;
		
		try
		{
			scread = new Scanner(read);
			//text = scread.nextLine();
			while(scread.nextLine() != null)
			{
				text = scread.nextLine();
				System.out.println(text);
				
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch (NoSuchElementException e)
		{
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		ReadTextfileFully("textfiles/IT.txt");

	}

}
