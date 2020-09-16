package io.pivotal.pal.tracker;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
>>>>>>> 630aa01daf06b07fc779587d3747b283a72da17c

@SpringBootApplication
public class PalTrackerApplication {

<<<<<<< HEAD
    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Bean
    TimeEntryRepository timeEntryRepository() {
        return new InMemoryTimeEntryRepository();
    }
=======
    public static void main(String[] args ) {
        SpringApplication.run(PalTrackerApplication.class,args);
    }


>>>>>>> 630aa01daf06b07fc779587d3747b283a72da17c
}
