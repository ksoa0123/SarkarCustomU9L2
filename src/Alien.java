public class Alien extends Lifeform {
    public boolean canAbduct;

    public Alien(String name, int age){
        super(name, age);
        canAbduct = false;
    }

    public void train(){
        canAbduct = true;
    }

}
