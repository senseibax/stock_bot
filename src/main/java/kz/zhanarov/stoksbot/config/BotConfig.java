package kz.zhanarov.stoksbot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class BotConfig {
    @Value("${bot.name}")
    private String botName;
    @org.springframework.beans.factory.annotation.Value("${bot.token}")
    private String botToken;
}
