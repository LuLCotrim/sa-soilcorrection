package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorERecCaMg {
	
	//entradas
	double partDesejada;
	int fonteCorretivo;
	double prnt;
	double teorCO;
	double valorCD;
	double valorCaCa;
	double valorCaCo;
	double valorGA;
	double valorHC;
	double valorCM;
	//entradas gerais
	double qtdHAl;
	double qtdCa;
	double qtdMg;
	double qtdK;
	int texSolo;
	int fonteP;
	double teorP;
	double qtdP;
	double efcP;
	
	
	public double calcPartAtualCalcio(){
		
		double r6 = qtdCa+qtdMg+qtdK+qtdHAl;
		double res = qtdCa/r6*100;
		
		return res;
	}
	
	public String calcIdeal() {
		
		String res = null;
		if (texSolo == 1) {
			res = "45 a 55";
		}else if(texSolo == 2) {
			res = "35 a 40";
		}else {
			res = "";
		}
		
		return res;
	}
	
	public double calcPartCorrigidoCalcio(){
		
		double res = 0;
		double am40;
		switch (fonteP) {
			case 1:
				am40 = 0.49924;
				break;
			case 2:
				am40 = 0.33877;
				break;
			case 3:
				am40 = 0;
				break;
			case 4:
				am40 = 0;
				break;
			case 5:
				am40 = 0.49924;
				break;
			case 6:
				am40 = 0.92716;
				break;
			case 7:
				am40 = 0.92716;
				break;
			case 8:
				am40 = 0.80235;
				break;
			case 9:
				am40 = 0.49924;
				break;
			case 10:
				am40 = 0.795218;
				break;
			case 11:
				am40 = 0;
				break;
			case 12:
				am40 = 0;
				break;
			default:
				am40 = 0;		
		}	
		double al40;
		switch (fonteP) {
			case 1:
				al40 = 18;
				break;
			case 2:
				al40 = 41;
				break;
			case 3:
				al40 = 48;
				break;
			case 4:
				al40 = 45;
				break;
			case 5:
				al40 = 18;
				break;
			case 6:
				al40 = 33;
				break;
			case 7:
				al40 = 29;
				break;
			case 8:
				al40 = 32;
				break;
			case 9:
				al40 = 24;
				break;
			case 10:
				al40 = 18.5;
				break;
			case 11:
				al40 = 52;
				break;
			case 12:
				al40 = 18;
				break;
			default:
				al40 = 0;		
		}
		double n27;
		double q72;
		double e10 = teorP - qtdP;
		if(e10<0.01){
			q72 = 0.0;
		}else{
			q72 = e10;
		}
		double b24 = (((q72*2)*2.29)/efcP)*100/al40*2.42;
		switch (fonteP) {
			case 1:
				n27 = b24*0.28;
				break;
			case 2:
				n27 = b24*0.2;
				break;
			case 3:
				n27 = b24*0.09;
				break;
			case 4:
				n27 = b24*0.16;
				break;
			case 5:
				n27 = b24*0.28;
				break;
			case 6:
				n27 = b24*0.52;
				break;
			case 7:
				n27 = b24*0.52;
				break;
			case 8:
				n27 = b24*0.45;
				break;
			case 9:
				n27 = b24*0.28;
				break;
			case 10:
				n27 = b24*0.44;
				break;
			case 11:
				n27 = b24*0;
				break;
			case 12:
				n27 = b24*0.18;
				break;
			default:
				al40 = 0;		
		}
		double o102;
		switch(fonteCorretivo){
			case 1:
				o102 = 30.4;
				break;
			case 2:
				o102 = 56;
				break;
			case 3:
				o102 = 54;
				break;
			case 4:
				o102 = 29;
				break;
			case 5:
				o102 = 75.7;
				break;
			case 6:
				o102 = 35;
				break;
			default:
				o102 = 0;
		}
		double r6 = qtdCa+qtdMg+qtdK+qtdHAl;
		double i105 = (n27/2.42) * am40 / 1000;
		double g102;
		if(g101>0.01){
			g102 = teorCaO;
		}else{
			g102 = o102;
		}
		double e48 = calcPartAtualCalcio();
		double p91 = (((qtdCa*partDesejada/ e48 -qtdCa)-i105)) / ((g102*0.01783)+i105);
		double p88;
		if(p91>0.001){
			p88 = p91;
		}else if(p91<13){
			p88 = 0;
		}
		double f113;
		if(p88>0.0001){
			f113 = p88;
		}else{
			f113 =0;
		}
		double g111 = (((g102) * 0.01783) + i105)* f113;
		res = (qtdCa+g111+i105)/r6*100;

		return res;
	}
}
