package net.engineeringdigest.journalApp.cache;


import net.engineeringdigest.journalApp.Repository.ConfigJournalAppRepository;
import net.engineeringdigest.journalApp.entity.ConfigjournalAppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Appcache {

    @Autowired
    private ConfigJournalAppRepository configjourn;

    private Map<String, String> APP_CACHE;

    @PostConstruct
    public void init() {
        APP_CACHE = new HashMap<>();
        List<ConfigjournalAppEntity> all = configjourn.findAll();
        for (ConfigjournalAppEntity configjournalAppEntity : all) {
            APP_CACHE.put(configjournalAppEntity.getKey(), configjournalAppEntity.getValue());
        }
    }

}
