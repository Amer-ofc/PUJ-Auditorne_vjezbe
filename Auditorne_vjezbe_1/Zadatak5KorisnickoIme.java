/*
 * ZADATAK 5 – Generator korisničkog imena
 * Programiranje u Javi – Auditorne vježbe, Sedmica 2
 *
 * Od imena, prezimena i godine rođenja napravite korisničko ime:
 *   prvo slovo imena + prezime + zadnje dvije cifre godine, sve MALIM slovima
 *
 *   "Amila", "Tabak", 2006   ->   atabak06
 *
 * Koraci:
 *   1) prvo slovo imena:           ime.substring(0, 1)     (indeksi kreću od 0!)
 *   2) godinu pretvorite u tekst:  String godinaTekst = "" + godinaRodjenja;
 *      zadnje dvije cifre:         godinaTekst.substring(2)    -> "06"
 *      (zašto ne godinaRodjenja % 100?  probajte – dobit ćete 6, a ne 06)
 *   3) spojite dijelove i pretvorite u mala slova:  toLowerCase()
 *   4) ispišite korisničko ime i njegovu dužinu:    length()
 *
 * Očekivani ispis:
 *   Korisničko ime: atabak06
 *   Dužina: 8
 *
 * BONUS 1: ispišite inicijale u obliku  A.T.
 * BONUS 2 ("Tajni kod"): u riječi "JAVA" zamijenite prvo i zadnje slovo -> "AAVJ"
 *          (pomoć: charAt(0), charAt(3) i substring(1, 3))
 * BONUS 3: za prezime "Hodžić" napravite korisničko ime bez č, ć, š, ž, đ -> ahodzic06
 *          (pomoć: replace("ž", "z") ...)
 */
public class Zadatak5KorisnickoIme {

    public static void main(String[] args) {
        String ime = "Amila";
        String prezime = "Tabak";
        int godinaRodjenja = 2006;

        // TODO: napravite korisničko ime
        String korisnickoIme = "";
        String imePrvoSlovo=ime.substring(0,1);
        String godinaTekst=""+godinaRodjenja;
        godinaTekst=godinaTekst.substring(2);
        String spojenTekst=imePrvoSlovo+prezime+godinaTekst;
        spojenTekst=spojenTekst.toLowerCase();
        korisnickoIme=spojenTekst;
        System.out.println("Korisničko ime: " + korisnickoIme);
        // TODO: ispišite dužinu korisničkog imena
        System.out.println("Duzina teksta:"+korisnickoIme.length());

        //BONUS 1:Ispisite inicijale u obliku A.T.
        String imePrvoSlovo2=ime.substring(0,1);
        String prezimePrvoSlovo2=prezime.substring(0,1);
        System.out.println(imePrvoSlovo2+"."+prezimePrvoSlovo2+".");

        //BONUS 2:("Tajni kod"): u riječi "JAVA" zamijenite prvo i zadnje slovo -> "AAVJ"
        // *          (pomoć: charAt(0), charAt(3) i substring(1, 3))
        String zamjenaPrvoZadnje="JAVA";
        char PrvoSlovo=zamjenaPrvoZadnje.charAt(0);
        char ZadnjeSlovo=zamjenaPrvoZadnje.charAt(3);
        String Slova_izmedu=zamjenaPrvoZadnje.substring(1,3);
        String nova_rijec=ZadnjeSlovo+Slova_izmedu+PrvoSlovo;
        System.out.println("Prije zamjene slova rijec:"+zamjenaPrvoZadnje+",nakon zamjene:"+nova_rijec);

        //BONUS 3 za prezime "Hodžić" napravite korisničko ime bez č, ć, š, ž, đ -> ahodzic06
        // *          (pomoć: replace("ž", "z") ...)
        String korisnickoIme2="";
        String ime2="Amar";
        String prezime2="Hodžić";
        int godinaRodjenja2 = 2006;
        prezime2=prezime2.replace("ž","z");
        prezime2=prezime2.replace("ć","c");
        String imePrvoSlovo3=ime2.substring(0,1);
        String godinaTekst2=""+godinaRodjenja2;
        godinaTekst2=godinaTekst2.substring(2);
        String spojenTekst2=imePrvoSlovo2+prezime2+godinaTekst2;
        spojenTekst2=spojenTekst2.toLowerCase();
        korisnickoIme2=spojenTekst2;
        System.out.println("Korisničko ime: " + korisnickoIme2);

    }
}
