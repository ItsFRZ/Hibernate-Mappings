package com.ItsFRZ.Hibernate;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ItsFRZ.Hibernate.Entity.Gender;
import com.ItsFRZ.Hibernate.Entity.User;
import com.ItsFRZ.Hibernate.Entity.UserProfile;
import com.ItsFRZ.Hibernate.Repository.UserProfileRepository;
import com.ItsFRZ.Hibernate.Repository.UserRepository;

@SpringBootApplication
public class SpringOneOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOneOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		User user = new User();
		user.setName("Faraz Sheikh");
		user.setEmail("faraz@gmail.com");
		
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Nagpur");
		userProfile.setBirthOfDate(LocalDate.of(1999, 06, 11));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567890");
		
		user.setProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
