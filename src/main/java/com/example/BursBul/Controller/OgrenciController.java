package com.example.BursBul.Controller;

import com.example.BursBul.Model.Ogrenci;
import com.example.BursBul.Service.OgrenciService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciController {
    private OgrenciService ogrenciService;

    public OgrenciController(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }
    @PostMapping
    public Ogrenci insert(@RequestBody Ogrenci ogrenci){
        return  ogrenciService.createOgrenci(ogrenci);
    }
    @GetMapping
    public List<Ogrenci> getAllOgrenci(){
        return ogrenciService.findAllOgrenci();
    }
    @GetMapping("/{id}")
    public Ogrenci getOgrenciById(@PathVariable("id") String ogrenciId){
        return ogrenciService.getOgrenciById(ogrenciId);
    }
    @PutMapping("/{id}")
    public Ogrenci update(@PathVariable("id") String ogrenciId,@RequestBody Ogrenci ogrenci){
        return ogrenciService.updateOgrenci(ogrenciId,ogrenci);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String ogrenciId){
        ogrenciService.deleteOgrenciById(ogrenciId);
    }
}
