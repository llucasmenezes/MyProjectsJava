package marvel.personagens;

public class HomemDeferro extends Personagens {

    public void AtivarArmadura() {
        System.out.println("oi, eu sou o " + getName() + " e ativei minha armadura!");
    }

    @Override
    public void Ataque1() {
        System.out.println("eu vou te jogar um missel");
    }
}
