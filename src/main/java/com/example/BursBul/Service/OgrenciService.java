package com.example.BursBul.Service;

import com.example.BursBul.Model.Ogrenci;
import com.example.BursBul.Repository.OgrenciRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciService {
    private OgrenciRepository ogrenciRepository;

    public OgrenciService(OgrenciRepository ogrenciRepository) {
        this.ogrenciRepository = ogrenciRepository;
    }
    public Ogrenci createOgrenci(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }
    public List<Ogrenci> findAllOgrenci(){
        return ogrenciRepository.findAll();
    }
    public Ogrenci getOgrenciById(String ogrenciId){
        return  ogrenciRepository.findById(ogrenciId).orElse(null);
    }
    public Ogrenci updateOgrenci(String ogrenciId,Ogrenci ogrenci){
        Ogrenci lastOgrenci=this.ogrenciRepository.findById(ogrenciId).get();
        lastOgrenci.setOgrenciAdi(ogrenci.getOgrenciAdi());
        lastOgrenci.setOgrenciSoyadi(ogrenci.getOgrenciSoyadi());
        lastOgrenci.setOgrenciEmail(ogrenci.getOgrenciEmail());
        lastOgrenci.setOgrenciGelir(ogrenci.getOgrenciGelir());
        lastOgrenci.setOgrenciAnnesagmi(ogrenci.getOgrenciAnnesagmi());
        lastOgrenci.setOgrenciBabasagmi(ogrenci.getOgrenciBabasagmi());
        lastOgrenci.setOgrenciKardessayisi(ogrenci.getOgrenciKardessayisi());
        return  ogrenciRepository.save(lastOgrenci);
    }
    public void deleteOgrenciById(String ogrenciId){
        ogrenciRepository.deleteById(ogrenciId);
    }

}
