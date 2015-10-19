package com.pulsarsoft.popspot.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.pulsarsoft.popspot.Model.LocationVote;

/**
 * @author Aurimas Degutis.
 */
public interface LocationVoteRepository extends MongoRepository<LocationVote, String>{

}
