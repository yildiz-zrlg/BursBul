package com.example.BursBul.Service;

import com.example.BursBul.Model.Ogrenci;
import com.example.BursBul.Model.Ogrencibursalma;
import com.example.BursBul.Repository.OgrencibursalmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrencibursalmaService {
    private OgrencibursalmaRepository ogrencibursalmaRepository;

    public OgrencibursalmaService(OgrencibursalmaRepository ogrencibursalmaRepository) {
        this.ogrencibursalmaRepository = ogrencibursalmaRepository;
    }
    public Ogrencibursalma createOgrencibursalma(Ogrencibursalma ogrencibursalma){
        return ogrencibursalmaRepository.save(ogrencibursalma);
    }
    public List<Ogrencibursalma> findAllOgrencibursalma(){
        return ogrencibursalmaRepository.findAll();
    }
    public Ogrencibursalma getOgrencibursalmaById(String ogrencibursalmaId){
        return ogrencibursalmaRepository.findById(ogrencibursalmaId).orElse(null);
    }
    public Ogrencibursalma updateOgrencibursalma(String ogrencibursalmaId,Ogrencibursalma ogrencibursalma){
        Ogrencibursalma lastOgrencibursalma=this.ogrencibursalmaRepository.findById(ogrencibursalmaId).get();
        lastOgrencibursalma.setOgrenci(ogrencibursalma.getOgrenci());
        lastOgrencibursalma.setBurs(ogrencibursalma.getBurs());
        return ogrencibursalmaRepository.save(lastOgrencibursalma);
    }
    public void deleteOgrencibursalmaById(String ogrencibursalmaId){
        ogrencibursalmaRepository.deleteById(ogrencibursalmaId);
    }
}
