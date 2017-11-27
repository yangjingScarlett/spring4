package springHighSubject.a_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain 实际项目中不可避免的要使用spring容器本身的功能资源，这是Bean就必须意识到spring容器的存在，即要用到spring aware
 *           BeanNameAware:获得容器中Bean的名称
 *           BeanFactoryAware:获得当前beanFactory,这样可以调用容器的服务
 *           ApplicationContextAware:获得当前ApplicationContext，这样可以调用容器的服务
 *           MessageSourceAware:获得message source，这样可以获得文本信息
 *           ApplicationEventPublisherAware:应用事件发布器，可以用来发布事件
 *           ResourceLoaderAware:获得资源加载器，可以获得外部资源文件
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
