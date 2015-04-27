import java.io.*;
import java.util.*;
public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		//editFile("Dest.txt");
		//imgCopy("Source.jpg", "Dest.jpg");
	}
}
public void txtCopy(String a,String b){
		try{
			FileReader FR = new FileReader(a);
			BufferedReader BR = new BufferedReader(FR);
			FileWriter FW = new FileWriter(b);
			BufferedWriter BW = new BufferedWriter(FW);
			String Line;
			while((Line=BR.readLine())!=null){
				BW.write(Line);
				BW.newLine();
			}
			BR.close();
			FW.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
}