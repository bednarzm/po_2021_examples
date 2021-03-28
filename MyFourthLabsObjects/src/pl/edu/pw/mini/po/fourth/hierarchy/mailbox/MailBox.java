package pl.edu.pw.mini.po.fourth.hierarchy.mailbox;

import pl.edu.pw.mini.po.fourth.hierarchy.letter.Letter;

public class MailBox {
	
	public void accept(Letter letter) {
		
		System.out.println("Got the : " + letter + " " + letter.getSerialNumber());
	}
	
}
