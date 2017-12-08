package springHighSubject.a_aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Yangjing
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {//实现接口，以获得Bean名称和资源加载的服务
    private String beanName;
    private ResourceLoader loader;

    //实现BeanNameAware接口需要重写的方法
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    //实现ResourceLoaderAware接口需要重写的方法
    public void setResourceLoader(ResourceLoader loader) {
        this.loader = loader;
    }

    public void outputResult() {
        System.out.println("Bean的名称是：" + beanName);
        Resource resource = loader.getResource("classpath:h_aopTest.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容是：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
