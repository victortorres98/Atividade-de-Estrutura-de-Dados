
public class ListaDupla {
	private NoDuplo primeiro;
	private NoDuplo ultimo;

	public ListaDupla() {
		this.primeiro = null;
		this.ultimo = null;
	}

	public NoDuplo getPrimeiro() {
		return primeiro;
	}

	public NoDuplo getUltimo() {
		return ultimo;
	}

	public void setPrimeiro(NoDuplo primeiro) {
		this.primeiro = primeiro;
	}

	public void setUltimo(NoDuplo ultimo) {
		this.ultimo = ultimo;
	}

	public boolean listaVazia() {
		return this.primeiro == null;
	}

	public void insereInicio(int info) {
		NoDuplo novo = new NoDuplo(info);
		if (!listaVazia()) {
			novo.setProximo(this.primeiro);
			this.primeiro.setAnterior(novo);

		} else {
			this.setUltimo(novo);
		}
		this.setPrimeiro(novo);
	}

	public void insereFim(int i) {

		NoDuplo novo = new NoDuplo(i);
		if (this.listaVazia()) {
			this.setPrimeiro(novo);
		} else {
			novo.setAnterior(this.ultimo);
			this.ultimo.setProximo(novo);

		}
		this.setUltimo(novo);
	}

	public int removeDoInicio() {
		int intAux = this.primeiro.getInfo();
		this.primeiro = this.primeiro.getProximo();

		if (listaVazia()) {
			this.setUltimo(null);
		}
		return intAux;
	}

	public int removeFim() {
		int intAux = this.ultimo.getInfo();
		this.ultimo = this.ultimo.getAnterior();
		if (this.ultimo == this.primeiro) {
			this.setPrimeiro(null);
			this.setUltimo(null);
		} else {
			this.ultimo.setProximo(null);
			System.out.println("Removido do fim da lista: " + intAux);
			System.out.println("Novo ultimo da lista: " + this.ultimo.getInfo());
		}
		return intAux;
	}

	@Override

	public String toString() {
		String s = "Lista: ";
		if (listaVazia()) {
			s = s + "está vazia!";
		} else {
			NoDuplo aux = this.primeiro;
			while (aux != null) {
				s = s + aux + " -> ";
				aux = aux.getProximo();
			}
			s += "//";
		}
		return s;
	}

}
