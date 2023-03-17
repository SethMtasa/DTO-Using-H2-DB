package seth.practice.dtojavaguides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import seth.practice.dtojavaguides.model.Location;
import seth.practice.dtojavaguides.model.User;
import seth.practice.dtojavaguides.repository.LocationRepository;
import seth.practice.dtojavaguides.repository.UserRepository;

@SpringBootApplication
public class   DtojavaguidesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtojavaguidesApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Harare");
		location.setDescription("Capital City");
		location.setLongitude(40.5);
		location.setLatitude(30.2);
		locationRepository.save(location);


		User user1 = new User();
		user1.setEmail("mtasaseth@gmail.com");
		user1.setFirstName("Seth");
		user1.setLastName("Mtasa");
		user1.setLocation(location);
		user1.setPassword("secret");
		userRepository.save(user1);


		User user2 = new User();
		user2.setEmail("mtasazyek@gmail.com");
		user2.setFirstName("Zyek");
		user2.setLastName("Mtasa");
		user2.setLocation(location);
		user2.setPassword("hide");
		userRepository.save(user2);
	}
}
