package springinaction.braveknight.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zzhang on 2017/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectConfig.class)
public class Test1 {

    @Autowired
    public Band band;

    @Test
    public void test1() {
        band.perform();
    }
}
