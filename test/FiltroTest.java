import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FiltroTest {
	
	Filtro filtro;
	List<Fatura> faturas;
	Double valor;
	String codigo;
	Estado estado;
	String nome;
	Date dataDeInclusão;
	Cliente cliente;
	Date data;
	Fatura fatura1;
	
	
	@Before
	public void setUp() {
		filtro = new Filtro();
		faturas = new LinkedList<Fatura>();
		valor = 3000.0;
		codigo = "1";
		estado = Estado.AC;
		nome = "Hello";
		dataDeInclusão = new Date(117, 12, 14);
		data = new Date(117, 1, 14);
	}
	
	@Test
	public void testaCondicao1() { 
		valor = 100.0;
		cliente = new Cliente(nome, dataDeInclusão, estado);
		fatura1 = new Fatura(codigo, valor, data, cliente); 
		faturas.add(fatura1);
		
		Assert.assertEquals(0, (filtro.filtrar(faturas).size()));
	}
	
	@Test
	public void testaCondicao2() { 
		valor = 2100.0;
		cliente = new Cliente(nome, dataDeInclusão, estado);
		fatura1 = new Fatura(codigo, valor, data, cliente); 
		faturas.add(fatura1);
		
		Assert.assertEquals(0, (filtro.filtrar(faturas).size()));
	}
	
	@Test
	public void testaCondicao3() { 
		valor = 2600.0;
		cliente = new Cliente(nome, dataDeInclusão, estado);
		fatura1 = new Fatura(codigo, valor, data, cliente); 
		faturas.add(fatura1);
		
		Assert.assertEquals(0, (filtro.filtrar(faturas).size()));
	}
	
	@Test
	public void testaCondicao4() { 
		valor = 4010.0;
		estado = Estado.RS;
		cliente = new Cliente(nome, dataDeInclusão, estado);
		fatura1 = new Fatura(codigo, valor, data, cliente); 
		faturas.add(fatura1);
		
		Assert.assertEquals(0, (filtro.filtrar(faturas).size()));
	}
}
