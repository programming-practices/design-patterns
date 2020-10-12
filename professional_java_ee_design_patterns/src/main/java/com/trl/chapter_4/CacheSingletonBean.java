package com.trl.chapter_4;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.HashMap;
import java.util.Map;

@Startup
@DependsOn("MyLoggingBean")
@Singleton
public class CacheSingletonBean {

    @EJB
    MyLoggingBean loggingBean;
    private Map<Integer, String> myCache;

    @PostConstruct
    public void start() {
        loggingBean.logInfo("Started!");
        myCache = new HashMap<Integer, String>();
    }

    public void addUser(Integer id, String name) {
        myCache.put(id, name);
    }

    public String getName(Integer id) {
        return myCache.get(id);
    }
}
