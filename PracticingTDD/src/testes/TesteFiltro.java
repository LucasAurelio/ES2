package testes;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import filtroDeFaturas.*;

public class TesteFiltro {

	@Test
	public void testsFiltro() {
		System.out.println("Filtros sendo testado");
		Cliente cle1 = new Cliente("Gil Bala","2017-04-17","Pernambuco");
		Cliente cle2 = new Cliente("Coleguinhas","2017-04-17","Pernambuco");
		Cliente cle3 = new Cliente("Dorgival Dantas","2017-04-10","Pernambuco");
		Cliente cle4 = new Cliente("Wesley Safadão","2017-04-18","Pernambuco");
		Cliente cle5 = new Cliente("Saia Rodada","2017-04-17","Rio Grande do Sul");
		Cliente cle6 = new Cliente("Domiguinhos","2017-04-17","Pernambuco");
		
		Fatura ftr1 = new Fatura("24PN3445",1310.5,"2017-05-17",cle1);//exclui
		
		Fatura ftr2 = new Fatura("24PN3445",2000.5,"2017-04-17",cle2);//permanece
		Fatura ftr3 = new Fatura("24PN3445",2000.5,"2017-05-17",cle2);//exclui
		
		Fatura ftr4 = new Fatura("24PN3445",2850.5,"2017-05-17",cle3);//permanece
		Fatura ftr5 = new Fatura("24PN3445",2850.5,"2017-05-17",cle4);//exclui
		Fatura ftr6 = new Fatura("24PN3445",3250.5,"2017-05-17",cle4);//permanece
		
		Fatura ftr7 = new Fatura("24PN3445",5480.5,"2017-05-17",cle5);//exclui
		Fatura ftr8 = new Fatura("24PN3445",5480.5,"2017-05-17",cle6);//permanece
		
		ArrayList<Fatura> faturas = new ArrayList<Fatura>();
		faturas.add(ftr1);
		faturas.add(ftr2);
		faturas.add(ftr3);
		faturas.add(ftr4);
		faturas.add(ftr5);
		faturas.add(ftr6);
		faturas.add(ftr7);
		faturas.add(ftr8);
		
		Filtro fitr1 = new Filtro(faturas);
		ArrayList<Fatura> faturasEsperadas = new ArrayList<Fatura>();
		faturasEsperadas.add(ftr2);
		faturasEsperadas.add(ftr4);
		faturasEsperadas.add(ftr6);
		faturasEsperadas.add(ftr8);
		ArrayList<Fatura> faturasReal = fitr1.getFaturas();
		Assert.assertEquals(faturasEsperadas,faturasReal);
	}

}
