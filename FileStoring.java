package miniproject;

import java.io.*;
import java.util.*;
public class FileStoring {

	HashMap <String, Details> MapComp = new HashMap<>();
	public void fileLoader() 
	{

	// ArrayList<String> objcompdetOfBanks=new ArrayList<>();
	 String path="C:\\Users\\Gopi\\Downloads\\OneDrive_2021-07-26\\Mini Project I\\complaints.csv";
	 String line="";
	 
	 try {
		BufferedReader buf=new BufferedReader(new FileReader(path));
		while ((line=buf.readLine())!=null)
		{   
			
			String[] elements=line.split(",");
			Details d=new Details();
			d.dateReceived=elements[0];
			d.product=elements[1];
			d.subproduct=elements[2];
			d.issue=elements[3];
			d.subissue=elements[4];
			d.company=elements[5];
			d.state=elements[6];
			d.zip=elements[7];
			d.subvia=elements[8];
			d.dateSent=elements[9];
			d.compResp=elements[10];
			d.timeResp=elements[11];
			d.consDispute=elements[12];
			d.cid=elements[13];
			
			MapComp.put(elements[13],d); 
		}
		buf.close();
		
	} 
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	}

	HashMap<String,Details> GetMapComp(){
		
		return MapComp;
		
	}
	
}
