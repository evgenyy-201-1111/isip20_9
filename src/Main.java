public class Main {
    // типы данных: примитивные и ссылочные
    // примитивные: int, char, double
    // ссылочные: объекты
    public static void main(String[] args) {
//        int a = 5;
//        chageValue(a);
//        Person p1 = new Person("Ivan"); // ссылка на объект null
//        chageName(p1);
//        System.out.println(p1.name);
//    }
//
//    public static void chageName(Person p1) {
//        p1.name = "Petr";
//        int a = -1;
//        int c = 12;
//        if (a == c) {
//            System.out.println("a и b равны");
//        } else System.out.println("a и b не равны");
        Person p1 = new Person("Ivan");
        Person p2 = new Person("Petr");
        if (p1.equals(p2)){
            System.out.println("p1 и p2 равны");
        }else System.out.println("p1 и p2 не равны");
    }
}
