package truyenQQ.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "story")
public class storyEntity extends baseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private int status;

	@Column
	private String review;

	@Column
	private int views;

	@Column
	private String nameStory;

	public String getNameStory() {
		return nameStory;
	}

	public void setNameStory(String nameStory) {
		this.nameStory = nameStory;
	}

	public List<storyCategoryEntity> getCategories() {
		return categories;
	}

	public void setCategories(List<storyCategoryEntity> categories) {
		this.categories = categories;
	}

	public List<chapterEntity> getChapters() {
		return chapters;
	}

	public void setChapters(List<chapterEntity> chapters) {
		this.chapters = chapters;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getId() {
		return id;
	}

	public List<commentEntity> getComments() {
		return comments;
	}

	public void setComments(List<commentEntity> comments) {
		this.comments = comments;
	}

	public List<authorEntity> getAuthors() {
		return authors;
	}

	public void setAuthors(List<authorEntity> authors) {
		this.authors = authors;
	}

	@ManyToMany
	@JoinTable(name = "story_category", joinColumns = @JoinColumn(name = "story_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private List<storyCategoryEntity> categories = new ArrayList<>();

	@OneToMany(mappedBy = "commentAll")
	private List<commentEntity> comments = new ArrayList<>();

	@OneToMany(mappedBy = "storyChapters")
	private List<chapterEntity> chapters = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "story_author", joinColumns = @JoinColumn(name = "story_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	private List<authorEntity> authors = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "user_id")
	private userEntity publishers;
}
