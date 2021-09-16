package io.nikolamicic21.multiplehierarchicalcontexts;

import io.nikolamicic21.multiplehierarchicalcontexts.data.DataService;
import io.nikolamicic21.multiplehierarchicalcontexts.web.WebService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        final var context = SpringApplication.run(MainApplication.class, args);
        final var webService = context.getBean(WebService.class);
        final var dataService = context.getBean(DataService.class);
    }

}
