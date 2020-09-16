public class kadai15{
    public static void main(String[] args) {
        Dengen dengen;

        dengen = new AcAdapter();
        int denatsu = dengen.kyuuden();
        System.out.println(denatsu + "V‚Å‹‹“d‚³‚ê‚Ä‚¢‚Ü‚·");
    }
}

abstract class Dengen{
    public abstract int kyuuden();
}

class JapaneseConsent {
    public int specificRequest(){
        return 100;
    }
}



class AcAdapter extends Dengen{
    private JapaneseConsent adaptee;

    public AcAdapter(){
        this.adaptee = new JapaneseConsent();
    }

    public int kyuuden(){

        return (int)(adaptee.specificRequest()*0.16);
    }
}