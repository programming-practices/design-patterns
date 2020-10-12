package com.trl.chapter_4;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
@AccessTimeout(value = 120000)
// default in milliseconds
public class CacheSingletonBean13 {

    @EJB
    MyLoggingBean loggingBean;
    private Map<Integer, String> myCache;

    @PostConstruct
    public void start() {
        loggingBean.logInfo("Started!");
        myCache = new HashMap<Integer, String>();
    }

    @AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void addUser(Integer id, String name) {
        myCache.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName(Integer id) {
        return myCache.get(id);
    }
}
