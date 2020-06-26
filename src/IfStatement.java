public class IfStatement {
    public static void main(String[] args) {
        boolean isEnableBluetooth = false;
        int fileSended = 3;
        if (isEnableBluetooth){
            fileSended++;
            System.out.println("archivo enviado");
        } else {
            System.out.println("encender bluetooth");
        }
    }
}
