package cn.spring4.highLight.config;

import cn.spring4.highLight.model.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author Yangjing
 * @explain HttpMessageConverter是用来处理request和response的内部数据的
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {//实现自定义的HttpMessageConverter

    public MyMessageConverter() {
        //新建一个自定义的媒体类型application/x-wisely
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));
    }

    //处理由-隔开的数据，并转换成DemoObj的对象
    @Override
    public DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage)
            throws IOException, HttpMessageNotReadableException {
        //这个方法是把输入流（inputMessage.getBody()）的字节转换成String类型
        String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(Long.parseLong(tempArr[0]), tempArr[1], tempArr[2]);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        //isAssignableFrom   是用来判断一个类Class1和另一个类Class2是否相同或是Class2的超类或接口。
        return DemoObj.class.isAssignableFrom(clazz);
    }

    @Override
    public void writeInternal(DemoObj obj, HttpOutputMessage outputMessage) throws IOException {
        String out = "Serial:" + obj.getSerial() + " - Id_string:" + obj.getId_string() + " - Name:" + obj.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}
