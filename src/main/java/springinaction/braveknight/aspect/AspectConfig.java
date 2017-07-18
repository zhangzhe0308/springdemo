package springinaction.braveknight.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zzhang on 2017/7/13.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AspectConfig {
    @Bean
    public Audience getAudience() {
        return new Audience();
    }
}
