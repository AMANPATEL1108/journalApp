package net.engineeringdigest.journalApp.scheduler;

import net.engineeringdigest.journalApp.Repository.UserRepository;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.service.EmailService;
import net.engineeringdigest.journalApp.service.SentimentAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserScheduler {
    @Autowired
    private EmailService emailService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SentimentAnalysisService sentimentAnalysisService;



//    @Scheduled(cron = "0 9 * * SUN")
//    public void fetchUserandSendMail() {
//
//        List<User> user = userRepository.getUsers();
//
//        for (User user : users) {
//            List<JournalEntry> journalEntries = user.getJournalEntries();
//            List<JournalEntry> filteredEntries = journalEntries.stream().filter(x -> x.getDate().isAfter(LocalDateTime.now().minus(7, ChronoUnit.DAYS))).map(x -> x.getContent()).collect(Collectors.toList());
//            String entry = String.join((CharSequence) " ", filteredEntries);
//            int sentiment = sentimentAnalysisService.getSerntiment(entry);
//            emailService.sendEmail(user.getEmail(), "Sentiment ", sentiment);
//        }
//
//    }

}
