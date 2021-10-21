package com.trelloclone.trelloclone.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trelloclone.trelloclone.models.Workspace;
import com.trelloclone.trelloclone.repositories.WorkspaceRepository;
import com.trelloclone.trelloclone.wrappers.ResponseMessage;

@RestController
@RequestMapping("/workspace")
public class WorkspaceController {
	
	@Autowired
	private WorkspaceRepository workspaceRepository; 
	
	@GetMapping("/")
	public ResponseEntity getAllWorkspace() {
		
		List<Workspace> httpResult = this.workspaceRepository.findAll();
		return ResponseMessage.success(httpResult);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getSingleWorkspace(
			@PathVariable("id") int id
	) {
		
		Optional<Workspace> httpResult = this.workspaceRepository.findById(id);
		if(httpResult.isPresent()) {
			return ResponseMessage.success(httpResult.get());
		}
		
		return ResponseMessage.notFound();
	}	
	
	@PostMapping("/")
	public ResponseEntity createWorkspace(
			@RequestBody Workspace entity
	) {

		var httpResult = this.workspaceRepository.save(entity);
		return ResponseMessage.success("Workflow create successfuly", httpResult);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity updateWorkspace(
			@RequestBody Workspace entity, 
			@PathVariable("id") int id
	) {
		
		Optional<Workspace> httpResult =  this.workspaceRepository.findById(id);
		
		if(httpResult.isPresent()) {
			Workspace existingEntity = httpResult.get();
			existingEntity.setTitle(entity.getTitle());
			existingEntity.setDescription(entity.getDescription());
			existingEntity.setType(entity.getType());
			return ResponseMessage.success("Workflow updated successfuly", httpResult);
		}
		
		return ResponseMessage.notFound();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity removeWorkspace(
			@PathVariable("id") int id
	) {
		
		Optional<Workspace> httpResult = this.workspaceRepository.findById(id);
		if(httpResult.isPresent()) {
			this.workspaceRepository.deleteById(id);
			return ResponseMessage.success("Workflow removed successfuly");
		}
		
		return ResponseMessage.notFound("Workflow does not exists");
	}
}
