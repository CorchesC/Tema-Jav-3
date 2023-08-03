package Probleme;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Scanner;

public class Probleme {

    //todo: 34. Să considerăm următorul şir: a, b, ba, bba, bbaba, bbabbaba, bbabbababbaba. Scrieți un program care să determine care este cel de-al n-lea termen al şirului. Valoarea lui n este strict mai mică decât 20.





    //todo: 35.Se consideră un şir de n cuvinte reprezentând numele disciplinelor din orarul zilei următoare ale unui elev. Realizați un program care permite afişarea orarului pe ieşirea standard, astfel încât materiile să fie scrise pe coloane, în ordine lexicografica.

    void Sol2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();

        String textFinal = reordonarePropozitieInOridneAlfabetica(text);
        afisarePropozitiePeColoane(textFinal);
    }

    public String reordonarePropozitieInOridneAlfabetica(String str) {
        String[] split = str.split(" ");
        String aux = "";
        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].compareTo(split[j]) > 0) {
                    aux = split[i];
                    split[i] = split[j];
                    split[j] = aux;
                }
            }
        }
        String fin = "";
        for (int k = 0; k < split.length; k++) {
            fin += split[k];
            fin += " ";
        }
        return fin;
    }

    public void afisarePropozitiePeColoane(String str) {
        String[] split = str.split(" ");
        for (int i =0; i < split.length; i++) {
            for (int j =0; j < split[i].length(); j++) {
                System.out.println(split[i].charAt(j));
            }
        }
    }



    //todo: 36. Se consideră un text ce conține maximum 100 de cuvinte, fiecare cuvânt fiind format din cel mult 50 de litere ale alfabetului englez. Orice alt caracter este considerat separator. Textul este dispus pe mai multe linii în fişierul in.txt. Să se afişeze pe o singură linie a ieșirii standard, cuvintele de lungime maximă din text, separate prin câte un spațiu.

    void Sol3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();

        String textFinal = cuvinteleCuLungimeMaxima(text);
        System.out.println(textFinal);
    }

    public int lungimeCuvant(String str) {
        int l =0;
        for (int i =0; i < str.length(); i++) {
            l++;
        }
        return l;
    }

    public int lungimeMaximaCuvinte(String str) {
        String[] split = str.split("[,.!?;: ]");
        int lMax = -1;
        for (int i =0; i < split.length; i++) {
            if (lungimeCuvant(split[i]) > lMax) {
                lMax = lungimeCuvant(split[i]);
            }
        }
        return lMax;
    }

    public String cuvinteleCuLungimeMaxima(String str) {
        String[] split = str.split("[,.!?;: ]");
        int lMax = lungimeMaximaCuvinte(str);
        String aux = "";
        for (int i =0; i < split.length; i++) {
            if (lungimeCuvant(split[i]) == lMax) {
                aux += split[i];
                aux += " ";
            }
        }
        return aux;
    }



    //todo: 37.  În fişierul in.txt se află dispuse pe mai multe linii informații despre ora de plecare a trenurilor şi destinația lor finală. Momentul plecării din stație este exprimat prin 5 caractere, primele două reprezentând ora, iar ultimele două reprezentând minutele(hh:mm).
    //           În continuare, în cadrul liniei se află numele destinației. Afişaţi, pe câte o linie a ieşirii standard, lista destinațiilor în ordinea crescătoare a momentului plecării. Pe fiecare linie se va afişa numele destinaţiei şi ora plecării, separate printr-un spațiu. Ora de plecare va fi exprimată în minute.

    public void Sol4() {

    }
