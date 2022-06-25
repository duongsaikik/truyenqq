package truyenQQ.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class commentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private int likes;

	@Column
	private int user_id;

	@Column
	private String userName;

	
	@Column
	private Date createDate;
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getLike() {
		return likes;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setLike(int likes) {
		this.likes = likes;
	}

	public int getId() {
		return id;
	}

	@OneToMany(mappedBy = "answerComments")
	private List<answerCommentEntity> anwsersOfCM = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "story_id")
	private storyEntity commentAll;

	@ManyToOne
	@JoinColumn(name = "chapter_id")
	private chapterEntity chaptersComment;

}
