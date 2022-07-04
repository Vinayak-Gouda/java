package Exp1;
import java.util.*;

public class MissedCallList {
	Scanner in = new Scanner(System.in);
	static ArrayList<MissedCall> mc = new ArrayList<MissedCall>();
	
	public MissedCallList() {
		while(true) {
			System.out.println("Enter yes to give missedcall..");
			if(in.nextLine().equals("yes")) {
				System.out.println("Enter Number:");
				long num = Long.parseLong(in.nextLine());
				if(mc.size()>4) {
					mc.remove(0);
				}
				mc.add(new MissedCall(num));
			}
			else {
				break;
			}
		}
	}
	public void viewLog() {
		Iterator<MissedCall> mi=mc.iterator();
		while(true) {
			System.out.println("Enter Option\n 1. delete any missedcall\n 2. display missedcall\n 3. Exit");
			int n = in.nextInt();
			in.nextLine();
			if(n==1) {
				System.out.println("Enter the number whose call you wish to delete..");
				long delph = Long.parseLong(in.nextLine());
				while(mi.hasNext()) {
					if(mi.next().ph==delph) {
						mi.remove();
						
					}
				}
				System.out.println("Successfully Deleted..");
			}
			else if(n==2) {
				for(MissedCall m:mc) {
					System.out.println(m);
				}
			}
			else {
				break;
			}
		}
	}

}
