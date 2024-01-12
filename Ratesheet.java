// import necessary packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class Ratesheet {
    // to handle exceptions include throws
    public static void main(String[] args)
        throws IOException
    {
        Currcency USD = new Currcency(); 

        USD.setName("Dollars");
        USD.setAmount(200);
        USD.setCountry("United States");
        
        
        // list that holds strings of a file
        List<String> listOfStrings = new ArrayList<String>();
       
        // load data from file
        BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"));
       
        // read entire line as string
        String line = reader.readLine();
       
        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = reader.readLine();
        }
       
        // closing bufferreader object
        reader.close();
       
        // storing the data in arraylist to array
        String[] array = listOfStrings.toArray(new String[0]);
       
        // printing each line of file
        // which is stored in array
        for (String str : array) {
            System.out.println(str);
        }

        System.out.println("Name: "+ USD.getCountry());
        
    }

}