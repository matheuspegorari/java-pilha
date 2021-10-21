
public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int x, int y, int z){
		this.dia = x;
		this.mes = y;
		this.ano = z;		
	}
	
	public boolean bissexto() {
		if ((this.ano % 4) == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
