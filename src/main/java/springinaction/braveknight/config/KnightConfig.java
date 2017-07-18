package springinaction.braveknight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springinaction.braveknight.beans.BraveKnight;
import springinaction.braveknight.beans.Knight;
import springinaction.braveknight.beans.Quest;
import springinaction.braveknight.beans.SlayDragonQuest;

/**
 * Created by zzhang on 2017/7/12.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
