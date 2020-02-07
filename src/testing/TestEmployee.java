package testing;

import org.junit.Test;

import bean.Employee;

import static org.junit.Assert.*;

public class TestEmployee {
	Employee employee = new Employee("Ravi", "Sankar", "26");

	@Test
	public void testFirstName() {
		employee.setFirstName("Sharatha");
		assertEquals("Sharatha", employee.getFirstName());
		employee.setFirstName(" ");
		assertEquals(" ", employee.getFirstName());
		try {
			employee.setFirstName(null);
			employee.getFirstName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLastName() {
		employee.setLastName("Paulraj");
		assertEquals("Paulraj", employee.getLastName());
		employee.setLastName(" ");
		assertEquals(" ", employee.getLastName());
		try {
			employee.setLastName(null);
			employee.getLastName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAge() {
		employee.setAge("22");
		assertEquals("22", employee.getAge());
		employee.setAge(" ");
		assertEquals(" ", employee.getAge());
		try {
			employee.setAge(null);
			employee.getAge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
