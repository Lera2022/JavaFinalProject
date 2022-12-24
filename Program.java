import java.util.*;

public class Program {

    public static void main(String[] args) {

        Notebook n1 = new Notebook();
        n1.ram = 8;
        n1.hardDisk = 256;
        n1.os = "Windows";
        n1.color = "gray";
        n1.weight = 2.0;
        n1.diagonal = 13.6;

        Notebook n2 = new Notebook();
        n2.ram = 4;
        n2.hardDisk = 512;
        n2.os = "Linux";
        n2.color = "black";
        n2.weight = 1.5;
        n2.diagonal = 15.4;

        Notebook n3 = new Notebook();
        n3.ram = 16;
        n3.hardDisk = 1024;
        n3.os = "Windows";
        n3.color = "white";
        n3.weight = 3.5;
        n3.diagonal = 14.1;

        Notebook n4 = new Notebook();
        n4.ram = 32;
        n4.hardDisk = 512;
        n4.os = "Linux";
        n4.color = "black";
        n4.weight = 2.5;
        n4.diagonal = 17.3;

        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);

        Set<Notebook> notebooks = new HashSet<Notebook>(Arrays.asList(n1, n2, n3, n4));

        Map<Integer, String> fieldsNumbers = new TreeMap<>();
        List<String> fields = Arrays.asList("ram", "hardDisk", "os", "color", "weight", "diagonal");
        for (int i = 0; i < fields.size(); i++) {
            fieldsNumbers.put(i, fields.get(i));
        }
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println(fieldsNumbers);
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        System.out.println("Введите необходимый критерий: " + getValues(notebooks, param) );
        scanner = new Scanner(System.in);
        String filter = scanner.nextLine();
        for (Notebook i : notebooks) {
            if (getValue(param, i).equals(filter)){
                System.out.println(i);
            }
        }

    }

    private static Set<String> getValues(Set<Notebook> notebooks, int param) {
        Set<String> values = new TreeSet<>();
        for (Notebook i : notebooks) {
            values.add(getValue(param, i));
        }
        return values;
    }

    private static String getValue(int param, Notebook i) {
        Object value = null;
        switch (param){
            case 0:
                value = i.ram;
                break;
            case 1:
                value = i.hardDisk;
                break;
            case 2:
                value = i.os;
                break;
            case 3:
                value = i.color;
                break;
            case 4:
                value = i.weight;
                break;
            case 5:
                value = i.diagonal;
                break;
        }
        return value.toString();
    }

}
