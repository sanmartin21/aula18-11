package CarroMotorPessoa;

public class Motor {
	
	private String marca;
	private float potencia;
	private int cilindros;
	private String combustivel;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length()>0)
		this.marca = marca;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		if (potencia >=0)
		this.potencia = potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		if (cilindros >=0)
		this.cilindros = cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		if (combustivel.length()>0)
		this.combustivel = combustivel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [marca=");
		builder.append(marca);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
