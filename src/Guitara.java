public class Guitara implements Instruments {
    private int cordNumber = 4;

    public int getCordNumber() {
        return cordNumber;
    }
    public void setCordNumber(int cordNumber){
        this.cordNumber=cordNumber;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + cordNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitara)) return false;

        Guitara gitara = (Guitara) o;

        return cordNumber == gitara.cordNumber;
    }

    @Override
    public int hashCode(){
        return cordNumber;
    }
    @Override
    public String toString (){
        return "Guitar{" +
                "cordNumber=" + cordNumber +
                '}';
    }

    String NumberOfJets = "7";
}
