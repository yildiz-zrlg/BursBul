package com.example.BursBul.Service;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Sahis;
import com.example.BursBul.Repository.SahisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SahisService {
    private SahisRepository sahisRepository;

    public SahisService(SahisRepository sahisRepository) {
        this.sahisRepository = sahisRepository;
    }
    public Sahis createSahis(Sahis sahis){
        return sahisRepository.save(sahis);
    }
    public List<Sahis> findAllSahis(){
        return sahisRepository.findAll();
    }
    public Sahis getSahisById(String sahisId){
        return sahisRepository.findById(sahisId).orElse(null);
    }
    public Sahis updateSahis(String sahisId,Sahis sahis){
        Sahis lastSahis=this.sahisRepository.findById(sahisId).get();
        lastSahis.setSahisAdi(sahis.getSahisAdi());
        lastSahis.setSahisSoyadi(sahis.getSahisSoyadi());
        lastSahis.setSahisEmail(sahis.getSahisEmail());
        lastSahis.setSahisMeslek(sahis.getSahisMeslek());
        return sahisRepository.save(lastSahis);
    }
    public void deleteSahisById(String sahisId){
        sahisRepository.deleteById(sahisId);
    }
}
