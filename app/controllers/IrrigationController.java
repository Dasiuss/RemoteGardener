package controllers;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;

import model.db.IrrigationStorage;
import model.db.entity.Section;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class IrrigationController extends Controller {
	private IrrigationStorage irrigationStorage;

	@Inject
	public IrrigationController(IrrigationStorage irrigationStorage) {
		this.irrigationStorage = irrigationStorage;
	}

	public Result getSections() {
		return ok(Json.toJson(irrigationStorage.getSections()));
	}

	public Result getSection(long id) {
		try {
			return ok(Json.toJson(irrigationStorage.getSection(id)));
		} catch (EntityNotFoundException e) {
			return notFound("Entity not found");
		}
	}

	public Result createSection() {
		Section section = Json.fromJson(request().body().asJson(), Section.class);
		section.id = 0;
		return created(Json.toJson(irrigationStorage.createSection(section)));
	}

	public Result editSection(long id) {
		Section section = Json.fromJson(request().body().asJson(), Section.class);
		section.id = id;
		try {
			return ok(Json.toJson(irrigationStorage.editSection(section)));
		} catch (EntityNotFoundException e) {
			return notFound("Entity not found");
		}
	}

	public Result deleteSection(long id) {
		try {
			irrigationStorage.deleteSection(id);
			return ok();
		} catch (EntityNotFoundException e) {
			return notFound("Entity not found");
		}
	}

}
