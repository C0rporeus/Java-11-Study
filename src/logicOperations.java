public class logicOperations {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // operadores de asignacion
        System.out.println("a es igual a b -> " + (a == b));
        System.out.println("a es diferente de b ->"+(a != b));
        // operadores relacionales
        System.out.println("a es mayor que b ->" + (a > b));
        System.out.println("a es menor que b -> " + (a < b));
        System.out.println("a es mayor o igual que b ->" + (a >= b));
        System.out.println("a es menor o igual que b -> " + (a <= b));

        if (a == b){
            System.out.println("a es igual a b");
        } else if ((a != b) && (a > b)) {
            System.out.println("a es diferente a b");
        } else if (a > b){
            System.out.println("a es mayor a b");
        } else if (a < b) {
            System.out.println("a es menor a b");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b");
        } else if (a <= b) {
            System.out.println("a es menor o igual a b");
        }
    }
}
