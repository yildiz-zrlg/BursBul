package com.example.BursBul.Service;

import com.example.BursBul.Model.Universite;
import com.example.BursBul.Repository.UniversiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteService {
    private UniversiteRepository universiteRepository;

    public UniversiteService(UniversiteRepository universiteRepository) {
        this.universiteRepository = universiteRepository;
    }
    public Universite createUniversite(Universite universite){
        return universiteRepository.save(universite);
    }
    public List<Universite> findAllUniversite(){
        return universiteRepository.findAll();
    }
    public Universite getUniversiteById(String universiteId){
        return  universiteRepository.findById(universiteId).orElse(null);
    }
    public Universite updateUniversite(String universiteId,Universite universite){
        Universite lastUniversite=this.universiteRepository.findById(universiteId).get();
        lastUniversite.setUniversiteAdi(universite.getUniversiteAdi());
        lastUniversite.setUniversiteGano(universite.getUniversiteGano());
        lastUniversite.setUniversiteSinif(universite.getUniversiteSinif());
        return universiteRepository.save(lastUniversite);
    }
    public void deleteUniversiteById(String universiteId){
        universiteRepository.deleteById(universiteId);
    }
}
