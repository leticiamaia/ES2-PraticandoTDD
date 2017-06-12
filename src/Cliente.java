import java.util.Date;

public class Cliente {

	private String nome;
	private Date dataDeInclusão;
	private Estado estado;

	public Cliente(String nome, Date dataDeInclusão, Estado estado) {
		this.setNome(nome);
		this.setDataDeInclusão(dataDeInclusão);
		this.setEstado(estado); 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeInclusão() {
		return dataDeInclusão;
	}

	public void setDataDeInclusão(Date dataDeInclusão) {
		this.dataDeInclusão = dataDeInclusão;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
