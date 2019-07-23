package com.codetip.booksystem.controller;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testJava {

    public static void main(String[] args) {


        System.out.println();

        //生成日期对象
        Date current_date = new Date();
        //设置日期格式化样式为：yyyy-MM-dd
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化当前日期
        String time = SimpleDateFormat.format(current_date.getTime());
        //输出测试一下
        System.out.println("当前的系统日期为：" + time);
        System.out.println(SimpleDateFormat);

//        Test test = new Test();
//        test.dateo();

    }



}
class Test{
//    private Timestamp timestamp;
//    public Timestamp dateo() {
//        System.out.println(timestamp);
//        return timestamp.getTime();
//    }
}