package hrmsproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.hrms.business.abstracts.jobpositionsService;
import hrmsproject.hrms.entities.concretes.jobpositions;

@RestController
@RequestMapping("/api/jobpositions")
public class jobpositionsController {
	private jobpositionsService jobPositionsService;
	
	@Autowired
	public jobpositionsController(jobpositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}

	@GetMapping("/getAll")
	public List<jobpositions> getAll(){
		return this.jobPositionsService.getAll();
	}
}
