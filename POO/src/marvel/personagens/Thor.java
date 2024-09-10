package marvel.personagens;

public class Thor extends Personagens {
    public void AtivarModoDeus() {
        System.out.println("oi, eu sou o " + getName() + " e ativei o modo DEUS");
    }

    //polimorfismo
    @Override
    public void Ataque1() {
        System.out.println("eu vou te tacar o martelo");
    }
}
