package springinaction.braveknight.aspect;

import org.aspectj.lang.annotation.*;

/**
 * Created by zzhang on 2017/7/13.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* *.perform(..))")
    public void perform() {
    }

    @Before("perform()")
    public void CheerUp() {
        System.out.println("Com'on Band!");
    }

    @AfterReturning("perform()")
    public void Applause() {
        System.out.println("Well done!");
    }

    @AfterThrowing("perform()")
    public void Rescue() {
        System.out.println("Let's go home...");
    }
}
