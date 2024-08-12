package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HackerRankArrayListSolvingQueries {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the number of lines
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        System.out.println("n is: "+n);
        // Initialize the list of lists to store the input data
        List<List<Integer>> arrayList = new ArrayList<>();
        
        // Read each line of input and store it in the list of lists
        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().trim().split("\\s+");
            System.out.println("String[] line is "+line[0]);
            int d = Integer.parseInt(line[0]); //This is the number of digits in line
            List<Integer> list = new ArrayList<>();
            //We iterate through the loop till d which is the number of digits in a line
            for (int j = 1; j <= d; j++) {
                list.add(Integer.parseInt(line[j]));
            }
            arrayList.add(list);
        }
        
     // Read the number of queries
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        
        // Process each query
        for (int i = 0; i < q; i++) {
            String[] query = bufferedReader.readLine().trim().split("\\s+");
            int x = Integer.parseInt(query[0]);
            int y = Integer.parseInt(query[1]);
            
            try {
                // Print the result for the query
                System.out.println(arrayList.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                // Print ERROR! if the position does not exist
                System.out.println("ERROR!");
            }
        }
	}

}

//List<List<Integer>> = [[41,77,74,22,44],[12],[37,34,36,52],[],[20,22,33]]
//input
//5 - This indicates number of lines after this line
//5 41 77 74 22 44 //d =5 and list will be [41,77,74,22,44]
//1 12 //d=1 and list will be [12]
//4 37 34 36 52 //d=4 and list will be [37,34,36,52]
//0 //d=0 list is empty []
//3 20 22 33 //d =3 and list will be [20,22,33]
//5 //q =5 indicating number of lines after this line
//1 3 //x =1 ,y =3 list.get(1).get(3)
//3 4
//3 1
//4 3
//5 5