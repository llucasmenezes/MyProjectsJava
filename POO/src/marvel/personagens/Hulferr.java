package marvel.personagens;

public class Hulferr extends Personagens implements HulkdFerro {

    public void ativarModoVerdao() {
        System.out.println("Eu sou o " + getName() + " e ativei o modo VERDAO!");
    }
    public void ativarArmaduraSuprema() {
        System.out.println("Eu sou o " + getName() + " e ativei a armadura suprema!");
    }

    //polimorfismo
    @Override
    public void Ataque1() {
        System.out.println("eu vou te tacar missel supremo");
    }
}
