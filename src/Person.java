public class Person {
    String name;

    public  Person(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;
        return p.name == this.name;
    }
}
