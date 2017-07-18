package springinaction.braveknight.beans;

import java.io.PrintStream;

/**
 * Created by zzhang on 2017/7/12.
 */
public class Minstrel {
    private PrintStream stream = System.out;

    public void singBeforeQuest() {
        stream.println("The knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("The knight did embark on a quest!");
    }
}
