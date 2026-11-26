
package org.istad.m2restapi.init;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.istad.m2restapi.model.User;
import org.istad.m2restapi.repository.UserRepository;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserInitialization {

    private final UserRepository userRepository;

    @PostConstruct
    void init() {
        log.info("Hello");
        if (userRepository.count() == 0) {
            User user1 = new User();
            user1.setName("Bora Nin");
            user1.setGender("Boy");
            user1.setEmail("ninbora8082@gmail.com");
            user1.setPassword("boranin8282");
            user1.setIsActive(true);
            User user2 = new User();
            user2.setName("Dara Sok");
            user2.setGender("Boy");
            user2.setEmail("dara.sok@gmail.com");
            user2.setPassword("dara12345");
            user2.setIsActive(true);
            User user3 = new User();
            user3.setName("Sokha Chan");
            user3.setGender("Girl");
            user3.setEmail("sokha.chan@gmail.com");
            user3.setPassword("sokha12345");
            user3.setIsActive(true);
            User user4 = new User();
            user4.setName("Vanna Kim");
            user4.setGender("Boy");
            user4.setEmail("vanna.kim@gmail.com");
            user4.setPassword("vanna12345");
            user4.setIsActive(false);
            User user5 = new User();
            user5.setName("Sreymom Ly");
            user5.setGender("Girl");
            user5.setEmail("sreymom.ly@gmail.com");
            user5.setPassword("sreymom12345");
            user5.setIsActive(true);

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
            userRepository.save(user4);
            userRepository.save(user5);

            log.info("5 users initialized successfully!");

        } else {
            log.info("Users already exist. Skipping initialization.");
        }
    }
}
