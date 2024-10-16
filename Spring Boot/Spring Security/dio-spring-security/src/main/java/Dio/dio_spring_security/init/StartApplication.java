package Dio.dio_spring_security.init;

import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {
    @Transactional
    @Override
    public void run(String... args) throws Exception {


    }
}
