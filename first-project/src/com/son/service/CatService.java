package com.son.service;

import com.son.dto.CatDto;
import com.son.model.Cat;
import com.son.repository.CatRepo;

public class CatService {
    //Insert - Update - Delete - Select
    public void doInsert(){
        //Call Repo
        //Co du lieu
        //Chuan bi du lieu nam o day
        CatDto catDto  = new CatDto();
        catDto.setId(1L);
        catDto.setAge("0.1");
        catDto.setSex("2");
        catDto.setName("Luyen");

        Cat cat = new Cat();
        cat.setId(catDto.getId());
        cat.setAge(catDto.getAge());
        cat.setName(catDto.getName());
        cat.setSex(catDto.getSex());

    }

    public void doUpdate(){

    }

    public void doDelete(){

    }

    public void doSearch(){

    }
}
