
public class ArraysTest {
	    public static void main(String args[]){
	        String[] names = new String [3];
	        names[0] ="Ashley Kalinda";
	        names[1] = "Lovit";
	        names[2] = "Frank Nsenda";
	        char letter = 'a';

	        int[] numbers = {100,200,300};
	        for (String name:names) System.out.println("Name: " + name + " "  + letter);
	        for (int number:numbers) System.out.println( "Numbers "+ number );
	        StringBuilder sb = new StringBuilder("I am Regine ");
	        System.out.println(sb); 
	        sb.append(" Kalinda");
	        System.out.println(sb); 
	        sb.insert(12, "Nsenda");
	        System.out.println(sb); 
	}
	    
}
