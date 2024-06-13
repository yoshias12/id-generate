import java.util.*;

public class Test {

    public static void main(String[] args) {


        Date year = new Date();// date

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
//        type
        Type type = Type.MOTORCYLE;
        System.out.println("masukkan tipe kendaraan : ");
        switch(input){
            case 1:
                 type = Type.values()[0];
                break;
            case 2:
                 type = Type.values()[1];
                break;
            default:
                break;
        }

        String a = IdGenerate.generatedIdCounter(year,type);
        String b = IdGenerate.generatedIdCounter(year,type);
        String c = IdGenerate.generatedIdCounter(year,type);
        String d = IdGenerate.generatedIdCounter(year,type);
        System.out.println(b);
        System.out.println(c);
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        System.out.println(list);
        list.remove(1);
        String e = IdGenerate.generatedIdCounter(year,type);
        list.add(e);

//        loop iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String id = iterator.next(); // increment
            System.out.println(id);
        }
    }
}
