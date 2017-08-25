package cn.yang.spring4.c_springScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 * @explain 用@Scope("prototype")声明Scope是prototype：每次调用都创建一个新的实例
 */
@Service
@Scope("prototype")
class PrototypeService {
}
