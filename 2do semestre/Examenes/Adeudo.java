public class Adeudo{
	Pago p;
	public double monto=p.pago;
	public String fecha;
	public Adeudo(){
		//Monto();
	}
	public double Monto(double p, boolean ad){
		double pago=1.1;
		if(ad==true){
			pago=p*pago;
		}
		else{
			pago=p;
		}
		return pago;
	}

	public String Fecha(String fecha){
		return fecha;
	}
}