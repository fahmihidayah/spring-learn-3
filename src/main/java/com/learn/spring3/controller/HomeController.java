/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.spring3.controller;

import com.learn.spring3.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fahmi
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index(Model model){
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("fahmi");
        mahasiswa.setAlamat("malang");
        model.addAttribute("mahasiswa", mahasiswa);
        return "index";
    }
}
