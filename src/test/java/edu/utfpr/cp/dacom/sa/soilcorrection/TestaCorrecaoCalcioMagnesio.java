package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcioMagnesio{
    @Test
    public void calcPartAtualCalcioTest(){
        CorERecCaMg c = new CorERecCaMg();
        c.setQtdCa(5.76);
        c.setQtdMg(1.63);
        c.setQtdK(0.15);
        c.setQtdHAl(5.35);
        assertEquals(44.7, c.calcPartAtualCalcio(),0.1);
    }
    
    @Test
    public void calcIdealTest(){
        CorERecCaMg c = new CorERecCaMg();
        c.setTexSolo(1);
        assertEquals("45 a 55", c.calcIdeal());
    }

    @Test
    public void calcPartCorrigidoCalcioTest(){
        CorERecCaMg c = new CorERecCaMg();
        c.setFonteP(1);
        c.setTeorP(12);
        c.setQtdP(8.59);
        c.setEfcP(70);
        c.setFonteCorretivo(2);
        c.setQtdCa(5.76);
        c.setQtdMg(1.63);
        c.setQtdK(0.15);
        c.setQtdHAl(5.35);
        c.setTeorCO(0);
        c.setPartDesejada(55);
        assertEquals(55, c.calcPartCorrigidoCalcio(),0.1);
    }
}