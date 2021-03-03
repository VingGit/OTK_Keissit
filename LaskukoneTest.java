package laskukone;

import static org.junit.jupiter.api.Assertions.*;

class LaskukoneTest {

    @org.junit.jupiter.api.Test
    void lisaaLukuTest() {
        Laskukone testi = new Laskukone();
        testi.lisaaLuku(5);
        assertEquals(5,testi.tulos);
    }

    @org.junit.jupiter.api.Test
    void vahennaLukuTest() {
        Laskukone testi = new Laskukone();
        testi.vahennaLuku(5);
        assertEquals(-5,testi.tulos);
    }

    @org.junit.jupiter.api.Test
    void kerroLuvullaTest() {
        Laskukone testi = new Laskukone();
        testi.lisaaLuku(5);
        testi.kerroLuvulla(2);
        assertEquals(10,testi.tulos);
    }

    @org.junit.jupiter.api.Test
    void korotaPotenssiinTest() {
        Laskukone testi = new Laskukone();
        testi.lisaaLuku(5);
        testi.korotaPotenssiin(2);
        assertEquals(25,testi.tulos);
    }

    @org.junit.jupiter.api.Test
    void annaTulosTest() {
        Laskukone testi = new Laskukone();
        testi.lisaaLuku(8);

        assertEquals(8,testi.tulos);
    }

    @org.junit.jupiter.api.Test
    void nollaaTest() {
        Laskukone testi = new Laskukone();
        testi.nollaa();
        assertEquals(0,testi.tulos);
    }
}