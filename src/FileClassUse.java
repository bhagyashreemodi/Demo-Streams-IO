import java.io.File;
import java.util.Scanner;


public class FileClassUse {

	public static void main(String[] args) {
		
		File file = new File(args[0]);
		File listOfFiles[] = null;
		if(!file.exists()){
			System.out.println("The given file or directory does not exist");
			return;
		}
		if(file.isDirectory()){
			System.out.println("The contents of the directory are :");
			listOfFiles = file.listFiles();
			System.out.println("the count of files is"+ listOfFiles.length);
			for (File fileName : listOfFiles) {
				System.out.println(fileName.getName());
			}
			for (File fileName : listOfFiles) {
				if(fileName.getName().matches(".+\\.txt")){
					System.out.println("Do you want to delete "+fileName.getName()+"?y or n");
					Scanner in = new Scanner(System.in);
					String choice = in.next().toLowerCase();
					switch(choice){
					case "y":
						if(fileName.delete()){
							System.out.println("successfully deleted");
						}
						else
							System.err.println("This file can not be deleted");
						break;
					case "n":
						continue;
					default:
						System.out.println("Please enter y or n");
							
					}
					in.close();
				}
			}
		}
		if(file.isFile()){
			System.out.println("The given file exists");
			System.out.println("The path of the file is "+file.getAbsolutePath());
			System.out.println("The size of the file is "+file.length() +" Byte(s)");
		}
		
	}
	
	
}
