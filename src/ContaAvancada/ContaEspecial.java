package ContaAvancada;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	private int diasSemJuros;
	protected CartaoDeCredito cartao;

	public ContaEspecial() {
		cartao = new CartaoDeCredito();
	}
	
	

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}



	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}



	public CartaoDeCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [limite=");
		builder.append(limite);
		builder.append(", diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
