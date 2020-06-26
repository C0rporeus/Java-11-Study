public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccion de colores claros");
                break;
            case "Night":
                System.out.println("Selecciono color nocturno");
                break;
            case "Blue dark":
                System.out.println("seleccionaste azul oscuro");
                break;
            case "Dark":
                System.out.println("Seleccionaste modo oscuro");
                break;
            default:
                System.out.println("selecciona una opcion...");
        }
    }
}
