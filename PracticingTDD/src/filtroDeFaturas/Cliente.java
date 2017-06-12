package filtroDeFaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	protected String nomeCliente;
	protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	protected Date data = new Date();
	protected String estadoCliente;
	
	public Cliente(String nome, String data_inclusao, String estado){
		this.nomeCliente = nome;
		try {
			data = sdf.parse(data_inclusao);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.estadoCliente = estado;
	}
	
	
	public String getNome(){
		return nomeCliente;
	}
	
	public int getDia(){
		return data.getDate();
	}
	
	public int getMes(){
		//meses vão de 0(janeiro) a 11(dezembro)
		return data.getMonth()+1;
	}
	
	public int getAno(){
		// método retorna o ano da data menos 1900
		return data.getYear()+1900;
	}
	
	public String getEstado(){
		return estadoCliente;
	}
}
