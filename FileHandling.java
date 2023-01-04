package FileHandling;

 

import java.io.File;
import java.io.IOException;

 

public class FileHandling {
    public static void main (String[]args) throws IOException {
        //declare the name of the file
        File file = new File ("FirstFilehandling.txt");

    try{
        //indicate that the file in the desired path already existed
        if(!file.exists()){

 

        //create the file in the desired path
          file.createNewFile();
          System.out.println(file.getName() + "successfully created");
          System.out.println(file.getAbsolutePath());
        }
        //throws invalid comment if the file already exists
        else{
          System.out.println(file.getName() + " already exists.");
          System.out.println(file.getAbsolutePath());
          System.out.println(file.length());
        //operation where if the code finds the same file name..
        //it automatically deletes the file.
          file.delete();
        //this is a file method btw
            System.out.println("File already deleted.");
        }
    }
    catch(IOException e){
          System.out.println("There is an error: ");
          System.out.println(e.getMessage());
        }
      }
    }
