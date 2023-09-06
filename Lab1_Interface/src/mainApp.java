
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner machine;
		Runner athlete;
		Runner politician;
		
		machine = new Machine();
		 machine.run();
		
		athlete = new Athlete();
		 athlete.run();
		
		politician = new PoliticalCandidate();
		politician.run();
		
	}

}
