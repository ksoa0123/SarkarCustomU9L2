public class Person extends Lifeform{
    public boolean speakEnglish;

    public Person(String name, int age){
        super(name, age);
        speakEnglish = false;
    }

    public void learn(){
        speakEnglish = true;
    }

}
