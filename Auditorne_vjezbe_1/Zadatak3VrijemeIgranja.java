/*
 * ZADATAK 3 – Koliko sam vremena proveo igrajući?
 * Programiranje u Javi – Auditorne vježbe, Sedmica 2
 *
 * Igrica je zabilježila ukupno vrijeme igranja u SEKUNDAMA.
 * Pretvorite ga u dane, sate, minute i sekunde koristeći operatore  /  i  %.
 *
 *   ukupnoSekundi = 200000   ->   2 d, 7 h, 33 min, 20 s
 *
 * Pomoć:  1 dan = 86 400 s     1 sat = 3 600 s     1 minuta = 60 s
 *         dani    = ukupnoSekundi / 86400;     (koliko CIJELIH dana stane)
 *         ostatak = ukupnoSekundi % 86400;     (sekunde koje su ostale)
 *         ... dalje na isti način za sate i minute
 *
 * Dodatno: napravite boolean varijablu viseOdJednogDana i ispišite je.
 * Provjera: probajte i sa 3661  ->  0 d, 1 h, 1 min, 1 s
 */
public class Zadatak3VrijemeIgranja {

    public static void main(String[] args) {
        int ukupnoSekundi = 200000;

        // TODO: izračunajte dane, sate, minute i sekunde (zamijenite nule izrazima)
        int dani = 0;
        int sati = 0;
        int minute = 0;
        int sekunde = 0;

        dani = ukupnoSekundi/86400;
        sati = (ukupnoSekundi%86400)/3600;
        minute = (ukupnoSekundi%3600)/60;
        sekunde=ukupnoSekundi%60;

        System.out.println(ukupnoSekundi + " s = " + dani + " d, " + sati + " h, "
                + minute + " min, " + sekunde + " s");

        // TODO (dodatno): boolean viseOdJednogDana = ...
        int ukupnoSekundi2=3661;
        boolean viseOdJednogDana=ukupnoSekundi2>=86400;

        int dani2 = ukupnoSekundi2/86400;
        int sati2 = (ukupnoSekundi2%86400)/3600;
        int minute2 = (ukupnoSekundi2%3600)/60;
        int sekunde2=ukupnoSekundi2%60;

        if(viseOdJednogDana==true){
            System.out.println("Vise od jednog dana je tacan");
        }else{
            System.out.println("Vise od jednog dana nije tacan");
        }
        System.out.println(ukupnoSekundi2 + " s = " + dani2 + " d, " + sati2 + " h, "
                + minute2 + " min, " + sekunde2 + " s");
    }
}
