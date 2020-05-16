public class Doctor {
    int id;
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
    }
}