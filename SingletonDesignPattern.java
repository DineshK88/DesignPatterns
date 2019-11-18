package com.designpatterns.creational;

/**
 * Singleton design pattern is a creational design pattern which is used to create a singleton instance in the JVM.
 * It is used to create a factory class such as connection factory, logger where only single instance of class is required.
 * The singleton class must provide a global access point to get the instance of the class.
 * Singleton pattern is used for logging, drivers objects, caching and thread pool.
 * Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
 */
public class SingletonDesignPattern {

    //Create private constructor so that no once can instantiate the class object.
    private SingletonDesignPattern() {}

}

/**
 * Eager initialized singleton object
 */
class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

/**
 * Instance is created in static block, provides option for exception handling.
 */
class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception exception) {
            throw new RuntimeException("Exception");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 */
class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if (instance == null) {
             instance = new LazyInitialization();
        }
        return instance;
    }
}

/**
 * The easier way to create a thread-safe singleton class is to make the global access method synchronized.
 */
class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

/**
 * Double checked locking singleton object
 */
class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static synchronized DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                instance = new DoubleCheckSingleton();
            }
        }
        return instance;
    }
}
