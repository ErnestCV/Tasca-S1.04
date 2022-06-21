package org.n1ex2;

import java.util.HashMap;
public class CalculoDNI {

    public static String calculDNI(int num) throws DNINoValidException{

        if (Integer.toString(num).length() != 8) {
            throw new DNINoValidException("El nombre ha de tenir 8 dígits");
        }

        String lletra = "";

        switch (num % 23) {
            case 0 ->  lletra = "T";
            case 1 ->  lletra = "R";
            case 2 ->  lletra = "W";
            case 3 ->  lletra = "A";
            case 4 ->  lletra = "G";
            case 5 ->  lletra = "M";
            case 6 ->  lletra = "Y";
            case 7 ->  lletra = "F";
            case 8 ->  lletra = "P";
            case 9 ->  lletra = "D";
            case 10 ->  lletra = "X";
            case 11 ->  lletra = "B";
            case 12 ->  lletra = "N";
            case 13 ->  lletra = "J";
            case 14 ->  lletra = "Z";
            case 15 ->  lletra = "S";
            case 16 ->  lletra = "Q";
            case 17 ->  lletra = "V";
            case 18 ->  lletra = "H";
            case 19 ->  lletra = "L";
            case 20 ->  lletra = "C";
            case 21 ->  lletra = "K";
            case 22 ->  lletra = "E";
        }
        return lletra;

    }

}
