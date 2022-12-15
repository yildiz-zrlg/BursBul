package com.example.BursBul.Controller;


import com.example.BursBul.Model.Ogrenci;
import com.example.BursBul.Model.Ogrencibursalma;
import com.example.BursBul.Service.OgrencibursalmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ogrencibursalma")
public class OgrencibursalmaController {
    private OgrencibursalmaService ogrencibursalmaService;

    public OgrencibursalmaController(OgrencibursalmaService ogrencibursalmaService) {
        this.ogrencibursalmaService = ogrencibursalmaService;
    }
    @PostMapping
    public Ogrencibursalma insert(@RequestBody Ogrencibursalma ogrencibursalma){
        return  ogrencibursalmaService.createOgrencibursalma(ogrencibursalma);
    }
    @GetMapping
    public List<Ogrencibursalma> getAllOgrencibursalma(){
        return ogrencibursalmaService.findAllOgrencibursalma();
    }
    @GetMapping("/{id}")
    public Ogrencibursalma getOgrencibursalmaById(@PathVariable("id") String ogrencibursalmaId){
        return ogrencibursalmaService.getOgrencibursalmaById(ogrencibursalmaId);
    }
    @PutMapping("/{id}")
    public Ogrencibursalma update(@PathVariable("id") String ogrencibursalmaId,@RequestBody Ogrencibursalma ogrencibursalma){
        return ogrencibursalmaService.updateOgrencibursalma(ogrencibursalmaId,ogrencibursalma);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String ogrencibursalmaId){
        ogrencibursalmaService.deleteOgrencibursalmaById(ogrencibursalmaId);
    }
}
