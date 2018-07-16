
public class MyStatTest {

	private static Object result;

	public MyStatTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubjjfzfds
		
  Employee e = new Employee("umuganwa", 650530);
  Manager m = new Manager ("Willy", 120272, "CIO", 100);
 //  e.setEmployeeID(720212022);
//   e.setEmployeeName("Regine");
  
    
		
	MyStats st = new MyStats();
	
	st.setAddress("santon");
	st.setGender("F");
//	st.setIdNumber(e.getEmployeeID())
//	st.setName(e.getEmployeeName());
	st.setSurname("Nsenda");
	
	System.out.println("Name " + e.toString() + " Surname " + st.getSurname() + " Gender " + st.getGender() + " ID " + st.getIdNumber() + " Address " + st.getAddress());
  
		int[] numArray = {100,200,300};
		System.out.println( "The average is..." + averages(numArray) + " employee department " + m.getDepartment());
		
	}	
	

	public static float averages(int[] num){
		float result = 0;
		float result2 = 0;
		for (int number:num)
			result += number;
		System.out.println( "The result of for num is." + result  + "the table lenght is...  " + num.length );
		
		for (int i=1; i<num.length ;i++)
			
		result2 += num[i];
		
		System.out.println ("The table i result is  " + result2 + " the table lenght is " + num.length + "  the average is " + result2/num.length );
			
		
		return result/num.length;
	}
	
}	
        


