package marvel.personagens;

public class Main {

    public static void main(String[] args) {

        //objt1
        Miranha Miranha = new Miranha();
        Miranha.setName("Homem Aranha");
        Miranha.setPoder("teia");
        Miranha.setIdade(23);
        Miranha.MiranhaAtivado();

        //objt2
        HomemDeferro HomemDeFerro = new HomemDeferro();
        HomemDeFerro.setName("Homem de Ferro");
        HomemDeFerro.setPoder("tecnologia");
        HomemDeFerro.setIdade(30);

        //objt3
        Hulk Hulk = new Hulk();
        Hulk.setName("Hulk");
        Hulk.setPoder("Forca");
        Hulk.setIdade(27);

        //objt4
        Thor Thor = new Thor();
        Thor.setName("Thor");
        Thor.setPoder("Trovao");
        Thor.setIdade(28);

        //objt5
        MiThor MiThor = new MiThor();
        MiThor.setName("MiThor");
        MiThor.getName();
        MiThor.setIdade(17);
        MiThor.setPoder("Tacar teia e Ativar o  Modo Deus");
        MiThor.AtivarTeia();

        //objt6
        Hulferr Hulferr = new Hulferr();
        Hulferr.setName("Hulferr");
        Hulferr.setIdade(17);
        Hulferr.ativarArmaduraSuprema();




    }
}
