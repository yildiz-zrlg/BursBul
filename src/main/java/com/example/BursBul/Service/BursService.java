package com.example.BursBul.Service;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Repository.BursRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BursService {
    private BursRepository bursRepository;

    public BursService(BursRepository bursRepository) {
        this.bursRepository = bursRepository;
    }
    public Burs createBurs(Burs burs){
        return bursRepository.save(burs);
    }
    public List<Burs> findAllBurs(){
        return bursRepository.findAll();
    }
    public Burs getBursById(String bursId){
        return  bursRepository.findById(bursId).orElse(null);
    }
    public Burs updateBurs(String bursId,Burs burs){
        Burs lastBurs=this.bursRepository.findById(bursId).get();
        lastBurs.setBursSure(burs.getBursSure());
        lastBurs.setBursTipi(burs.getBursTipi());
        lastBurs.setBursMiktari(burs.getBursMiktari());
        return bursRepository.save(lastBurs);
    }
    public void deleteBursById(String bursId){
        bursRepository.deleteById(bursId);
    }
}
