package ClasseAbstrata;

 class Cidade {

	private String nome;
	private Estado estado;
	
	public Cidade(String nome, Estado estado) {
	this.nome = nome;
	this.estado = estado;
	}
	
    public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setestado(Estado estado) {
		this.estado = estado;

	}

}