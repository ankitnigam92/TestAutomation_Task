import org.testng.annotations.Test;


public class APITest {

	//GET http://dummy.restapiexample.com/api/v1/employees
	/*
	POST http://dummy.restapiexample.com/api/v1/create
	Request: {"name":"test_gk_unique","salary":"123","age":"23"}
	Response: {"name":"test_gk_1","salary":"123","age":"23","id":"
	*/
	//GET http://dummy.restapiexample.com/api/v1/employee/2982
	//PUT http://dummy.restapiexample.com/api/v1/update/2982
	//DELETE http://dummy.restapiexample.com/api/v1/update/29823

	 @Test
	 public void getEmployees() {
	 }

	 @Test
	 public void createEmployees() {
	 }

	@Test
	public void getNewlyCreatedEmployee() {
	 }

	@Test
	public void updateNewlyCreatedEmployee() {
	}

	@Test
	public void deleteEmployee() {
	}
}
