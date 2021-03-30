package com.example.object;

public class Course {
	
	String title;
	int duration; // Hours

	public Course() {
	}

	public Course(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (duration != other.duration)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	
	
	/*public String toString() {
		return "Course [title=" + title + ", duration=" + duration + "]";
	}*/

}
