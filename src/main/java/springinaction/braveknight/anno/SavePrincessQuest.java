package springinaction.braveknight.anno;

import org.springframework.stereotype.Component;
import springinaction.braveknight.beans.Quest;

/**
 * Created by zzhang on 2017/7/12.
 */
@Component
public class SavePrincessQuest implements Quest {

    private String princessname;

    public SavePrincessQuest(String name) {
        this.princessname = name;
    }

    public SavePrincessQuest() {
        this.princessname = "Christina";
    }

    public void embark() {
        System.out.println("Embarking on Quest to Save the Princess " + princessname + "...");
    }
}
