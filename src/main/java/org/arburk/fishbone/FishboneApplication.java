package org.arburk.fishbone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //combines @ComponentScan, @EnableAutoConfiguration & @SpringBootConfiguration
public class FishboneApplication {

  public static void main(String[] args) {
    SpringApplication.run(FishboneApplication.class, args);
  }

}
