package com.example.BursBul.Service;

import com.example.BursBul.Model.Uniogrenci;
import com.example.BursBul.Repository.UniogrenciRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniogrenciService {
    private UniogrenciRepository uniogrenciRepository;

    public UniogrenciService(UniogrenciRepository uniogrenciRepository) {
        this.uniogrenciRepository = uniogrenciRepository;
    }
    public Uniogrenci createUniogrenci(Uniogrenci uniogrenci){
        return uniogrenciRepository.save(uniogrenci);
    }
    public List<Uniogrenci> findAllUniogrenci(){
        return uniogrenciRepository.findAll();
    }
    public Uniogrenci getUniogrenciById(String uniogrenciId){
        return  uniogrenciRepository.findById(uniogrenciId).orElse(null);
    }
    public Uniogrenci updateUniogrenci(String uniogrenciId,Uniogrenci uniogrenci){
        Uniogrenci lastUniogrenci=this.uniogrenciRepository.findById(uniogrenciId).get();
        lastUniogrenci.setUniversite(uniogrenci.getUniversite());
        lastUniogrenci.setOgrenci(uniogrenci.getOgrenci());
        return uniogrenciRepository.save(lastUniogrenci);
    }
    public void deleteUniogrenciById(String uniogrenciId){
        uniogrenciRepository.deleteById(uniogrenciId);
    }

}
