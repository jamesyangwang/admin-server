package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class NotifierConfig {
 
//    @Autowired private Notifier notifier;
// 
//    @Bean
//    public FilteringNotifier filteringNotifier() {
//        return new FilteringNotifier(notifier, null);
//    }
// 
//    @Bean
//    @Primary
//    public RemindingNotifier remindingNotifier() {
//        RemindingNotifier remindingNotifier = new RemindingNotifier(filteringNotifier(), null);
//        remindingNotifier.setReminderPeriod(Duration.ofMinutes(TimeUnit.MINUTES.toMinutes(5)));
//        return remindingNotifier;
//    }
}