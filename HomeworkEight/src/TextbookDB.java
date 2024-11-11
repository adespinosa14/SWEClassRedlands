package HomeworkEight.src;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TextbookDB {

	public TextbookDB(){}
	
	//Read File
	
	public String ReadFile(File textbook_file) 
	{
		
		String fullList= "";
		try 
		{
			
		Scanner input = new Scanner(textbook_file);
		
		while(input.hasNext()) 
		{
			System.out.println(input.nextLine());
			fullList += input.nextLine();
		}
		
		input.close();
		}catch(Exception e)
		
		{
			System.out.println("Error: " + e.getLocalizedMessage());
		}
		
		return fullList;
	}
	
	public void DeleteLine(String SKU, File textbook_file) 
	{
		try 
		{
			Scanner input = new Scanner(textbook_file);
			while(input.hasNext()) 
			{
				String search = input.nextLine();
				if(search.contains(SKU)) 
				{
					System.out.println("Line Deleted");
				}else 
				{
					FileWriter pr = new FileWriter(textbook_file);
					pr.write(search);
					pr.close();
				}
				System.out.println(input.next());
			}
		
		}catch(Exception e) {
			System.out.println("Error:" + e.getLocalizedMessage());
		}
		
	}
	
	public void AddBook(Textbook textbook) 
	{
		File textbook_file = new File("TextbookDB.txt");
		
		try 
		{
			if(textbook_file.createNewFile()) 
				
			{
				System.out.println("File Created");
				
			}else 
			{
				System.out.println("File Already Exists");
				System.out.println("File Created: " + textbook_file.getName());
				String textbook_string = ("SKU: " + textbook.GetSKU() + "| Title: " + textbook.GetTitle() + "| Price: " + textbook.GetPrice() + "| Quantity: " + textbook.GetQuantity() + "\n");
				FileWriter wr = new FileWriter("TextbookDB.txt", true);
				wr.write(textbook_string);
				wr.close();
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
}
