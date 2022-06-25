package truyenQQ.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class authorEntity extends baseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String nameAuthor;

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public List<storyEntity> getStories() {
		return stories;
	}

	public void setStories(List<storyEntity> stories) {
		this.stories = stories;
	}

	public int getId() {
		return id;
	}

	@ManyToMany(mappedBy = "authors")
	private List<storyEntity> stories = new ArrayList<>();

}
