package testes;

import org.junit.Assert;
import org.junit.Test;

import filtroDeFaturas.*;

public class TesteFatura {

	@Test
	public void testaCodigo() {
		System.out.println("C�digo sendo testado");
		Cliente cle1 = new Cliente("Gil Bala","2017-04-17","Pernambuco");
		Fatura ftr1 = new Fatura("24PN3445",33.5,"2017-05-17",cle1);
		
		//testando com o c�digo certo
		String codEsperado = "24PN3445";
		String codReal = ftr1.getCodigo();
		Assert.assertEquals(codEsperado, codReal);
		
		//testand case Sensitive
		codEsperado = "24pn3445";
		codReal = ftr1.getCodigo();
		Assert.assertNotEquals(codEsperado, codReal);
		
		codReal = ftr1.getCodigo().toLowerCase();
		Assert.assertEquals(codEsperado, codReal);
		
		//testando com o c�digo errado
		codEsperado = "24P3445";
		codReal = ftr1.getCodigo();
		Assert.assertNotEquals(codEsperado, codReal);
	}
	
	@Test
	public void testaValor(){
		System.out.println("Valor sendo testado");
		Cliente cle1 = new Cliente("Gil Bala","2017-04-17","Pernambuco");
		Fatura ftr1 = new Fatura("24PN3445",33.5,"2017-05-17",cle1);
		
		//testando com o valor certo
		double valorEsperado = 33.5;
		double valorReal = ftr1.getValor();
		Assert.assertEquals(valorEsperado, valorReal,0);
		
		//testando com o valor errado
		valorEsperado = 33;
		valorReal = ftr1.getValor();
		Assert.assertNotEquals(valorEsperado, valorReal,0);
	}
	
	@Test
	public void testaData(){
		System.out.println("Data sendo testada");
		Cliente cle1 = new Cliente("Gil Bala","2017-04-17","Pernambuco");
		Fatura ftr1 = new Fatura("24PN3445",33.5,"2017-05-17",cle1);
		
		//testando com dataFornecida
		//testando dia
		int diaEsperado = 17;
		int diaReal = ftr1.getDia();
		Assert.assertEquals(diaEsperado,diaReal);
		//testando m�s
		int mesEsperado = 5;
		int mesReal = ftr1.getMes();
		Assert.assertEquals(mesEsperado, mesReal);
		//testando ano
		int anoEsperado = 2017;
		int anoReal = ftr1.getAno();
		Assert.assertEquals(anoEsperado, anoReal);
				
		//testando com errada
		//testando dia
		diaEsperado = 7;
		diaReal = ftr1.getDia();
		Assert.assertNotEquals(diaEsperado,diaReal);
		//testando m�s
		mesEsperado = 11;
		mesReal = ftr1.getMes();
		Assert.assertNotEquals(mesEsperado, mesReal);
		//testando ano
		anoEsperado = 2011;
		anoReal = ftr1.getAno();
		Assert.assertNotEquals(anoEsperado, anoReal);
	}
	
	@Test
	public void testaCliente(){
		System.out.println("Cliente da fatura sendo testado");
		Cliente cle1 = new Cliente("Gil Bala","2017-04-17","Pernambuco");
		Fatura ftr1 = new Fatura("24PN3445",33.5,"2017-05-17",cle1);
		
		//testando Cliente
		//testando nome do cliente
		String nomeEsperado = cle1.getNome();
		String nomeReal = ftr1.getCliente().getNome();
		Assert.assertEquals(nomeEsperado, nomeReal);
		
		//testando estado
		String estadoEsperado = cle1.getEstado();
		String estadoReal = ftr1.getCliente().getEstado();
		Assert.assertEquals(estadoEsperado, estadoReal);
		
		//testando data do cliente
		//dia
		int diaEsperado = cle1.getDia();
		int diaReal = ftr1.getCliente().getDia();
		Assert.assertEquals(diaEsperado, diaReal);
		//mes
		int mesEsperado = cle1.getMes();
		int mesReal = ftr1.getCliente().getMes();
		Assert.assertEquals(mesEsperado, mesReal);
		//ano
		int anoEsperado = cle1.getAno();
		int anoReal = ftr1.getCliente().getAno();
		Assert.assertEquals(anoEsperado, anoReal);
	}

}
