public class Merlin {
	
	private static Merlin theWizard;
	
	private Merlin(){
		
		}
		
	public static Merlin summon() {
		if (theWizard == null) {
			theWizard = new Merlin();
			}
		else {
			System.out.println(theWizard.consult());
			}	
		return theWizard;	
		}
	public String consult() {
		return "You're a wizard Harry!!";
		}		
	
	public static void main (String[] args) {
		
		summon();
		System.out.println(theWizard.consult());
		
		}
	
	}
