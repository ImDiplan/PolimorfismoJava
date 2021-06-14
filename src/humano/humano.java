package humano;

public abstract class humano {
	protected humano(){
		System.out.println("Se ha creado un humano");
	}
	public abstract void respirar();
	public abstract void caminar();
	public abstract void comer();
}

