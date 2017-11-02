package model.db;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import model.db.entity.Section;

public class IrrigationStorage {

	private EbeanServer ebean;

	@Inject
	public IrrigationStorage() {
		this.ebean = Ebean.getDefaultServer();
	}

	public List<Section> getSections() {
		return ebean.find(Section.class).findList();
	}

	public Section getSection(long id) {
		Section section = ebean.find(Section.class, id);
		if (section == null) {
			throw new EntityNotFoundException();
		}
		return section;
	}

	public Section createSection(Section requestSection) {
		ebean.insert(requestSection);
		return requestSection;
	}

	public Section editSection(Section requestSection) {
		if (getSection(requestSection.id) == null) {
			throw new EntityNotFoundException();
		}
		ebean.update(requestSection);
		return requestSection;
	}

	public void deleteSection(long id) {
		if (ebean.delete(Section.class, id) == 0) {
			throw new EntityNotFoundException();
		}
	}
}
