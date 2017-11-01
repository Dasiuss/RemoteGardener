package controllers;

import javax.inject.Inject;

import model.db.IrrigationStorage;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class IrrigationController extends Controller {
	private IrrigationStorage irrigationStorage;

	@Inject
	public IrrigationController(IrrigationStorage irrigationStorage) {
		this.irrigationStorage = irrigationStorage;
	}

	public Result getSections(){
		return ok(Json.toJson(irrigationStorage.getAllSections()));
	}

}
