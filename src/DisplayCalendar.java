import java.util.Scanner;

public class DisplayCalendar
{
    public static void main(String[] args) {

        SingleSinterklaas sinterklaas = SingleSinterklaas.getInstance();
        sinterklaas.setName("Sinterklaas");

        System.out.println( "Sinterklaas name is: " + SingleSinterklaas.getInstance().getName());

    }
}