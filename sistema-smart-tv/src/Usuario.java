public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal autal? " + smartTv.canal);
        System.out.println("volume atual? " + smartTv.volume);

        smartTv.ligada();
        System.out.println("Status novo -> TV ligada? " + smartTv.ligada);
        smartTv.desligada();
        System.out.println("Status novo -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Status novo -> Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Status novo -> Volume atual?" + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Status novo -> Canal atual?" + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Status novo -> Canal atual?" + smartTv.canal);

        System.out.println("Digite o número do canal");
        smartTv.numeroCanal();
        System.out.println("Status novo -> Canal atual?" + smartTv.canal);
    }
}
