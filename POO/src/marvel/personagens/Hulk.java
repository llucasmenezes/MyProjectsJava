package marvel.personagens;

public class Hulk extends Personagens {

    public void ForcaBrutal() {
        System.out.println("oi, eu sou o " + getName() + " e eu ativei o modo HULK");
    }


    @Override
    public void Ataque1() {
        System.out.println("eu vou te dar um SOCO BRUTAL");
    }


}
