package stack_overflow;
public class karte {

      // Anfang Attribute
      private int gezogen;
      // Ende Attribute

      public karte() {
        this.gezogen = gezogen;
      }

      // Anfang Methoden
      public int getGezogen() {
        return gezogen;
      }

      public void setGezogen(karte newGezogen) {
        gezogen = ((int) Math.random() * 4) + 1;
      }

      // Ende Methoden
    } // end of karte