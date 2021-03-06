package testes;

import org.junit.Assert;
import org.junit.Test;

import filtroDeFaturas.Cliente;

public class TesteCliente {

	@Test
	public void testeNome() {
		System.out.println("Nome sendo testado");
		//formato da data: yyyy-MM-dd
		Cliente cle1 = new Cliente("Lucas","2010-08-10","Para�ba");
		
		//testand com nome fornecido
		String nomeEsperado = "Lucas";
		String nomeReal = cle1.getNome();
		Assert.assertEquals(nomeEsperado, nomeReal);
		
		//testando com caseSensitive
		nomeEsperado = "LUCAS";
		nomeReal = cle1.getNome().toUpperCase();
		Assert.assertEquals(nomeEsperado, nomeReal);
		
		nomeEsperado = "lucas";
		nomeReal = cle1.getNome().toLowerCase();
		Assert.assertEquals(nomeEsperado, nomeReal);
		
		//testando com nome errado
		nomeEsperado = "Mathes";
		nomeReal = cle1.getNome();
		Assert.assertNotEquals(nomeEsperado,nomeReal);
	}
	
	@Test
	public void testeEstado() {
		System.out.println("Estado sendo testado");
		//formato da data: yyyy-MM-dd
		Cliente cle1 = new Cliente("Lucas","2010-08-10","Para�ba");
		
		//testando com m�s fornecido
		String mesEsperado = "Para�ba";
		String mesReal = cle1.getEstado();
		Assert.assertEquals(mesEsperado,mesReal);
		
		//testando caseSensitive
		mesEsperado = "para�ba";
		mesReal = cle1.getEstado().toLowerCase();
		Assert.assertEquals(mesEsperado,mesReal);
		
		mesEsperado = "PARA�BA";
		mesReal = cle1.getEstado().toUpperCase();
		Assert.assertEquals(mesEsperado,mesReal);
		
		//testando com m�s errado
		mesEsperado = "Parr�ba";
		mesReal = cle1.getEstado();
		Assert.assertNotEquals(mesEsperado, mesReal);
	}
	
	@Test
	public void testeData(){
		System.out.println("Data sendo testada");
		Cliente cle1 = new Cliente("Lucas","2010-08-10","Para�ba");
		
		//testando com dataFornecida
		//testando dia
		int diaEsperado = 10;
		int diaReal = cle1.getDia();
		Assert.assertEquals(diaEsperado,diaReal);
		//testando m�s
		int mesEsperado = 8;
		int mesReal = cle1.getMes();
		Assert.assertEquals(mesEsperado, mesReal);
		//testando ano
		int anoEsperado = 2010;
		int anoReal = cle1.getAno();
		Assert.assertEquals(anoEsperado, anoReal);
		
		//testando com errada
		//testando dia
		diaEsperado = 7;
		diaReal = cle1.getDia();
		Assert.assertNotEquals(diaEsperado,diaReal);
		//testando m�s
		mesEsperado = 11;
		mesReal = cle1.getMes();
		Assert.assertNotEquals(mesEsperado, mesReal);
		//testando ano
		anoEsperado = 2011;
		anoReal = cle1.getAno();
		Assert.assertNotEquals(anoEsperado, anoReal);
		
		
		
		
	}

}
