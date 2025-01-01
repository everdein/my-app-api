package api.myappapi;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.myappapi.student.Student;
import api.myappapi.dog.Dog;

@SpringBootApplication
@RestController // Serves REST endpoints
public class MyAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApiApplication.class, args);
	}

	// @GetMapping // REST endpoint
	// @CrossOrigin(origins = "http://localhost:3000")
	// public List<Student> hello() {
	// return List.of(
	// new Student(
	// 1L,
	// "miriam",
	// "miriam@gmail.com",
	// LocalDate.of(2000, Month.JANUARY, 5),
	// 18));
	// }

	@GetMapping // REST endpoint
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Dog> dogs() {
		return List.of(
				new Dog(
						"Fido",
						"brown",
						"labrador",
						5,
						0));
	}
}