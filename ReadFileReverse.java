// Implementer une classe pour afficher le fichier à l'envers (lignes)
public class ReadFileReverse extends ReadFile {
	public ReadFileReverse(String name)
	{
		super(name);
	}
	
	public void show()
	{
		for(int i = super.getContent().size() - 1; i >= 0; i--) {
			System.out.println(this.getContent().get(i));
		}
	}
}
	