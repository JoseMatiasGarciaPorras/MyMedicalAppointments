public class Doctor {
    static int id = 0;
    String name;
    String speciality;
    /**
     * @author José Matías García Porras
     * Método para mostrar el nombre del doctor
     * */
    public void showName(){
        System.out.println(name);
    }

    public Doctor(){
        System.out.println("Construyendo nuestro doctor");
    }

    public Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }
    /**
     * @author José Matías García Porras
     * Método que imprime por pantalla el id del doctor
     * */
    public void showId(){
        System.out.println("Identificador del doctor: " + id);
    }
}