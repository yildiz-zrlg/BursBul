package com.example.BursBul.Service;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Kurum;
import com.example.BursBul.Repository.KurumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KurumService {
    private KurumRepository kurumRepository;

    public KurumService(KurumRepository kurumRepository) {
        this.kurumRepository = kurumRepository;
    }
    public Kurum createKurum(Kurum kurum){
        return kurumRepository.save(kurum);
    }
    public List<Kurum> findAllKurum(){
        return kurumRepository.findAll();
    }
    public Kurum getKurumById(String kurumId){
        return kurumRepository.findById(kurumId).orElse(null);
    }
    public Kurum updateKurum(String kurumId,Kurum kurum){
        Kurum lastKurum=this.kurumRepository.findById(kurumId).get();
        lastKurum.setKurumAdi(kurum.getKurumAdi());
        lastKurum.setKurumAdresi(kurum.getKurumAdresi());
        lastKurum.setKurumEmail(kurum.getKurumEmail());
        return kurumRepository.save(lastKurum);
    }
    public void deleteKurumById(String kurumId){
        kurumRepository.deleteById(kurumId);
    }
}
