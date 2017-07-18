package springinaction.braveknight.beans;

import java.io.PrintStream;

/**
 * Created by zzhang on 2017/7/12.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on Quest to slay the dragon...");
    }
}
