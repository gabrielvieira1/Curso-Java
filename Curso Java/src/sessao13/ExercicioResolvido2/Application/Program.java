package sessao13.ExercicioResolvido2.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import sessao13.ExercicioResolvido2.Entities.Comment;
import sessao13.ExercicioResolvido2.Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice tip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2020 13:05:44"), 
				"Traveling to new Zealand",
				"I'm going to visit this wonderful county!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("28/07/2020 23:14:19"), 
				"Good night guys",
				"See you tomorrow",
				20);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.removeComment(c2);
		p2.removeComment(c3);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
