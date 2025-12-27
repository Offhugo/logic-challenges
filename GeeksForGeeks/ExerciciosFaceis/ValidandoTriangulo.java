package ExerciciosDeLogica.ExerciciosBase.GeeksForGeeks.ExerciciosFaceis;

public class ValidandoTriangulo {
    public static boolean validandoTriangulo(int ladoA, int ladoB, int ladoC) {
        if (
                ladoA + ladoB > ladoC &&
                ladoB + ladoC > ladoA &&
                ladoC + ladoA > ladoB
        ) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int ladoA = 1;
        int ladoB = 10;
        int ladoC = 12;

        System.out.println("Válidade: " + validandoTriangulo(ladoA, ladoB, ladoC));
    }
}
