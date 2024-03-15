public class SuperHero extends Persona {

    String heroName;
    String powers[];

    Persona persona;

    public SuperHero(String heroName, Persona persona) {
        this.heroName = heroName;
        this.persona = persona;
    }
}
