import java.util.Arrays;
import java.util.Scanner;
public class Perrera2{
    //Atributos
    private Familia[] miFam;
    private Perro4[] myDog;
    private String[] Razapeligrosa = {"Pit bull terrier", "American Staffordshire terrier", "Tosa Inu", "Dogo Argentino", "Dogo Guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", 
    "Mastín napolitano", "Presa Mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"};

    //Constructor
    public Perrera2(){
        Familia[] miFam = new Familia[3];
        this.miFam = miFam;
        Perro4[] myDog = new Perro4[1];
        this.myDog = myDog;
    }

    
    /** 
     * @return String
     */
    //Métodos
    public String AsignarPerro(){
        //Att
        Familia fam1 = new Familia();
        Familia fam2 = new Familia();
        Familia fam3 = new Familia();
        Perro4 dog = new Perro4();
        miFam[0] = fam1;
        miFam[1] = fam2;
        miFam[2] = fam3;
        myDog[0] = dog;

        //Familia 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la información de la familia 1: ");
        System.out.println("Ingrese el apellido de la familia: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese el número de miembros: ");
        int miembros = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de niños pequeños: ");
        int NiñosPequeños = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de niños grandes: ");
        int NiñosGrandes = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de mascotas: ");
        int Mascotas = teclado.nextInt();
        teclado.nextLine();

        //Familia 2
        System.out.println("Ingresa la información de la familia 2: ");
        System.out.println("Ingrese el apellido de la familia: ");
        String apellido2 = teclado.nextLine();
        System.out.println("Ingrese el número de miembros: ");
        int miembros2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de niños pequeños: ");
        int NiñosPequeños2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de niños grandes: ");
        int NiñosGrandes2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de mascotas: ");
        int Mascotas2 = teclado.nextInt();
        teclado.nextLine();

        //Familia 3
        System.out.println("Ingresa la información de la familia 3: ");
        System.out.println("Ingrese el apellido de la familia: ");
        String apellido3 = teclado.nextLine();
        System.out.println("Ingrese el número de miembros: ");
        int miembros3 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de niños pequeños: ");
        int NiñosPequeños3 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de niños grandes: ");
        int NiñosGrandes3 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de mascotas: ");
        int Mascotas3 = teclado.nextInt();
        teclado.nextLine();

        //Perro
        System.out.println("Ingresa la información del perro: ");
        System.out.println("Ingrese el nombre del perro: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa la edad del perro: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el tamaño del perro: ");
        String tamaño = teclado.nextLine();
        System.out.println("Ingresa la salud del perro: ");
        int salud = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el color del perro: ");
        String color = teclado.nextLine();
        System.out.println("Ingresa la raza del perro: ");
        String raza = teclado.nextLine();

        //Guardar datos
        miFam[0] = new Familia(apellido, miembros, NiñosPequeños, NiñosGrandes, Mascotas);
        miFam[1] = new Familia(apellido2, miembros2, NiñosPequeños2, NiñosGrandes2, Mascotas2);
        miFam[2] = new Familia(apellido3, miembros3, NiñosPequeños3, NiñosGrandes3, Mascotas3);
        myDog[0] = new Perro4(nombre, edad, tamaño, salud, color, raza);

        //Condicionales 
        if(miFam[0].getNiñosPequeños() < 1 && miFam[0].getNiñosGrandes() < 1 && miFam[0].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[0].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        if(miFam[0].getNiñosPequeños() < 1 && miFam[0].getNiñosGrandes() > 0 && !myDog[0].getTamaño().equals("grande") && !Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza()) && miFam[0].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[0].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        if(miFam[0].getNiñosPequeños() > 0 && !myDog[0].getTamaño().equals("mediano") && !myDog[0].getTamaño().equals("grande") && !Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza()) && miFam[0].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[0].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[1].getNiñosPequeños() < 1 && miFam[1].getNiñosGrandes() < 1 && miFam[1].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[1].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[1].getNiñosPequeños() < 1 && miFam[1].getNiñosGrandes() > 0 && !myDog[0].getTamaño().equals("grande") && !Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza()) && miFam[1].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[1].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[1].getNiñosPequeños() > 0 && !myDog[0].getTamaño().equals("mediano") && !myDog[0].getTamaño().equals("grande") && !Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza()) && miFam[1].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[1].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[2].getNiñosPequeños() < 1 && miFam[2].getNiñosGrandes() < 1 && miFam[2].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[2].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[2].getNiñosPequeños() < 1 && miFam[2].getNiñosGrandes() > 0 && !myDog[0].getTamaño().equals("grande") && !Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza()) && miFam[2].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[2].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[2].getNiñosPequeños() > 0 && !myDog[0].getTamaño().equals("mediano") && !myDog[0].getTamaño().equals("grande") && !Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza()) && miFam[2].getMascotas() < 4){
            System.out.println("¡Felicidades Familia "+miFam[2].getApellido()+", pueden adoptar a "+myDog[0].getNombre()+" :D");
        }
        else if(miFam[0].getNiñosPequeños() > 0 && miFam[1].getNiñosPequeños() > 0 && miFam[2].getNiñosPequeños() > 0 && Arrays.asList(Razapeligrosa).contains(myDog[0].getRaza())){
            System.out.println("lamentablemente "+myDog[0].getNombre()+" tendrá que volver a la perrera :(");
        }

        //Return
        return "";
        
    } 
}



