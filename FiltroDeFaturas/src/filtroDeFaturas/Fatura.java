package filtroDeFaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
	
	protected String codigo;
	protected double valor ;
	protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	protected Date data = new Date();
	protected Cliente cliente;
	
	public Fatura(String cod, double val, String dataFatura, Cliente clienteFatura){
		this.codigo = cod;
		this.valor = val;
		try {
			this.data = sdf.parse(dataFatura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.cliente = clienteFatura;
	}
	
	public String getCodigo(){
		return codigo;
	}
	
	public double getValor(){
		return valor;
	}
	
	public int getDia(){
		return data.getDate();
	}
	
	public int getMes(){
		return data.getMonth()+1;
	}
	
	public int getAno(){
		return data.getYear()+1900;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
}
