package entities;

public class PessoaFisica extends Contribuinte{
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public double calculoImposto() {
		double result = 0;
		if(super.getRendaAnual() < 20000) {
			result += super.getRendaAnual() * 0.15;
		}else {
			result += super.getRendaAnual() * 0.25;
		}
		if(gastosComSaude > 0) {
			result -= gastosComSaude / 2;
		}
		
		return result;
	}
}
