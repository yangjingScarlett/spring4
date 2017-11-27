package cn.spring4.highLight.model;

import java.io.Serializable;

/**
 * @author Yangjing
 */
public class DemoObj implements Serializable {
    private Long serial;
    private String id_string;//这个名字不能为id，否则url路径中作为参数的id不能识别
    private String name;

    public DemoObj() {//Jackson对对象和json做转换时一定需要空构造
    }

    public DemoObj(Long serial, String id_string, String name) {
        this.serial = serial;
        this.id_string = id_string;
        this.name = name;
    }

    public String getId_string() {
        return id_string;
    }

    public void setId_string(String id_string) {
        this.id_string = id_string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "serial=" + serial + ", id_string = " + id_string + ", name = " + name;
    }
}
