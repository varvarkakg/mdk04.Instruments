public class Caisse  implements Instruments{
    private String size = "20x30";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public  void play () {
        System.out.println("Играет барабан размера " + size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caisse )) return false;

        Caisse caisse = (Caisse) o;

        return size !=null ? size.equals(caisse.size) : caisse.size == null;
    }

    @Override
    public int hashCode() {
        return size != null ? size.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Caisse{" +
                "size='" + size + '\'' +
                '}';
    }
}
