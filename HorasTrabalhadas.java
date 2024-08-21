import java.util.Scanner;


public class HorasTrabalhadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quinzenal = 15;
        int mensal = 30;
        String QoM, continua;
        double salarioB, horasT;
        double resultado = 0;

        System.out.println("=============CALCULADORA PRA BURRO=============");
        System.out.println("Ola, digite seu nome LOGO");
        String name = scanner.nextLine();

        System.out.println("                                ");

        do {
            do {
                System.out.println("deseja saber o quanto recebe por hora, mensal ou quinzenal?");
                QoM = scanner.nextLine().toLowerCase();
                 if (!QoM.equals("quinzenal") && !QoM.equals("mensal")) {
                     System.out.println("opcao invalida meu chapa, digite 'quinzenal ou mensal' e deixe de gracinha seu seu oiaa..");
                 }
                 else {
                     System.out.println("Ok, vou calcular em cima do " + QoM);
                 }

            } while (!QoM.equals("quinzenal") && !QoM.equals("mensal"));

                 System.out.println("                                ");
                 System.out.println("digite seu salario base");
                 salarioB = Double.parseDouble(scanner.nextLine());
                 System.out.println("Trabalha quantas horas por dia?");
                 horasT = Double.parseDouble(scanner.nextLine());


                if (QoM.equals("quinzenal")) {
                    resultado = (salarioB / quinzenal) / horasT;
                }
                else if (QoM.equals("mensal")) {
                    resultado = (salarioB / mensal) / horasT;
                }


                 System.out.println("um momento, calculando");
                 System.out.println("            ");

                 System.out.println("Sua hora trabalhada é: R$ " + resultado);

                 if (resultado<10) {
                     System.out.println("Tinha que ser clt kkkkkk");
                 }
                 else if (resultado>10) {
                     System.out.println("me contrata na tua empreesa ai bixo kk");
                 }
            do {
                System.out.println("                                ");
                System.out.println("Deseja calcular novamente? 'sim ou nao'");
                continua = scanner.nextLine();

                if (!continua.equals("sim") && !continua.equals("nao")) {
                    System.out.println("opcao invalida meu chapa, escolha 'sim ou nao' e rapido que meu sistema ta com a bateria acabando");
                }

            } while (!continua.equals("sim") && !continua.equals("nao"));
        }while (continua.equals("sim"));

        System.out.println("ate logo meu chapa");

    }
}
