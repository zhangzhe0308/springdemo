package springinaction.braveknight.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by zzhang on 2017/7/13.
 */
@Component
public class Band {

    public void perform() {
        System.out.println("Band is playing...");
    }
}
