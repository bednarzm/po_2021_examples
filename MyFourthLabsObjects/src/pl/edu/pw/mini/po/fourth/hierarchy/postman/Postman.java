package pl.edu.pw.mini.po.fourth.hierarchy.postman;

import pl.edu.pw.mini.po.fourth.hierarchy.letter.Letter;
import pl.edu.pw.mini.po.fourth.hierarchy.mailbox.MailBox;

public abstract class Postman {
	
	protected Letter letters[] = new Letter[10];
	private int currentIndex;
	protected MailBox mailBoxes[];
	
	public Postman(MailBox[] mailBoxes) {
		this.mailBoxes = mailBoxes;
	}
	
	public void addMail(Letter letter) {
		letters[currentIndex++] = letter;
	}

	public void provideLetters() {
		
		for(int i=0;i<currentIndex;i++) {
			
			Letter letter = letters[i];
			int index = letter.getAddress().getMailboxIndex();
			MailBox mailBox = mailBoxes[index];
			mailBox.accept(letter);
			
			/*
			Letter letter = letters[i];
			mailBoxes[letter.getAddress().getMailboxIndex()].accept(letter);
			*/
		
		}
		
	}

}
