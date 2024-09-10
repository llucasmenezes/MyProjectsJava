package marvel.personagens;

public abstract class Personagens {

    private String name;
    private String poder;
    private int idade;

    //getter e setters (encapsulamento)

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }

    //getter e setters (encapsulamento)
    public String getPoder() {
        return poder;
    } public void setPoder(String poder) {
        this.poder = poder;
    }

    //getter e setters (encapsulamento)
    public int getIdade() {
        return idade;
    } public void setIdade(int idade) {
        this.idade = idade;
    }

    //metodo base
    public void Ataque1() {
        System.out.println("eu vou te dar um soco");
    }

}
