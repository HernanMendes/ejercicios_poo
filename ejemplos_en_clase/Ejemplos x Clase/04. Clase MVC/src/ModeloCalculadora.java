

// Este Modelo contiene los datos y ejecuta todos los cálculos necesarios, ni siquiera sabe que la Vista existe.

public class ModeloCalculadora {
	
	// Guarda el valor de la suma de los números ingresados en la vista.
	
	private int valorCalculo;
	
	// Ejecuta el método necesario para la suma
	
	public void sumarDosNumeros(int primerNro, int segundoNro, String simbolo) {
		
		System.out.println(simbolo);
		if (simbolo.compareTo("+") == 0) 
			setValorCalculo(primerNro + segundoNro);
		else if (simbolo.compareTo("-") == 0) 
			setValorCalculo(primerNro - segundoNro);
  	    else if (simbolo.compareTo("/") == 0) 
				setValorCalculo(primerNro / segundoNro);
  	    else if (simbolo.compareTo("*") == 0) 
				setValorCalculo(primerNro * segundoNro);
   	    else System.out.println("error de analisis");
		
	}
	
	// getter
	public int getValorCalculo() {
		
		// Proporciona acceso a los datos
		
		return valorCalculo;
		
	}
	public int setValorCalculo(int val) {
		
		// Proporciona acceso a los datos
		
		return valorCalculo=val;
		
	}
}
