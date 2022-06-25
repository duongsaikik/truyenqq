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
@Table(name = "Category")

public class storyCategoryEntity extends baseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String nameCategory;


	@ManyToMany(mappedBy = "categories")
	private List<storyEntity> stories = new ArrayList<>();

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
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

}
