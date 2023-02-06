
public class InstrumentsDemo {
    public static void main(String[] args) {
        Instruments [] instruments = new Instruments[3];
        instruments[0] = new Guitara();
        instruments[1] = new Caisse();
        instruments[2] = new Trumpet();

        for (Instruments instrument : instruments) {
            instrument.play();
        }
    }
}
