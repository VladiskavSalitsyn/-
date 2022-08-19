public class Main {
    // TODO: Методы по умолчанию. Эволюция интерфейсов и создание черт

    //Методы по умолчанию в интерфейсах
    @FunctioanInterface
    interface Utilites {
        default Consumer<Runnable> m() {
            return (r) -> r.run();
        }

        //стандартные методы, все еще функциональные
        Object function(Object o);
    }

    class A implements Utilities {   //реализует
        public Object function(Object o) {
            return new Object();
        }

        {
// вызвать метод по умолчанию
            Consumer<Runnable> n = new A().m();
        }
    }
    /*Черты: 1 метод по умолчанию на интерфейс.
    Не улучшайте функциональные интерфейсы.
    Только консервативные реализации
     */
}
