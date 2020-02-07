package testing;

import org.junit.Test;

import bean.Employee;
import service.EmployeeService;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeService {
	List<Employee> list = new ArrayList<Employee>();
	Employee employee;

	@Test
	public void testGetEmployee() {
		new Employee("Ravi", "Sankar", "26");
		list.add(employee);
		assertEquals(list, EmployeeService.getEmployee(employee));
		try {
			Employee e1 = new Employee(null, "Sankar", "26");
			Employee e2 = new Employee("Ravi", null, "26");
			Employee e3 = new Employee("Ravi", "Sankar", null);
			EmployeeService.getEmployee(e1);
			EmployeeService.getEmployee(e2);
			EmployeeService.getEmployee(e3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
