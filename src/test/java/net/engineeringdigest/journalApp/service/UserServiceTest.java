package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Repository.UserRepository;
import net.engineeringdigest.journalApp.entity.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;


    //    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {
            "amana",
            "dev"
    })
    public void testfindByUserName(String name) {
        assertNotNull(userRepository.findByUserName(name));
    }


    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,4,7"
    })
    @ParameterizedTest
    public void test(int a, int b, int rexpected) {
        assertEquals(rexpected, a + b);
    }

}
