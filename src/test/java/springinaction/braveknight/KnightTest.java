package springinaction.braveknight;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springinaction.braveknight.beans.BraveKnight;
import springinaction.braveknight.beans.Knight;
import springinaction.braveknight.beans.Quest;

import static org.mockito.Mockito.*;

/**
 * Created by zzhang on 2017/7/12.
 */
public class KnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkonQuest();
        verify(mockQuest, times(1)).embark();
    }

    @Test
    public void knightShouldSlayDragonByXML() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkonQuest();
        context.close();
    }
}
