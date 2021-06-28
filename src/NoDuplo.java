
public class NoDuplo {

	private int info;
	private NoDuplo anterior;
	private NoDuplo proximo;

	public NoDuplo() {}

	public NoDuplo(int info) {
		this.setInfo(info);
		this.setProximo(null);
		this.setAnterior(null);
	}

	public int getInfo() {
		return this.info;
	}

	public NoDuplo getAnterior() {
		return this.anterior;
	}

	public NoDuplo getProximo() {
		return this.proximo;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}

	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "[" + this.info + "] ";
	}

}