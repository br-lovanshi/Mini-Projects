package com.masai.Services;

import com.masai.Exception.EventNotFoundException;
import com.masai.Model.Event;

public interface EventServices {

	public Event createEvent(Event event);
	
	public Event updateEventById(Event event) throws EventNotFoundException;
	
	public Event deleteEventById(Integer id) throws EventNotFoundException;
}
