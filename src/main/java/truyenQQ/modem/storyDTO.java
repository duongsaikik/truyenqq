package truyenQQ.modem;

import java.util.List;

import truyenQQ.entity.storyCategoryEntity;

public class storyDTO extends baseDTO {

	private int id;

	private int status;
	private String review;

	private int views;

	private String nameStory;

	private List<storyCategoryEntity> categories;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNameStory() {
		return nameStory;
	}

	public void setNameStory(String nameStory) {
		this.nameStory = nameStory;
	}

	public List<storyCategoryEntity> getTypes() {
		return categories;
	}

	public void setTypes(List<storyCategoryEntity> categories) {
		this.categories = categories;
	}

}