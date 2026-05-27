package entities;

public class PessoaJuridica extends Contribuinte{
	private Integer qtdFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public Integer getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(Integer qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	@Override
	public double calculoImposto() {
		if(qtdFuncionarios <= 10) {
			return super.getRendaAnual() * 0.16;
		}else {
			return super.getRendaAnual() * 0.14;
		}
	}
}
