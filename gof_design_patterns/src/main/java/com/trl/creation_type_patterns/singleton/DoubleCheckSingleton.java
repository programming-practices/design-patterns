package com.trl.creation_type_patterns.singleton;

public class DoubleCheckSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }

    static class Singleton {
        private volatile static Singleton singleton;

        private Singleton() {
        }

        public static Singleton getInstance() {
            if (singleton == null) {
                synchronized (Singleton.class) {
                    if (singleton == null) {
                        singleton = new Singleton();
                    }
                }
            }
            return singleton;
        }

        public Singleton getField() {
            Singleton result = singleton;
            if (result == null)
                singleton = result = new Singleton();
            return result;
        }
    }
}
