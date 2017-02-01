package com.Project.Cavs;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CavController {
	
	@Autowired
	private CavService cavService;
	
	@RequestMapping("/api/players")
	public List<Cavalier> getAllPlayers() {
		return cavService.getAllPlayers();
	}
	
	@RequestMapping("/api/players/{id}")
	public Cavalier getPlayer(@PathVariable String id) {
		return cavService.getPlayer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/players")
	public void addPlayer(@RequestBody Cavalier cavalier ) {
		cavService.addPlayer(cavalier);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/players/{id}")
	public void updatePlayer(@RequestBody Cavalier cavalier, @PathVariable Long id) {
		cavService.updatePlayer(id, cavalier);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/players/{id}")
	public void deletePlayer(@PathVariable String id) {
		cavService.deletePlayer(id);
	}

}
