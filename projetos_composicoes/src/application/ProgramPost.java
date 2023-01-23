package application;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class ProgramPost {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		LocalDateTime d05 = LocalDateTime.parse("2018-06-21T13:05");
		Post p1 = new Post(
				d05,
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	
		sc.close();
		}

	}
