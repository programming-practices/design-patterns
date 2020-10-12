package com.trl.creation_type_patterns.singleton;

// ---------------------- Enum com.trl.singleton
// По мнению Joshua Bloch’а это лучший способ реализации шаблона
enum SingletonEnum {
    INSTANCE
}

//---------------------------------------------- Неленивый com.trl.singleton в Java --------------------------------------------

// https://habr.com/post/129494/
public class ExampleSingleton {

}
//  + Простая и прозрачная реализация
//  + Потокобезопасность
//  - Не ленивая инициализация

// ---------------------- Static field
class SingletonSF {
    public static final SingletonSF INSTANCE = new SingletonSF();
}
//  + Остроумно
//  + Сериализация из коробки
//  + Потокобезопасность из коробки
//  + Возможность использования EnumSet, EnumMap и т.д.
//  + Поддержка switch
//  - Не ленивая инициализация

//---------------------------------------------- Ленивый com.trl.singleton в Java ----------------------------------------------

// ---------------------- Synchronized Accessor
class SingletonSA {
    private static SingletonSA instance;

    public static synchronized SingletonSA getInstance() {
        if (instance == null) {
            instance = new SingletonSA();
        }
        return instance;
    }
}
//  + Ленивая инициализация
//  - Низкая производительность (критическая секция) в наиболее типичном доступе


// ---------------------- Double Checked Locking & volatile
class SingletonDCLV {
    private static volatile SingletonDCLV instance;

    public static SingletonDCLV getInstance() {
        SingletonDCLV localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonDCLV.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonDCLV();
                }
            }
        }
        return localInstance;
    }
}
//  + Ленивая инициализация
//  + Высокая производительность
//  - Поддерживается только с JDK 1.5 [5]
/*
Почему не работает без volatile?

Проблема идиомы Double Checked Lock заключается в модели памяти Java, точнее в порядке создания объектов. Можно условно
представить этот порядок следующими этапами [2, 3]:

Пусть мы создаем нового студента: Student s = new Student(), тогда
    1) local_ptr = malloc(sizeof(Student)) // выделение памяти под сам объект;
    2) s = local_ptr // инициализация указателя;
    3) Student::ctor(s); // конструирование объекта (инициализация полей);

Таким образом, между вторым и третьим этапом возможна ситуация, при которой другой поток может получить и начать
использовать (на основании условия, что указатель не нулевой) не полностью сконструированный объект. На самом деле,
эта проблема была частично решена в JDK 1.5 [5], однако авторы JSR-133 [5] рекомендуют использовать voloatile для
Double Cheсked Lock. Более того, их отношение к подобным вещам легко прослеживается из коментария к спецификации:

    There exist a number of common but dubious coding idioms, such as the double-checked locking idiom, that are proposed
    to allow threads to communicate without synchronization. Almost all such idioms are invalid under the existing
    semantics, and are expected to remain invalid under the proposed semantics.

Таким образом, хотя проблема и решена, использовать Double Checked Lock без volatile крайне опасно. В некоторых случаях,
зависящих от реализации JVM, операционной среды, планировщика и т.д., такой подход может не работать. Однако, серией
опытов сопровождаемых просмотром ассемблерного кода, генерированного JIT’ом автору, такой случай вопросизвести не удалось.

Наконец, Double Checked Lock можно использовать без исключений с immutable объектами (String, Integer, Float, и т.д.).
*/

// --------------------- On Demand HolderValuesInt idiom
class SingletonDHI {

    public static SingletonDHI getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public static class SingletonHolder {
        public static final SingletonDHI HOLDER_INSTANCE = new SingletonDHI();
    }
}
//  + Ленивая инициализация
//  + Высокая производительность
//  - Невозможно использовать для не статических полей класса


/*

Можно выделить следующие короткие советы по использованию того или иного подхода для реализации шаблона “Одиночка” :
    1) Использовать нормальную (не ленивую) инициализацию везде где это возможно;
    2) Для статических полей использовать On Demand HolderValuesInt idom;
    3) Для простых полей использовать Double Chedked Lock & volatile idom;
    4) Во всех остальных случаях использовать Syncronized accessor;

*/