package com.trl.creation_type_patterns.singleton;

public class ExampleSingletonMultithreaded {
}

// Eto naibolie xorowui podxod, v etom premere com.trl.singleton leizy i thread save
// zdes nado podumat nad tem chto kalss loaderu mohyt bit raznumi, i kazdui
// kalss loader zahryzit svoi zrazec singletona
// kak zdelat tak chtobu com.trl.singleton bil odin daze esli y nas mnoho class loaderov
class SingletonMultithreadedC {

    private SingletonMultithreadedC() {
    }

    public static SingletonMultithreadedC getInstance() {
        return Holden.INSTANCE;
    }

    private static class Holden {
        private static SingletonMultithreadedC INSTANCE = null;
    }
}

// ne samui lydwui variant
class SingletonMultithreadedA {
    private volatile static SingletonMultithreadedA INSTANCE;

    private SingletonMultithreadedA() {
    }

    public static synchronized SingletonMultithreadedA getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new SingletonMultithreadedA();
        }
        return INSTANCE;
    }
}

// ne samui lydwui variant
class SingletonMultithreadedB {
    private volatile static SingletonMultithreadedB INSTANCE;

    private SingletonMultithreadedB() {
    }

    public static SingletonMultithreadedB getInstance() {

        if (INSTANCE == null) {
            synchronized (SingletonMultithreadedB.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonMultithreadedB();
                }
            }
        }
        return INSTANCE;
    }
}

