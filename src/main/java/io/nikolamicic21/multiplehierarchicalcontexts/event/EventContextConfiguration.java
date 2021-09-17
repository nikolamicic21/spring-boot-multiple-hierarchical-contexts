package io.nikolamicic21.multiplehierarchicalcontexts.event;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
@Configuration(proxyBeanMethods = false)
public class EventContextConfiguration {
}
