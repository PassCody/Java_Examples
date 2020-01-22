package OOP.Lotto;

public class Numbers {
	private int[] lotterynumber = new int[5];
	private int[] specialnumbers = new int[2];
	
	public Numbers() {
		for (int lotteryI = 0; lotteryI != 5; lotteryI++) {
			setLotterynumber(lotterynumber, lotteryI);
		}
		for (int lotteryI = 0; lotteryI != 2; lotteryI++) {
			setSpecialnumbers(specialnumbers, lotteryI);
		}
		new Sort(getLotterynumber(), getSpecialnumbers(), this);
	}

	public int[] getLotterynumber() {
		return lotterynumber;
	}
	public void setLotterynumber(int[] lotterynumber, int lotteryI) {
		this.lotterynumber[lotteryI] = (int)((Math.random() * 50) + 1);
	}
	public void setLotterynumber(int[] lotterynumber) {
		this.lotterynumber = lotterynumber;
	}
	public int[] getSpecialnumbers() {
		return specialnumbers;
	}
	public void setSpecialnumbers(int[] specialnumbers, int lotteryI) {
		this.specialnumbers[lotteryI] = (int)((Math.random() * 10) + 1);
	}
	public void setSpecialnumbers(int[] specialnumbers) {
		this.specialnumbers = specialnumbers;
	}
	
}