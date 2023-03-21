package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService {
    
    @Autowired
    SkillRepository skillRepository;
    
    public void save(Skill skill){
        skillRepository.save(skill);
    }
    
    public void delete(Integer id){
        skillRepository.deleteById(id);
    }
    
    public Optional<Skill> getOne(Integer id){
        return skillRepository.findById(id);
    }
    
    public Optional<Skill> getByNameSkill (String nameSkill){
        return skillRepository.findByNameSkill(nameSkill);
    }
    
    public List<Skill> list(){
        return skillRepository.findAll();
    }
    
    public boolean existById(Integer id){
        return skillRepository.existsById(id);
    }
    
    public boolean existsByNameSkill(String nameSkill){
        return skillRepository.existsByNameSkill(nameSkill);         
    }
}
