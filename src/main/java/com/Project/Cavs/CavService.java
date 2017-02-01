package com.Project.Cavs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CavService {
	
	@Autowired
	private CavalierRepository cavalierRepository;

	public List<Cavalier> getAllPlayers() {
		List<Cavalier> cavaliers = new ArrayList<>();
		cavalierRepository.findAll()
		.forEach(cavaliers:: add);
		return cavaliers;
	}
	
	public Cavalier getPlayer(String id) {
		return cavalierRepository.findOne(id);
	}

	public void addPlayer(Cavalier cavalier) {
		cavalierRepository.save(cavalier);
		
	}

	public void updatePlayer(Long id, Cavalier cavalier) {
		cavalierRepository.save(cavalier);
		
	}

	public void deletePlayer(String id) {
		cavalierRepository.delete(id);
	}

}
