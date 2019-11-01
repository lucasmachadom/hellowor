public class fatorial {

    public static void fatorar(int numero) {
        int fator = 1;
        for (int i = numero; i > 1; i--) {
            fator *= i;
        }
        System.out.println(numero + "! = " + fator);
    }
    
    public static void main(String args[]) {
        for (int x=1; x<=20; x++)
            fatorar (x);
    }
}