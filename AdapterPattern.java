public class AdapterPattern {
    interface lightningPort {
        void chargeWithLightning();
    }

    static class Iphone4SCharger {
        public void chargeWith30Pin(){
            System.out.println("Charging with 30-pin connector.");
        }
    }

    static class LightningAdapter implements lightningPort {
        private Iphone4SCharger charger;

        public LightningAdapter(Iphone4SCharger charger) {
            this.charger = charger;
        }

        @Override
        public void chargeWithLightning() {
            System.out.println("Adapter converts Lightning to 30-pin.");
            charger.chargeWith30Pin();
        }
    }

    static class Iphone6S {
        private lightningPort port;

        public IPhone6SLightningPort port){
            this.port = port;
        }

        public void chargePhone(){
            port.chargeWithLightning();
            System.out.println("Iphone 6S is charging.");
        }
    }

    public static void main(String[] args) {
        Iphone4SCharger oldCharger = new Iphone4SCharger();
        LightningAdapter adapter = new LightningAdapter(oldCharger);
        Iphone6S iphone6S = new Iphone6S(adapter);
        iphone6S.chargePhone();
    }
}