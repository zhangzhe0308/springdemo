package springinaction.braveknight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springinaction.braveknight.beans.Knight;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zzhang on 2017/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("SavePrincess")
public class ProfileTest {

    @Test
    public void knightShouldSavePrincess() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knightprofile.xml");
        Knight knight = context.getBean(Knight.class);
        assertNotNull(knight);
    }
}
