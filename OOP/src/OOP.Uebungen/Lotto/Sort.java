package OOP.Lotto;

public class Sort {
	private int helper, jumper, jumperII;

	public Sort(int[] lotterynumber, int[] specialnumbers, Numbers number) {
		number.setLotterynumber(sortLotterynumber(lotterynumber));
		number.setSpecialnumbers(sortSpecialnumbers(specialnumbers));
		new Print(number.getLotterynumber(), number.getSpecialnumbers());
	}

	public int[] sortLotterynumber(int[] lotterynumber) {
		for (int i = 0; i != 5; i++) {
			for (int lotteryII = 0; lotteryII != 4; lotteryII++) {
				this.helper = lotteryII + 1;
				if (lotterynumber[lotteryII] == lotterynumber[this.helper]) {
					lotterynumber[this.helper] = (int) ((Math.random() * 50) + 1);
				} else {
					if (lotterynumber[lotteryII] > lotterynumber[helper]) {
						this.jumper = lotterynumber[this.helper];
						lotterynumber[this.helper] = lotterynumber[lotteryII];
						lotterynumber[lotteryII] = this.jumper;
					}
				}
			}
		}
		return lotterynumber;
	}

	public int[] sortSpecialnumbers(int[] specialnumbers) {
		for (int i = 1; i != 0; i++) {
			for (int specialnumbersII = 0; specialnumbersII != 1; specialnumbersII++) {
				if (specialnumbers[0] == specialnumbers[1]) {
					specialnumbers[1] = (int) ((Math.random() * 10) + 1);
					if (specialnumbers[0] > specialnumbers[1]) {
						this.jumperII = specialnumbers[1];
						specialnumbers[1] = specialnumbers[0];
						specialnumbers[0] = this.jumperII;
					}
				} else {
					if (specialnumbers[0] > specialnumbers[1]) {
						this.jumperII = specialnumbers[1];
						specialnumbers[1] = specialnumbers[0];
						specialnumbers[0] = this.jumperII;
					} else {
						break;
					}
				}
			}
			if (specialnumbers[0] != specialnumbers[1]) {
				break;
			}
		}
		return specialnumbers;
	}
}