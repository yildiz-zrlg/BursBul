package com.example.BursBul.Service;

import com.example.BursBul.Model.Ogrencibursbasvurma;
import com.example.BursBul.Repository.OgrencibursbasvurmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrencibursbasvurmaService {
    private OgrencibursbasvurmaRepository ogrencibursbasvurmaRepository;

    public OgrencibursbasvurmaService(OgrencibursbasvurmaRepository ogrencibursbasvurmaRepository) {
        this.ogrencibursbasvurmaRepository = ogrencibursbasvurmaRepository;
    }
    public Ogrencibursbasvurma createOgrencibursbasvurma(Ogrencibursbasvurma ogrencibursbasvurma){
        return ogrencibursbasvurmaRepository.save(ogrencibursbasvurma);
    }
    public List<Ogrencibursbasvurma> findAllOgrencibursbasvurma(){
        return ogrencibursbasvurmaRepository.findAll();
    }
    public Ogrencibursbasvurma getOgrencibursbasvurmaById(String ogrencibursbasvurmaId){
        return ogrencibursbasvurmaRepository.findById(ogrencibursbasvurmaId).orElse(null);
    }
    public Ogrencibursbasvurma updateOgrencibursbasvurma(String ogrencibursbasvurmaId,Ogrencibursbasvurma ogrencibursbasvurma){
        Ogrencibursbasvurma lastOgrencibursbasvurma=this.ogrencibursbasvurmaRepository.findById(ogrencibursbasvurmaId).get();
        lastOgrencibursbasvurma.setPuan(ogrencibursbasvurma.getPuan());
        lastOgrencibursbasvurma.setOgrenci(ogrencibursbasvurma.getOgrenci());
        lastOgrencibursbasvurma.setBurs(ogrencibursbasvurma.getBurs());
        return ogrencibursbasvurmaRepository.save(lastOgrencibursbasvurma);
    }
    public void deleteOgrencibursbasvurmaById(String ogrencibursbasvurmaId){
        ogrencibursbasvurmaRepository.deleteById(ogrencibursbasvurmaId);
    }
}
