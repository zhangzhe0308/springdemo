package springinaction.braveknight.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by zzhang on 2017/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config1.class)
public class PrototypeTest {

    @Autowired
    Prototype1 prototype1;

    @Test
    public void Test1() {
        assertEquals(prototype1.getNumber(), 1);
    }
}
