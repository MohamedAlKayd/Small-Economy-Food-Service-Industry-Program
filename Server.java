// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Server -

// - Start of the Program -

public class Server extends Staff {
	private int targetTipPct;

// - Server Constructor -
	public Server(String name, int targetTipPct){
		super(name, false);
		this.targetTipPct = targetTipPct;
	}

// - Function to get the target tip percentage -
	public int getTargetTipPct() {
		return targetTipPct;
	}
}

// - End of the Program -