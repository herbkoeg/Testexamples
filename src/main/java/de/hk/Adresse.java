package de.hk;

/**
 * Created by palmherby on 26.12.16.
 */
public class Adresse {

    protected String strasse;
    protected int hausnummer;
    protected String hausnummerZusatz;
    protected String ort;
    protected long plz;


    public static final class AdresseBuilder {
        protected String strasse;
        protected int hausnummer;
        protected String hausnummerZusatz;
        protected String ort;
        protected long plz;

        private AdresseBuilder() {
        }

        public static AdresseBuilder anAdresse() {
            return new AdresseBuilder();
        }

        public AdresseBuilder withStrasse(String strasse) {
            this.strasse = strasse;
            return this;
        }

        public AdresseBuilder withHausnummer(int hausnummer) {
            this.hausnummer = hausnummer;
            return this;
        }

        public AdresseBuilder withHausnummerZusatz(String hausnummerZusatz) {
            this.hausnummerZusatz = hausnummerZusatz;
            return this;
        }

        public AdresseBuilder withOrt(String ort) {
            this.ort = ort;
            return this;
        }

        public AdresseBuilder withPlz(long plz) {
            this.plz = plz;
            return this;
        }

        public Adresse build() {
            Adresse adresse = new Adresse();
            adresse.hausnummer = this.hausnummer;
            adresse.strasse = this.strasse;
            adresse.hausnummerZusatz = this.hausnummerZusatz;
            adresse.ort = this.ort;
            adresse.plz = this.plz;
            return adresse;
        }
    }
}
