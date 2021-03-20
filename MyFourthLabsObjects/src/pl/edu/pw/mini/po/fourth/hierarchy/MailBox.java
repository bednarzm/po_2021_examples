package pl.edu.pw.mini.po.fourth.hierarchy;

public class MailBox {
	
	public void accept(Letter letter) {
		
		System.out.println("Got the : " + letter + " " + letter.getSerialNumber());
	}
	
}
