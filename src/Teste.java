
public class Teste {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		
		lista.insereInicio(10);
		lista.insereInicio(15);
		lista.insereInicio(20);
		System.out.println(lista);
		lista.insereFim(5);
		System.out.println(lista);
		lista.removeFim();
		System.out.println(lista);
	}

}
