package io.nikolamicic21.multiplehierarchicalcontexts;

import io.nikolamicic21.multiplehierarchicalcontexts.data.DataContextConfiguration;
import io.nikolamicic21.multiplehierarchicalcontexts.web.WebContextConfiguration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootConfiguration
public class MainApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(MainApplication.class).web(WebApplicationType.NONE)
                .child(DataContextConfiguration.class).web(WebApplicationType.NONE)
                .child(WebContextConfiguration.class).web(WebApplicationType.NONE)
                .run(args);
    }
}
