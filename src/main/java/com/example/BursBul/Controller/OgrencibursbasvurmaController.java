package com.example.BursBul.Controller;

import com.example.BursBul.Model.Ogrencibursalma;
import com.example.BursBul.Model.Ogrencibursbasvurma;
import com.example.BursBul.Service.OgrencibursbasvurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ogrencibursbasvurma")
@RestController
public class OgrencibursbasvurmaController {
    private OgrencibursbasvurmaService ogrencibursbasvurmaService;

    public OgrencibursbasvurmaController(OgrencibursbasvurmaService ogrencibursbasvurmaService) {
        this.ogrencibursbasvurmaService = ogrencibursbasvurmaService;
    }
    @PostMapping
    public Ogrencibursbasvurma insert(@RequestBody Ogrencibursbasvurma ogrencibursbasvurma){
        return  ogrencibursbasvurmaService.createOgrencibursbasvurma(ogrencibursbasvurma);
    }
    @GetMapping
    public List<Ogrencibursbasvurma> getAllOgrencibursbasvurma(){
        return ogrencibursbasvurmaService.findAllOgrencibursbasvurma();
    }
    @GetMapping("/{id}")
    public Ogrencibursbasvurma getOgrencibursbasvurmaById(@PathVariable("id") String ogrencibursbasvurmaId){
        return ogrencibursbasvurmaService.getOgrencibursbasvurmaById(ogrencibursbasvurmaId);
    }
    @PutMapping("/{id}")
    public Ogrencibursbasvurma update(@PathVariable("id") String ogrencibursbasvurmaId,@RequestBody Ogrencibursbasvurma ogrencibursbasvurma){
        return ogrencibursbasvurmaService.updateOgrencibursbasvurma(ogrencibursbasvurmaId,ogrencibursbasvurma);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String ogrencibursbasvurmaId){
        ogrencibursbasvurmaService.deleteOgrencibursbasvurmaById(ogrencibursbasvurmaId);
    }
}
