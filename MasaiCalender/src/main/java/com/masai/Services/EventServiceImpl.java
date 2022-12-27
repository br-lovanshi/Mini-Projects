package com.masai.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.masai.Exception.EventNotFoundException;

import com.masai.Model.Event;
import com.masai.Repository.EventRepository;

@Service
public class EventServiceImpl implements EventServices{

	@Autowired
	private EventRepository eRepo;
	
	@Override
	public Event createEvent(Event event) {
		Event saveevent=eRepo.save(event);
		return saveevent;
	}

	@Override
	public Event updateEventById(Event event) throws EventNotFoundException {
		Optional<Event> opt=eRepo.findById(event.getEventId());
		if(opt.isPresent()) {
			Event updatedEvent=eRepo.save(event);
			return updatedEvent;
		}else
			throw new EventNotFoundException("Invalid Event Details");
	}

	@Override
	public Event deleteEventById(Integer id) throws EventNotFoundException {
		Optional<Event> opt=eRepo.findById(id);
		if(opt.isPresent()) {
			Event existingEvent=opt.get();
			eRepo.delete(existingEvent);
			return existingEvent;
		}else
			throw new EventNotFoundException("Event Does Not Exist with the id "+id);
	}

}