//    public void oreTren(String str[]) {
//        for (int i =0; i < str.length; i++) {
//            int s = str[0];
//        }
//    }


    //todo: 38. Considerăm validă o adresă de e-mail dacă este formată doar din litere mici ale alfabetului englez, din caracterul şi caracterul '@' care apare o singură dată Caracterele alăturate acestuia nu pot fi puncte '.'. Se codifică o adresă de e-mail după următoarele reguli:

    public void Sol5() {

    }

    public void email(String str) {
        //??
    }


    //todo: 39. O formulă este restrânsă folosind parantezele rotunde astfel: şirul „ababab” va fi scris simplificat ,,(ab)3" iar şirul ,,axzyxzyw" va fi scris ,,a(xzy)2w". Formula restrânsă se citeşte de la intrarea standard. Ştiind că nu sunt prezente perechi de paranteze incluse una în alta, afișați şirul inițial.

    public void Sol6() {

    }

    public void restrangereString(String str) {
        int ctr =0;
        while (ctr < 9) {
            for (int i =0 ;i < str.length(); i++) {

            }
        }
    }


    //todo 40. Se citeşte, de la intrarea standard, un şir de maximum 200 de caractere. Realizați un program care determină cea mai lungă secvență de caractere ordonate lexicografic. În situația în care există mai multe astfel de secvențe se vor afişa toate, fiecare pe câte o linie a ieşirii standard.

    public void Sol7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();

        int l = ceaMaiLungaSecventaDeCaractereOrdonateAlfabetic(text);
        System.out.println(l);
    }

    public int ceaMaiLungaSecventaDeCaractereOrdonateAlfabetic(String str) {
        int lMax = -1;
        for (int i =0; i < str.length(); i++) {
            int l =0;
            if (Character.compare(str.charAt(i),str.charAt(i)) < 0) {
                l++;
            }
            else if (Character.compare(str.charAt(i),str.charAt(i)) > 0) {
                if (l > lMax) {
                    lMax = l;
                }
                l = 0;
            }
        }
        return lMax;
    }



    //todo: 41. Se consideră o expresie aritmetică ce conține numai operatorii {+,*}. Operanzii sunt reprezentați prin variabile ai căror identificatori sunt descrişi printr-o singură literă, sau prin numere naturale. Realizați un program care verifică dacă expresia este corectă sintactic.

    public void Sol8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String text = scanner.nextLine();

        if (esteEcuatieCorecta(text) == true) {
            System.out.println("Este o operatie corecta");
        }
        else {
            System.out.println("Nu este o operatie corecta");
        }
    }

    private boolean isOperator(char ch) {
        String operatori = "+-";
        if (operatori.contains(ch + "") == true) {
            return true;
        }
        return false;
    }

    public boolean esteEcuatieCorecta(String str) {
         for (int i =0; i < str.length(); i++) {
             if (isOperator(str.charAt(i)) == true && isOperator(str.charAt(i+1)) == true ) {
                 return false;
             }
         }
         return true;
    }



    //todo: 42. Se consideră un şir de paranteze rotunde care intervin într-o expresie aritmetică.  Realizați un program care verifică dacă acestea formează un şir de paranteze care se închid corect (după regulile aritmetice).

    public void Sol9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String text = scanner.nextLine();

        if (esteParantezaCorecta(text) == true) {
            System.out.println("Este o serie de paranteze corecte");
        }
        else {
            System.out.println("Nu este o serie de paranteze corecte");
        }
    }

    public boolean esteParantezaCorecta(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')' && str.charAt(i + 1) == '(') {
                return false;
            }
        }
        return true;
    }



    //todo: 43. Se consideră următoarea regulă de codificare a unui cuvânt: în faţa oricărei vocale a cuvântului se inserează caracterul 'p'. Realizaţi un program care va introduce tipul operației dorite prin caracterele: C pentru codificare şi D pentru realizează operația de codificare şi de decodificare a unui cuvânt. De la tastatură se decodificare.
    //          Pentru operația C şi cuvântul ,,oaie" se va afişa: „popapipe”.
    //          Pentru operația D și cuvântul ,,pparpintpe" se va afișa: „parinte".

    public void Sol10() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String text = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        char cuv = scanner2.nextLine().charAt(0);

        String textFinal = operatieCD(text,cuv);
        System.out.println(textFinal);

    }

    private boolean isVocala(char ch) {
        if (!Character.isAlphabetic(ch)) {
            return false;
        }
        String vocale = "AEIOUaeiou";
        return vocale.contains(ch + "");
    }

    public String operatieCD(String str, char ch) {
        String aux = "";
        if (ch == 'C') {
            for (int i = 0; i < str.length(); i++) {
                if (isVocala(str.charAt(i)) == true) {
                    aux += "p";
                    aux += str.charAt(i);
                } else {
                    aux += str.charAt(i);
                }
            }
        }
        else if (ch == 'D') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'p' && isVocala(str.charAt(i + 1)) == true) {
                    aux += "";
                } else {
                    aux += str.charAt(i);
                }
            }
        }
        return aux;
    }

}
