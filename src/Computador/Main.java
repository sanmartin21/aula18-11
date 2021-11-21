package Computador;

public class Main {

	public static void main(String[] args) {

		// PlacaMae
		HD hd = new HD();
		hd.setMarca("Seagate");
		hd.setModelo("BarraCuda");
		hd.setCapacidade(1000);
		hd.setRpm(7200);

		Memoria m = new Memoria();
		m.setMarca("Pichau");
		m.setModelo("TEAM GROUP T-FORCE VULCAN");
		m.setCapacidade(8);
		m.setVelocidade(2666);

		Processador p = new Processador();
		p.setMarca("Intel");
		p.setModelo("Core i7");
		p.setClock(1200);
		p.setCache(12);

		PlacaMae pm = new PlacaMae();
		pm.setMarca("Gigabyte");
		pm.setModelo("AORUS ELITE");
		pm.processador = p;
		pm.hd = hd;
		pm.memoria = m;
		System.out.println(pm);

		// Computador

		Gabinete g = new Gabinete();
		g.setModelo("PICHAU KAZAN RGB");
		g.setTipo("Gamer");
		g.setBaias(7);
		g.placamae = pm;

		Monitor mo = new Monitor();
		mo.setMarca("LG");
		mo.setTipo("Curvo");
		mo.setResolucao("Full HD (1080p) 1920 x 1080 a 60 Hz");

		Teclado t = new Teclado();
		t.setMarca("Corsair");
		t.setTipo("Mecânico");

		Mouse mouse = new Mouse();
		mouse.setMarca("Logitech");
		mouse.setTipo("Gamer");

		Computador pc = new Computador();
		pc.setMarca("Pichau");
		pc.setModelo("UDYAT");
		pc.gabinete = g;
		pc.teclado = t;
		pc.mouse = mouse;
		pc.monitor = mo;
		System.out.println(pc);

		// EquipamentoEletronico

		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setTensao(120);
		ee.setConsumo(300);
		ee.setMarca("Pichau");
		ee.setModelo("UDYAT");
		ee.gabinete = g;
		ee.teclado = t;
		ee.mouse = mouse;
		ee.monitor = mo;
		System.out.println(ee);

	}

}
