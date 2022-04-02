package org.wmc.create.prototype.citation;

public class ProtoTypeCitation {

    /**
     * 奖状创建成功！
     * 张三同学：在2016学年第一学期中表现优秀，被评为三好学生。韶关学院
     * 奖状拷贝成功！
     * 李四同学：在2016学年第一学期中表现优秀，被评为三好学生。韶关学院
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1 = new citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
        obj1.display();
        citation obj2 = (citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
