/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Java.TugasJava.Data.Tabel_C;

import Data.KTP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Abian
 */
@Controller
public class DataController {
    
    KTP file = new KTP(); // Memanggil kelas KTP dgn nama objek "file
    
    @RequestMapping("/dataktp")
//    @ResponseBody
    public String getData(Model model){
        
        ArrayList <List<String>> newData = new ArrayList<>();
        newData = file.table();
        
        // Memanggil data yang tersimpan di dalam class KTP
        // Yang mana method nya itu table
        model.addAttribute("out", newData);
        
        
        return "TableView";
    }
}
