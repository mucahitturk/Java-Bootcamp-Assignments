package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KrediUI krediUI = new KrediUI();
		krediUI.CalculateKredi(new OgretmenKrediManager());
		krediUI.CalculateKredi(new AskerKrediManager());
		krediUI.CalculateKredi(new TarimKrediManager());
	}

}
