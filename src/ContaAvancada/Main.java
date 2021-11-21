package ContaAvancada;

public class Main {

	public static void main(String[] args) {


		Banco b = new Banco ();
		b.setCodigo(2426);
		b.setNome("Banco do Brasil");
		b.setNumeroAgencias(555);
		
		Pessoa p = new Pessoa ();
		p.setEndereco("Taió");
		p.setNome("João");
		
		
		ContaBancaria cb = new ContaBancaria();
		cb.banco = b;
		cb.setAgencia(8067-7);
		cb.setNumeroconta(45759-5);
		cb.setSaldo(1000);
		cb.deposito(100);
		cb.saque(100);
		cb.correntista = p;
		System.out.println(cb);

	
		ContaSimples cs = new ContaSimples();
		cs.banco = b;
		cs.setAgencia(8067-7);
		cs.setNumeroconta(45759-5);
		cs.setSaldo(1000);
		cs.deposito(100);
		cs.saque(100);
		cs.correntista = p;
		cs.setSaldoPoupanca(1000);
		System.out.println(cs);
		
		CartaoDeCredito c = new CartaoDeCredito();
		c.setNumero(856);
		c.setOperadora("Bradesco");
		c.setLimite(1000);
		c.setTipoDeCartao("Premium");
		
		ContaEspecial ce = new ContaEspecial();
		ce.banco = b;
		ce.setAgencia(8067-7);
		ce.setNumeroconta(45759-5);
		ce.setSaldo(1000);
		ce.deposito(100);
		ce.saque(100);
		ce.correntista = p;
		ce.setDiasSemJuros(7);
		ce.setLimite(1000);
		ce.cartao = c;
		System.out.println(ce);
		
}
}