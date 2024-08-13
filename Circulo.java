package calculadoraCirculo;

public class Circulo implements IForma {
	
	 private double radio;

	 public Circulo() {
		 this.radio = 0;
	 }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio,2);
	}

}
