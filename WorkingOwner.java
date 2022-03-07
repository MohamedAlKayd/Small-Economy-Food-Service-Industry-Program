// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Working Owner -

// - Start of the Program -

public class WorkingOwner extends Owner {

    private int targetTipPct;

    public WorkingOwner(String name, int targetTipPct) {
        super(name);
        this.targetTipPct = targetTipPct;
    }

    public int getTargetTipPct() {
        return targetTipPct;
    }
}

// - End of the Program -