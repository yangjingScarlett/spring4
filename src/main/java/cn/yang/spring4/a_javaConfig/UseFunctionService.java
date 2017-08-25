package cn.yang.spring4.a_javaConfig;

/**
 * @author Yangjing
 */
public class UseFunctionService {
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void show(String word) {
        functionService.show(word);
    }
}
