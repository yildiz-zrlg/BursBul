package com.example.BursBul.Service;

import com.example.BursBul.Model.Sahis;
import com.example.BursBul.Model.Sahisbursverme;
import com.example.BursBul.Repository.SahisbursvermeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SahisbursvermeService {
    private SahisbursvermeRepository sahisbursvermeRepository;

    public SahisbursvermeService(SahisbursvermeRepository sahisbursvermeRepository) {
        this.sahisbursvermeRepository = sahisbursvermeRepository;
    }
    public Sahisbursverme createSahisbursverme(Sahisbursverme sahisbursverme){
        return sahisbursvermeRepository.save(sahisbursverme);
    }
    public List<Sahisbursverme> findAllSahisbursverme(){
        return sahisbursvermeRepository.findAll();
    }
    public Sahisbursverme getSahisbursvermeById(String sahisbursvermeId){
        return sahisbursvermeRepository.findById(sahisbursvermeId).orElse(null);
    }
    public Sahisbursverme updateSahisbursverme(String sahisbursvermeId,Sahisbursverme sahisbursverme){
        Sahisbursverme lastSahisbursverme=this.sahisbursvermeRepository.findById(sahisbursvermeId).get();
        lastSahisbursverme.setSahis(sahisbursverme.getSahis());
        lastSahisbursverme.setBurs(sahisbursverme.getBurs());
        return sahisbursvermeRepository.save(lastSahisbursverme);
    }
    public void deleteSahisbursvermeById(String sahisbursvermeId){
        sahisbursvermeRepository.deleteById(sahisbursvermeId);
    }
}
