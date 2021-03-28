package pl.edu.pw.mini.po.fourth.hierarchy;

import pl.edu.pw.mini.po.fourth.hierarchy.letter.Letter;
import pl.edu.pw.mini.po.fourth.hierarchy.letter.LoveLetter;
import pl.edu.pw.mini.po.fourth.hierarchy.letter.NormalLetter;
import pl.edu.pw.mini.po.fourth.hierarchy.letter.PostCard;
import pl.edu.pw.mini.po.fourth.hierarchy.mailbox.MailBox;
import pl.edu.pw.mini.po.fourth.hierarchy.postman.Courier;
import pl.edu.pw.mini.po.fourth.hierarchy.postman.ErrandBoy;
import pl.edu.pw.mini.po.fourth.hierarchy.postman.NormalPostman;
import pl.edu.pw.mini.po.fourth.hierarchy.postman.Postman;

public class PolymorphismDemonstrator {
	
	public static void main(String[] args) {
		//tempMailboxes();
		//simulate();
		//instance();
		Letter letter = new NormalLetter(1, "");
		interfaceDemonstrator(letter);
		evaluateUniversity(Universities.PW);
	}

	private static int evaluateUniversity(Universities value) {
		
		switch(value) {
		case PW:
			System.out.println(value.getFullName());
		}
		
		return 1;
		
	}
	
	private static void interfaceDemonstrator(WeightInterface weightInterface) {
		weightInterface.getWeight();
	}

	private static void hierarchyDemonstrator(Letter letter) {
		letter.getWeight();
	}
	
	private static void castMe() {
		Letter firstLetter = new LoveLetter(0, "I luv u ");
		castIt(firstLetter);
	}
	
	private static void castIt(Letter letterToCast) {
		if(letterToCast instanceof NormalLetter) {
			NormalLetter normalLetter = (NormalLetter)letterToCast;
			System.out.println(" >>> " + normalLetter);
		} 
		
	}
	
	private static void instance() {
		
		Letter firstLetter = new LoveLetter(0, "I luv u ");
		
		Letter secondLetter = new LoveLetter(0, "Hello my dear!");
		secondLetter.getSerialNumber();
		Letter normalLetter = new NormalLetter(2, "What`s new?");
		Letter postCard = new PostCard(1, "Greetings from Warsaw!");
		
		checkWeight(secondLetter);
		checkWeight(firstLetter);
		checkWeight(normalLetter);
		checkWeight(postCard);
	}
	
	private static void checkWeight(Letter postman) {
		
		postman.getWeight();
		
		
		
		//Ostroznie z instanceof
		if(postman instanceof LoveLetter) {
			LoveLetter loveLetter = (LoveLetter)postman;
			
		} else if(postman instanceof NormalLetter) {
			NormalLetter loveLetter = (NormalLetter)postman;
			
		} else if(postman instanceof PostCard) {
			PostCard loveLetter = (PostCard)postman;
			
		} else {
			
		}
		
	}
	
	private static void simulate() {
		Letter firstLetter = new LoveLetter(0, "I luv u ");
		
		Letter secondLetter = new LoveLetter(0, "Hello my dear!");
		secondLetter.getSerialNumber();
		Letter normalLetter = new NormalLetter(2, "What`s new?");
		Letter postCard = new PostCard(1, "Greetings from Warsaw!");
		
		MailBox[] mailBoxes = generateMailboxes();
		
		Postman normalPostman = new NormalPostman(mailBoxes);
		Postman errandBoy = new ErrandBoy(mailBoxes);
		Postman courier = new Courier(mailBoxes);
		
		normalPostman.addMail(normalLetter);
		normalPostman.addMail(firstLetter);
		
		errandBoy.addMail(postCard);
		courier.addMail(secondLetter);
		
		normalPostman.provideLetters();
		errandBoy.provideLetters();
		courier.provideLetters();
		
	}

	private static MailBox[] generateMailboxes() {
		MailBox[] result; 
		
		result = new MailBox[3];
		result[0] = new MailBox();
		result[1] = new MailBox();
		result[2] = new MailBox();
		
		return result;
	}

	private static void tempMailboxes() {
		Letter letter = new LoveLetter(0, "I luv u ");
		MailBox mailBox = new MailBox();
		mailBox.accept(letter);
		
	}

}
