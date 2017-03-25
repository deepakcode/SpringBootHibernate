package reservationapp;


import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reservationapp.entities.Reservation;

@SpringBootApplication
public class JparepoApplication   {


	public static void main(String[] args) {
		SpringApplication.run(JparepoApplication.class, args);

	}

   
	@Bean
	CommandLineRunner runner(ReservationRepository rr){
		return stringArgs->{
				Stream.of("Deepak", "Mahi", "Sonu", "Bhupesh").forEach(r -> rr.save(new Reservation(r)));
				rr.findAll().forEach(System.out::println);
				
		};
	}
	

}
