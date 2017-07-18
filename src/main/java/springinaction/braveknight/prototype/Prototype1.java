package springinaction.braveknight.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zzhang on 2017/7/13.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Prototype1 {

    private static AtomicInteger integer = new AtomicInteger(1);
    private int number;

    public Prototype1(int i) {
        this.number = i;
    }

    public int getNumber() {
        return number;
    }

    @Bean
    public static Prototype1 getInstance() {
        return new Prototype1(integer.getAndAdd(1));
    }
}
