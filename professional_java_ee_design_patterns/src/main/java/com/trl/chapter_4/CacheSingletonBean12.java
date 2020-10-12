package com.trl.chapter_4;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.HashMap;
import java.util.Map;

@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
public class CacheSingletonBean12 {

    @EJB
    MyLoggingBean loggingBean;
    private Map<Integer, String> myCache;

    @PostConstruct
    public void start() {
        loggingBean.logInfo("Started!");
        myCache = new HashMap<Integer, String>();
    }

    @Lock(LockType.WRITE)
    public void addUser(Integer id, String name) {
        myCache.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName(Integer id) {
        return myCache.get(id);
    }
}
