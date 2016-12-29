package de.hk;

/**
 * Created by palmherby on 26.12.16.
 */
public class Person {

    private String vorname;
    private String name;
    private String titel;
    private Adresse adresse;

    public static final class PersonBuilder {
        private String vorname;
        private String name;
        private String titel;
        private Adresse adresse;

        private PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder withVorname(String vorname) {
            this.vorname = vorname;
            return this;
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withTitel(String titel) {
            this.titel = titel;
            return this;
        }

        public PersonBuilder withAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.vorname = this.vorname;
            person.titel = this.titel;
            person.adresse = this.adresse;
            return person;
        }
    }
}
