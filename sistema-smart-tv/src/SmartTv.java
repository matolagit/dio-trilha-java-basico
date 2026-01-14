import java.util.Scanner;

class SmartTv {
        Scanner scanner = new Scanner(System.in);
        boolean ligada = false;
        int canal = 1;
        int volume = 10;

        public void ligada(){
                ligada = true;
        }
        public void desligada(){
                ligada = false;
        }
        public void aumentarVolume(){
               volume++;
        }
        public void diminuirVolume(){
                volume--;
        }
        public void aumentarCanal(){
                canal++;
        }
        public void diminuirCanal(){
                canal--;
        }
        public void numeroCanal(){
                canal = scanner.nextInt();
        }
}