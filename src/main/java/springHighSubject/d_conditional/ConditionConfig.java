package springHighSubject.d_conditional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yangjing
 */
@Configuration
@ComponentScan("springHighSubject/d_conditional")
public class ConditionConfig {
    @Conditional(WindowsCondition.class)
    public ListService listService() {
        return new WindowsListService();
    }
}
