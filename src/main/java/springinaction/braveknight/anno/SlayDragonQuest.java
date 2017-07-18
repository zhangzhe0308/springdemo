package springinaction.braveknight.anno;

import springinaction.braveknight.beans.Quest;

import java.io.PrintStream;

//@Component
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on Quest to slay the dragon...");
    }
}
