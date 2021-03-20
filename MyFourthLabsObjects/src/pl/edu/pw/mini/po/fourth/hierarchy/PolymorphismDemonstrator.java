package pl.edu.pw.mini.po.fourth.hierarchy;

public class PolymorphismDemonstrator {

	public static void main(String[] args) {
		
		Letter letter = new Letter();
		
		LoveLetter loveLetter = new LoveLetter();
		loveLetter.getSerialNumber();
		NormalLetter normalLetter = new NormalLetter();
		PostCard postCard = new PostCard();
		
		MailBox mailBox = new MailBox();
		mailBox.accept(letter);
		mailBox.accept(loveLetter);
		mailBox.accept(normalLetter);
		mailBox.accept(postCard);
	}
	

}
