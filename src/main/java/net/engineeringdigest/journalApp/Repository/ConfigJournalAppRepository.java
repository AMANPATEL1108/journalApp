package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.entity.ConfigjournalAppEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigjournalAppEntity, ObjectId> {
}
