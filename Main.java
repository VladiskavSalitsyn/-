public class Main { // не обращаем внимание что тут класс, поставил для удобства печати :-)
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

// TODO: Лямбды. Синтаксис: 1.(параметры) -> выражение 2.(параметры) -> {утверждения;}

    // принимает Long, возвращает String
    Function<Long, String> f = (1) ->1.toString();
// ничего не берет - дает нити
        Consumer<String> c=System.out: :println;
// использовать их с потоками
        new ArrayList<Srting>().stream().
// peek: отладка потоков без изменени
        Peek(e->System.out.println(e)).
// map: преобразовать все элементы во что-то
        map(e->e.hashCode()).
// filter: передаем некоторые элементы
        Filter(hc->(hc%2)==0).
// собираем все значения из потока
        collect(Collectors.toCollection(TreeSet: :new))

        /* Выражение над утверждениями.
        Рефакторинг для использования ссылок на методы.
        Цепочка ламбд вместо растущего терма
         */