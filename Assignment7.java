package mylove;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Assignment7 {

	
	@Test
	public void stream() {

		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Naresh");
		name.add("Kavya");
		name.add("Reshu");
		name.add("Nani");
		
		long c=name.stream().filter(s->s.startsWith("N")).count();
		
		System.out.println(c);
		
	}

}
