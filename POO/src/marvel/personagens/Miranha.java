package marvel.personagens;

public class Miranha extends Personagens {

    public void MiranhaAtivado() {
        System.out.println("Oi, eu sou o " + getName() + " eu vou te tacar teia!!!" );
    }

    //polimorfismo
    @Override
    public void Ataque1() {
        System.out.println("eu vou te tacar teia");
    }
}
