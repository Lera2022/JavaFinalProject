public class Notebook {
    Integer ram;
    Integer hardDisk;
    String os;
    String color;
    Double weight;

    Double diagonal;

    @Override
    public String toString() {
        return String.format("r:%d h:%d o:%s c:%s w;%.1f d:%.1f", ram, hardDisk, os, color, weight, diagonal);
    }

//    public boolean equals(Object obj) {
//        Notebook t = (Notebook) obj;
//        return id == t.id && firstName == t.firstName;
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
}
