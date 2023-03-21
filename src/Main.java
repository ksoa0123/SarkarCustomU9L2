public class Main {
    public static void main(String[] args){
        //Runner code

        Lifeform thing = new Lifeform("creature", 90232);
        System.out.println(thing.name);
        System.out.println(thing.age);
        thing.die();

        Person myPerson = new Person("tom", 21);
        System.out.println(myPerson.name);
        System.out.println(myPerson.age);
        myPerson.learn();
        System.out.println(myPerson.speakEnglish);
        myPerson.die();

        Alien myAlien = new Alien("Lifeform123424", 23245324);
        System.out.println(myAlien.name);
        System.out.println(myAlien.age);
        myAlien.train();
        System.out.println(myAlien.canAbduct);
        myAlien.die();

    }
}
