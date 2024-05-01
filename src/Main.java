import java.util.Scanner;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("   ****    Bienvenidos a la Inmersión Java!    ****   ");
        //System.out.println("Película: Matrix");

        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoPlanBasico = true;
        String nombrePelicula = "Matrix";
        String sinopsis = """
                La mejor película del milenio 
                """;
        double mediaEvaluacionUsuario = 0.0;

        System.out.println("-------------------------------------------------------");
        System.out.println("|                 Screen Match                        |");
        System.out.println("-------------------------------------------------------");
        System.out.println("Nombre de la película: "+ nombrePelicula);
        System.out.println("Fecha de estreno: "+ fechaDeLanzamiento);
        System.out.println("Sinopsis: "+ sinopsis);
        System.out.println("Estrellas: "+ evaluacion);
        System.out.println("Incluido en el Plan Básico: "+ incluidoPlanBasico);

        double mediaEvaluaciones = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de Matrix: "+ mediaEvaluaciones);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("----- Opiniones: Película retro que vale la pena ver");
        }

        System.out.println("======= Evaluación por parte de usuarios:  ========");
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Usuario N° "+(i+1)+ ": Ingresa la nota que le darías a la película: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;

        }

        System.out.println("La media de la película " + nombrePelicula + " calculada por los usuarios es de: "+ mediaEvaluacionUsuario / 3);


    }
}