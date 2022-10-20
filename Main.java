import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) throws ParseException {

        String dataUm = "29/12/2003";
        String dataDois = "20/10/2022";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // dd/MM/yyyy é o formato brasileiro que você está usando, para mais formatos, veja o link de referência

        Date dateUm = simpleDateFormat.parse(dataUm);
        Date dateDois = simpleDateFormat.parse(dataDois);

        long diferencaEmMilisegundos = dateDois.getTime() - dateUm.getTime();

        /**
         * divide por 1000 para converter em segundos
         * divide por 60 para converter em minutos 
         * divide por 60 novamente para converter em horas
         * divide por 24 para converter em dias
         */
        System.out.println(diferencaEmMilisegundos / 1000 / 60 / 60 / 24);





    }

}