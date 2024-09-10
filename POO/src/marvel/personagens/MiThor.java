package marvel.personagens;

public class MiThor extends Personagens implements MiranhaThor {

    public void AtivarTeia() {
        System.out.println("EU sou o " + getName() + " Joguei teia!");
    }

    public void AtivarModoDeus() {
        System.out.println("Eu sou o " + getName() + "Ativei o Modo Deus!");
    }

    @Override
    public void Ataque1() {
        System.out.println("eu vou te tacar teia raio");
    }

}
