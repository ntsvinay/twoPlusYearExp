package stack_overflow;

import java.awt.event.ActionEvent;

public class sst
{
public static void main(String[] args) {
        new sst();
        muenze coin = new muenze();
        karte card = new karte();
      } // end of main

      public void bSpielen_ActionPerformed(ActionEvent evt) {
        bReset.setEnabled(true);
        card.gezogen();
        coin.ergebnis();
        punktestand = card.gezogen() * coin.ergebnis();
        if (coin.ergebnis() == 2) {
          jLabel2.setText("Zahl");
        } else {
          jLabel2.setText("Kopf");
        } // end of if-else
        jLabel3.setText("Karte: " + card.gezogen());
        jLabel1.setText("Punktestand" + punktestand);
      } // end of bSpielen_ActionPerformed


    //This is the second Class (muenze.java)

    


} //This is t