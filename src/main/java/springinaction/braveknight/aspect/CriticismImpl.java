package springinaction.braveknight.aspect;

/**
 * Created by zzhang on 2017/7/13.
 */
public class CriticismImpl implements Criticism {

    private String[] criticismPool;

    public String[] getCriticismPool() {
        return criticismPool;
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    public String getCriticism() {
        int i = (int) Math.random() * criticismPool.length;
        return this.criticismPool[i];
    }
}
