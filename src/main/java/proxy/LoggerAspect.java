package proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(Loggable)")
    public void loggableMethod() {
    }

    @Before("loggableMethod()")
    public void before(JoinPoint joinPoint) {
        System.out.println("[Proxy] Before method call");
    }

    @After("loggableMethod()")
    public void after(JoinPoint joinPoint) {
        System.out.println("[Proxy] After method call");
    }

    @Around("loggableMethod()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[Proxy] Around method call");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        final StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            return joinPoint.proceed();
        } finally {
            stopWatch.stop();
            System.out.println("[Proxy] Execution time for " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");
        }
    }
}
