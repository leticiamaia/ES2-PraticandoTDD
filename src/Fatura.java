import java.util.Date;

public class Fatura {

	private String codigo;
	private Double valor;
	private Date data;
	private Cliente cliente;

	public Fatura(String codigo, Double valor, Date data, Cliente cliente) {
		this.setCodigo(codigo);
		this.setValor(valor);
		this.setData(data);
		this.setCliente(cliente);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
