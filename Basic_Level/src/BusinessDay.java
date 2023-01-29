public class BusinessDay {
    /*
     * Create an aplication that request a day of the week and that say if the day
     * is bussines day or not. Use switch
     */
    public static void main(String[] args) {
        String day = "Domingo";
        switch (day) {
            case "Lunes":
                System.out.println("Es un día laboral");
                break;
            case "Martes":
                System.out.println("Es un día laboral");
                break;
            case "Miercoles":
                System.out.println("Es un día laboral");
                break;
            case "Jueves":
                System.out.println("Es un día laboral");
                break;
            case "Viernes":
                System.out.println("Es un día laboral");
                break;
            case "Sabado":
                System.out.println("NO es un día laboral");
                break;
            case "Domingo":
                System.out.println("NO es un día laboral");
                break;
        }
    }
}
