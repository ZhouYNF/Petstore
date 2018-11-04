package com.nf147.pest.web;

import com.nf147.pest.dao.PetMapper;
import com.nf147.pest.entity.Apiresponse;
import com.nf147.pest.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class PetConsole {

    @Autowired
    PetMapper petMapper;


    @PostMapping
    @ResponseBody
    public Apiresponse addPet(Pet pet) {
        if (petMapper.insert(pet) != 0) {
            return new Apiresponse();
        } else {
            return new Apiresponse();
        }
    }


    @PutMapping
    @ResponseBody
    public Apiresponse updatePet(Pet pet) {
        if (pet.getPet_id() == null) {
            if (petMapper.selectByPrimaryKey(pet.getPet_id()) != null) {
                if (petMapper.updateByPrimaryKey(pet) != 0) {
                    return new Apiresponse();
                } else {
                    return new Apiresponse();
                }
            } else {
                return new Apiresponse();
            }
        } else {
            return new Apiresponse();
        }
    }

    @GetMapping("/findByStatus")
    @ResponseBody
    public Apiresponse findByStatus(Pet pet) {
        List<Pet> list = null;
        if (pet.getPet_status() == null || pet.getPet_status().isEmpty()) {
            return new Apiresponse();
        } else {
            list = petMapper.selectByStatus(pet.getPet_status());
            if (list == null) {
                return new Apiresponse();
            } else {
                return new Apiresponse();
            }
        }
    }

    @GetMapping("/{petId}")
    @ResponseBody
    public Apiresponse findById(@PathVariable int petId) {
        if (petId == 0) {
            return new Apiresponse();
        } else {
            if (petMapper.selectByPrimaryKey(petId) != null) {
                return new Apiresponse();
            } else {
                return new Apiresponse();
            }
        }
    }

    @PostMapping("/{petId}")
    @ResponseBody
    public Apiresponse updateById(@PathVariable int petId, Pet pet) {
        if (petId == 0) {
            return new Apiresponse();
        } else {
            petMapper.updateByPrimaryKey(pet);
            return new Apiresponse();
        }
    }

    @DeleteMapping("/{petId}")
    @ResponseBody
    public Apiresponse delById(@PathVariable int petId) {
        Pet pet = new Pet();
        pet.setPet_id(petId);
        if (petMapper.selectByPrimaryKey(pet.getPet_id()) == null) {
            return new Apiresponse();
        } else {
            if (petMapper.deleteByPrimaryKey(petId) == 0) {
                return new Apiresponse();
            } else {
                return new Apiresponse();
            }
        }
    }

    @PostMapping("/{petId}/uploadImage")
    @ResponseBody
    public Apiresponse uploadImage(@PathVariable int petId, Pet pet) {
        if (petMapper.updateByPrimaryKey(pet) != 0) {
            return new Apiresponse();
        }
        return new Apiresponse();
    }




}
