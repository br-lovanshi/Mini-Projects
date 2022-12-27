package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.masai.Exception.EventNotFoundException;

import com.masai.Model.Event;
import com.masai.Services.EventServices;

@RestController
@RequestMapping("/masaicalender")
public class EventController {

	@Autowired
	private EventServices eService;
	
	@PostMapping("/event")
	public ResponseEntity<Event>registerEventHandler(@RequestBody Event event) throws EventNotFoundException{
	Event savedEvent=eService.createEvent(event);
		return new ResponseEntity<Event>(savedEvent,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/event/{eventid}")
	public ResponseEntity<Event> deleteEventByIdHandler(@PathVariable("eventid")Integer id)throws EventNotFoundException{
	Event deletedEvent=eService.deleteEventById(id);
	return new ResponseEntity<Event>(deletedEvent,HttpStatus.OK);
	}
	
	@PutMapping("/event")
	public ResponseEntity<Event> updateBookHandler(@RequestBody Event event)throws EventNotFoundException{
		Event updatedEvent=eService.updateEventById(event);
		return new ResponseEntity<Event>(updatedEvent,HttpStatus.ACCEPTED);
	}
}
