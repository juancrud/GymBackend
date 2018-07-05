package com.juancrud.gym.services.mappers;

import org.springframework.stereotype.Component;

import com.juancrud.gym.dao.Person;
import com.juancrud.gym.dao.Trainer;
import com.juancrud.gym.services.models.TrainerModel;;

@Component
public class TrainerMapper implements IModelEntityMapper<TrainerModel, Trainer> {

	public TrainerModel mapEntityToModel(Trainer trainer) {
		TrainerModel trainerModel = new TrainerModel();
		trainerModel.setId(trainer.getId());
		trainerModel.setDocumentId(trainer.getPerson().getDocumentId());
		trainerModel.setName(trainer.getPerson().getName());
		trainerModel.setGender(trainer.getPerson().getGender());
		trainerModel.setBirthDay(trainer.getPerson().getBirthDay());
		trainerModel.setAddress(trainer.getPerson().getAddress());
		trainerModel.setEmailAddress(trainer.getPerson().getEmailAddress());
		trainerModel.setPhoneNumber(trainer.getPerson().getPhoneNumber());
		trainerModel.setStatus(trainer.getStatus());
		
		return trainerModel;
	}

	@Override
	public Trainer mapModelToEntity(TrainerModel trainerModel) {
		Person person = new Person();
		person.setDocumentId(trainerModel.getDocumentId());
		person.setName(trainerModel.getName());
		person.setGender(trainerModel.getGender());
		person.setBirthDay(trainerModel.getBirthDay());
		person.setAddress(trainerModel.getAddress());
		person.setEmailAddress(trainerModel.getEmailAddress());
		person.setPhoneNumber(trainerModel.getPhoneNumber());
		
		Trainer trainer = new Trainer();
		trainer.setId(trainerModel.getId());
		trainer.setStatus(trainerModel.getStatus());
		trainer.setPerson(person);
		
		return trainer;
	}

}
