package CarroMotorPessoa;

public class Main {

	public static void main(String[] args) {

	
		Motor m = new Motor();
		m.setMarca("Toyota");
		m.setPotencia(100);
		m.setCilindros(100);
		m.setCombustivel("Diesel");
		
		
		Pessoa p = new Pessoa();
		p.setEndereco("Taió");
		p.setNome("João");
		
		Carro c =  new Carro();
		c.setFabricante("Toyota");
		c.setModelo("SW4");
		c.setCor("Branca");
		c.setAno(2017);
		c.dono = p;
		c.motor = m;
		
		System.out.println( c );
		

	}

}
