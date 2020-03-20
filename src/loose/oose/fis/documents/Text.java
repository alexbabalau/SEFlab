package loose.oose.fis.documents;

public class Text extends Document{

	public Text(String[] continut) {
		super(continut);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] analizeaza() {
		return this.continut;
	}
	
}
