package com.codetip.booksystem.init;


import com.codetip.booksystem.domain.Config;
import com.codetip.booksystem.service.ConfigService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * #初始化加载数据
 *
 * 这里的作用是为了将我们的数据库内容返回一个对象到application.propertis配置中
 * 在这里，我将从数据库中拉取到了网站名称的配置，返回给了配置项
 * @author Administrator
 *
 */
@Component
public class InitSystem implements ServletContextListener, ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // TODO Auto-generated method stub
        this.applicationContext=applicationContext;
    }



    //***********************************这部分为主要的配置项********************************************
    @Autowired
    private ConfigService configService;//我还是更习惯用注解的方式获取bean，当然也可以使用下面的那个
    /**
     *    #加载数据到application缓存中
     */
    public void loadData(ServletContext application){
        //被注释的部分是使用原生的方法获取bean，这里就必须要在service后写上内容service("configService")
        //ConfigService configService=(ConfigService) applicationContext.getBean("configService");
        Config config = configService.findById(1);
        application.setAttribute("config", config);
    }
    //***********************************这部分为主要的配置项********************************************





    @Override
    public void contextInitialized(ServletContextEvent sce) {
        loadData(sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }


}