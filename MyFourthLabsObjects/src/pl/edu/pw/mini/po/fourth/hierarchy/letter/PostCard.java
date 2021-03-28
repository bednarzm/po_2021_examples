package pl.edu.pw.mini.po.fourth.hierarchy.letter;

public class PostCard extends Letter {
	
	public PostCard() {
		super(1, "");
	}
	public PostCard(int a, String text) {
		super(a, text);
	}

	@Override
	public String toString() {
		return "PostCard";
	}
	
}
