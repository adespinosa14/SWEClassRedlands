package JMCSHomework;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;
import java.util.ArrayList;

public class JMCS 
{
    public File inputFile;
    public ArrayList<String> catalog;
    
    public JMCS(File inputFile)
    {
        this.inputFile = inputFile;
        catalog = new ArrayList<String>();
    }

    public void buildCatalog()
    {

        Scanner inputScan = null;

        try
        {
            inputScan = new Scanner(inputFile.getAbsolutePath());
            search(inputScan);
        }catch(Exception e)
        {
            System.out.println("Error- This file could not be found: " + e.getMessage());
        }finally
        {
            if(inputScan != null)
            {
                inputScan.close();
            }
        }
    }

    public void search(Scanner inputScan)
    {
        catalog = new ArrayList<String>();
        Stack<String> stack = new Stack<>();
        String codeLine = "";
        String previousCodeLine = "";

        while(inputScan.hasNextLine())
        {
            codeLine = inputScan.nextLine();
            codeLine = codeLine.trim();
            if(codeLine.length() > 0)
            {
                if(!codeLine.equals("{") && !codeLine.equals("}"))
                {
                    previousCodeLine = codeLine;
                }else if(codeLine.equals("{"))
                {
                    stack.push(previousCodeLine);
                }else
                {
                    catalog.add(stack.pop());
                }

            }
        }
    }

    public String toString()
    {
        String text = "";

        for(int i = 0; i < catalog.size(); i++)
        {
            text += catalog.get(i) + "/n";
        }

        return text;
    }
}
