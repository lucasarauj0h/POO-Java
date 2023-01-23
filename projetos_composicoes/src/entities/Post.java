package entities;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	private LocalDateTime moment;
	private String title;
	private String content;
	private int like;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(LocalDateTime moment, String title, String content, int like) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}
	
	public List<Comment> getComment(){
		return comments;
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(like);
		sb.append(" Likes - ");
		sb.append(fmt.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
}
