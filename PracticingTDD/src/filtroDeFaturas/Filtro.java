package filtroDeFaturas;

import java.util.ArrayList;
import java.util.Date;

public class Filtro {
	
	ArrayList<Fatura> faturasParaFiltrar;
	ArrayList<Fatura> faturasFiltradas;
	
	public Filtro(ArrayList<Fatura> faturas){
		this.faturasParaFiltrar = faturas;
		this.faturasFiltradas = new ArrayList<Fatura>();
		this.filtrar();
	}
	
	public void filtrar(){
		for (Fatura ftr: this.faturasParaFiltrar){
			if (conditionOne(ftr)){
				if (conditionTwo(ftr)){
					if(conditionThree(ftr)){
						if(conditionFour(ftr)){
							faturasFiltradas.add(ftr);
						}
					}
				}
			}
		}
	}
	
	public boolean conditionOne(Fatura fatr){
		if (fatr.getValor()<2000.0){
			return false;
		}
		return true;
	}
	
	public boolean conditionTwo(Fatura fatr){
		if (fatr.getValor()>2000.0 && fatr.getValor()<2500.0){
			Date data = new Date();
			int mesAtual = data.getMonth()+1;
			int diaAtual = data.getDate();
			
			if(mesAtual-1<fatr.getMes()){
				return false;
			}else if(mesAtual-1==fatr.getMes()){
				if(diaAtual<fatr.getDia()){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean conditionThree(Fatura fatr){
		if(fatr.getValor()>2500.0 && fatr.getValor()<3000.0){
			Date data = new Date();
			int mesAtual = data.getMonth()+1;
			int diaAtual = data.getDate();
			
			if(mesAtual-2<fatr.getCliente().getMes()){
				return false;
			}else if(mesAtual-2==fatr.getCliente().getMes()){
				if(diaAtual<fatr.getCliente().getDia()){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean conditionFour(Fatura fatr){
		if(fatr.getValor()>4000.0){
			if(fatr.getCliente().getEstado()=="Paraná" || fatr.getCliente().getEstado()=="Rio Grande do Sul" || fatr.getCliente().getEstado()=="Santa Catarina"){
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Fatura> getFaturas(){
		return this.faturasFiltradas;
	}
}
