package validadornumeros;



public interface Validador {
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}