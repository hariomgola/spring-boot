package Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoService {
	private static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(new Employee(1, "Rushikesh", "Karkhanis", 25, "rushikesh_k", "rushikesh.k@example.com",
				"Navi Mumbai, Sanpada"));
		employees.add(new Employee(2, "Aarju", "Tripathi", 24, "aarju_t", "aarju.t@example.com", "Pune, Hinjewadi"));
		employees.add(new Employee(3, "Sachin", "Tendulkar", 25, "sachin_t", "sachin.t@example.com", "Mumbai, Bandra"));
		employees.add(new Employee(4, "Nupur", "Shah", 26, "nupur_s", "nupur.s@example.com", "Nagpur, PremNagar"));
		employees
				.add(new Employee(5, "Priyanka", "Das", 25, "priyanka_d", "priyanka.d@example.com", "Kolkata, Bangur"));
		employees.add(new Employee(6, "Arvind", "Patil", 30, "arvind_p", "arvind.p@example.com", "Delhi, Vasant Kunj"));
		employees.add(
				new Employee(7, "Simran", "Singh", 28, "simran_s", "simran.s@example.com", "Chandigarh, Sector 22"));
		employees.add(new Employee(8, "Vikram", "Bansal", 32, "vikram_b", "vikram.b@example.com", "Gurgaon, MG Road"));
		employees.add(new Employee(9, "Neha", "Gupta", 27, "neha_g", "neha.g@example.com", "Bangalore, Whitefield"));
		employees.add(new Employee(10, "Rajesh", "Kumar", 35, "rajesh_k", "rajesh.k@example.com",
				"Hyderabad, Banjara Hills"));
		employees.add(new Employee(11, "Kavita", "Rathod", 29, "kavita_r", "kavita.r@example.com", "Mumbai, Powai"));
		employees.add(new Employee(12, "Mohan", "Patel", 31, "mohan_p", "mohan.p@example.com", "Surat, Adajan"));
		employees.add(new Employee(13, "Ravi", "Sharma", 28, "ravi_s", "ravi.s@example.com", "Lucknow, Gomti Nagar"));
		employees.add(new Employee(14, "Alok", "Gupta", 33, "alok_g", "alok.g@example.com", "Noida, Sector 62"));
		employees.add(new Employee(15, "Isha", "Mehta", 26, "isha_m", "isha.m@example.com", "Ahmedabad, CG Road"));
		employees.add(
				new Employee(16, "Sandeep", "Verma", 34, "sandeep_v", "sandeep.v@example.com", "Chennai, T Nagar"));
		employees.add(new Employee(17, "Priya", "Chopra", 30, "priya_c", "priya.c@example.com", "Kolkata, Salt Lake"));
		employees.add(new Employee(18, "Rohit", "Kohli", 29, "rohit_k", "rohit.k@example.com", "Delhi, Karol Bagh"));
		employees.add(new Employee(19, "Ankita", "Yadav", 27, "ankita_y", "ankita.y@example.com", "Indore, MG Road"));
		employees.add(
				new Employee(20, "Pooja", "Sharma", 32, "pooja_s", "pooja.s@example.com", "Jaipur, Malviya Nagar"));

	}

	public List<Employee> getAllEmployee() {
		return employees;
	}

	public List<Employee> getEmployeeById(int id) {
		return employees.stream().filter(_data -> _data.getId() == id).toList();
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public void deleteEmployee(int id) {
		employees.remove(id);
	}

}
