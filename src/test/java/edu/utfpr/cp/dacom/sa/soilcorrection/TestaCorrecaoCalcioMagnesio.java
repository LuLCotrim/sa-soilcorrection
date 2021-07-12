package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

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
        
    }
}