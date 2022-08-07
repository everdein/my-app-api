package api.myappapi;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.myappapi.student.Student;


@SpringBootApplication
@RestController // Serves REST endpoints
public class MyAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApiApplication.class, args);
	}

	@GetMapping // REST endpoint
	public List<Student> hello() {
		return List.of(
			new Student(
				1L, 
				"miriam", 
				"miriam@gmail.com", 
				LocalDate.of(2000, Month.JANUARY, 5), 
				18
			)
		);
	}
}
