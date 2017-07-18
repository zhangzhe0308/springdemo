package springinaction.braveknight.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springinaction.braveknight.beans.Knight;
import springinaction.braveknight.beans.Quest;

@Component
public class BraveKnight implements Knight {

    private Quest quest;

    @Autowired
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkonQuest() {
        quest.embark();
    }
}
