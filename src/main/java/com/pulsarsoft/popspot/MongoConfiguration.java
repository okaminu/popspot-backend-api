package com.pulsarsoft.popspot;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author Aurimas Degutis.
 */

@Configuration
public class MongoConfiguration {

    public static final String HOST = "localhost";
    public static final int CONNECTION_TIMEOUT = 2000;
    public static final String DATABASE_NAME = "popspot";

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        MongoClientOptions options = MongoClientOptions
                .builder()
                .connectTimeout(CONNECTION_TIMEOUT)
                .build();

        MongoClient mongoClient = new MongoClient(HOST, options);
        mongoClient.getDB(DATABASE_NAME);

        return new SimpleMongoDbFactory(mongoClient, DATABASE_NAME);
    }
}
