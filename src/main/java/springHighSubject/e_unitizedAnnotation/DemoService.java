package springHighSubject.e_unitizedAnnotation;

import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 */
@Service
public class DemoService {
    public void outputResult() {
        System.out.println("输出从组合注解创建的bean");
    }
}
