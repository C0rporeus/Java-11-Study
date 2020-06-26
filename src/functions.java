public class functions {
    /** las funciones viven al nivel de la clase (documentar a javadoc)*/
    public static void main(String[] args) {
        double y = 3;
        // pi * r 2
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(circleArea(y));
        // area
        System.out.println(sphereArea(y));
        // volumen
        System.out.println(sphereVolume(y));

        System.out.println("Pesos a USD: " + converterToDolar(3500, "COP"));
    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripcion: funcion orientada a convertir monedas en Java
     * @param quantity Cantidad de dinero
     * @param currency tipo de moneda: solo acepta MXN o COP
     * @return quantity devuelve cantidad actualizada en dolares
     * */
    public static double converterToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
