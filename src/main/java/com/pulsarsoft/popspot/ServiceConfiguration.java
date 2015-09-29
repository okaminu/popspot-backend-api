package com.pulsarsoft.popspot;

import com.pulsarsoft.popspot.Service.LocationVoteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aurimas Degutis.
 */
@Configuration
public class ServiceConfiguration {

    @Bean
    LocationVoteService createLocationVoteService(){
        return new LocationVoteService();
    }
}
