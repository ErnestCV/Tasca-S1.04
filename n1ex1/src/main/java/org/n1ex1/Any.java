package org.n1ex1;

import java.util.ArrayList;
import java.util.List;

public class Any {

    private static final List<String> llista = new ArrayList<>();

    static {
        llista.add("gener");
        llista.add("febrer");
        llista.add("març");
        llista.add("abril");
        llista.add("maig");
        llista.add("juny");
        llista.add("juliol");
        llista.add("agost");
        llista.add("setembre");
        llista.add("octubre");
        llista.add("novembre");
        llista.add("desembre");
    }
    public Any() {

    }

    public List<String> getLlista() {
        return llista;
    }

    public static void main(String[] args) {

    }
}