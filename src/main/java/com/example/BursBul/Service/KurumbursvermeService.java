package com.example.BursBul.Service;

import com.example.BursBul.Model.Kurum;
import com.example.BursBul.Model.Kurumbursverme;
import com.example.BursBul.Repository.KurumbursvermeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KurumbursvermeService {
    private KurumbursvermeRepository kurumbursvermeRepository;

    public KurumbursvermeService(KurumbursvermeRepository kurumbursvermeRepository) {
        this.kurumbursvermeRepository = kurumbursvermeRepository;
    }
    public Kurumbursverme createKurumbursverme(Kurumbursverme kurumbursverme){
        return kurumbursvermeRepository.save(kurumbursverme);
    }
    public List<Kurumbursverme> findAllKurumbursverme(){
        return kurumbursvermeRepository.findAll();
    }
    public Kurumbursverme getKurumbursvermeById(String kurumbursvermeId){
        return kurumbursvermeRepository.findById(kurumbursvermeId).orElse(null);
    }
    public Kurumbursverme updateKurumbursverme(String kurumbursvermeId,Kurumbursverme kurumbursverme){
        Kurumbursverme lastKurumbursverme=this.kurumbursvermeRepository.findById(kurumbursvermeId).get();
        lastKurumbursverme.setKurum(kurumbursverme.getKurum());
        lastKurumbursverme.setBurs(kurumbursverme.getBurs());
        return kurumbursvermeRepository.save(lastKurumbursverme);
    }
    public void deleteKurumbursvermeById(String kurumbursvermeId){
        kurumbursvermeRepository.deleteById(kurumbursvermeId);
    }
}
