package model.db.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Model;

@Entity
public class Section extends Model {
	@Id
	public long id;
	public int startHour;
	public int startMinute;
	public long day;
}
