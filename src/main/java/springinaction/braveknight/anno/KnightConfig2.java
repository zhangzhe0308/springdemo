package springinaction.braveknight.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springinaction.braveknight.beans.Knight;
import springinaction.braveknight.beans.Quest;
import springinaction.braveknight.beans.SlayDragonQuest;

/**
 * Auto Scan
 */
@Configuration
@ComponentScan("springinaction.braveknight.anno")
public class KnightConfig2 {

    //@Bean
    public Knight getKnight() {
        return new BraveKnight(quest());
    }

    //@Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
