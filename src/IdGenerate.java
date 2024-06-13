import java.text.SimpleDateFormat;
import java.util.Date;

public  class IdGenerate {
    private static Integer idCounter = 1;
    public static String generatedIdCounter(Date date, Type type){

        /*
        * Mengambil tahun dari type date dan memasukkan kedalam id
        * */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String year = sdf.format(date);

        String t ="";
        if(type.equals(Type.CAR)){
           t = "C";
        } else if(type.equals(Type.MOTORCYLE)){
            t = "M";
        }
        return year+"-"+t+"-"+String.format("%04d", idCounter++);
    }
}
