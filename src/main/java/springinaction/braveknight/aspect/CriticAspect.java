package springinaction.braveknight.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zzhang on 2017/7/13.
 */
@Aspect
public class CriticAspect {

    public void setCriticism(Criticism criticism) {
        this.criticism = criticism;
    }

    private Criticism criticism;

    public CriticAspect() {
    }

    @Pointcut("execution(* *.perform(..))")
    public void perform() {
    }


    @AfterReturning("perfrom()")
    public void criticize() {
        System.out.println(criticism.getCriticism());
    }
}
