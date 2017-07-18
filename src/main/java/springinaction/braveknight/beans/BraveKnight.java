package springinaction.braveknight.beans;

/**
 * Created by zzhang on 2017/7/12.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkonQuest() {
        quest.embark();
    }
}
