package cn.yang.spring4.h_aopTest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangjing on 2017/12/6
 */
@Slf4j
@Component
@Aspect
public class Poet {

    private Map<Integer, Integer> embarkCounts = new HashMap<Integer, Integer>();

    @Pointcut("@annotation(cn.yang.spring4.h_aopTest.Poem)")
    public void annotationPointCut() {

    }

    @Pointcut("execution(* cn.yang.spring4.h_aopTest.impl.BraveKnight.embark(int)) && args(count)")
    public void methodPointCut(int count) {
    }

//    @Before("annotationPointCut()")
//    public void singBeforeEmbark() {
//        System.out.println("La la la, He is a brave knight!");
//    }
//
//    @After("annotationPointCut()")
//    public void singAfterEmbark() {
//        System.out.println("Fa fa fa, the brave knight embark on quest!");
//    }

    @Around(value = "annotationPointCut()")
    public String singAroundEmbark(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("La la la, He is a brave knight!");
        String str = (String) joinPoint.proceed();
        System.out.println("Fa fa fa, the brave knight embark on quest!");
        return str;
    }

    @Before(value = "methodPointCut(count)", argNames = "count")
    public void countEmbark(int count) {
        int currentCount = getEmbarkCount(count);
        embarkCounts.put(count, currentCount + 1);
        log.info("骑士执行执行了{}次任务{}", embarkCounts.get(count),count);
    }

    public int getEmbarkCount(int count) {
        return embarkCounts.containsKey(count) ? embarkCounts.get(count) : 0;
    }
}
