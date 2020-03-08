public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // bono 200
        salary = salary + 200;
        System.out.println(salary);

        // abonos pensionales
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extras
        // cupon de comidas

        salary = salary + ( 30*2) -45;
        System.out.println(salary);

        // actualizar cadenas de texto
        String empployeeName = "Yonathan";
        empployeeName = empployeeName + " Gutierrez";
        System.out.println(empployeeName);

        empployeeName = "Dr. " + empployeeName;
        System.out.println(empployeeName);


    }
}
