package com.taimei.gos.admin.service;

import com.taimei.gos.mapper.AResourceMapper;
import com.taimei.gos.model.AResource;
import com.taimei.gos.model.AResourceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AResourceService {

    @Autowired
    private AResourceMapper aResourceMapper;

    public List<AResource> listAll() {
        return aResourceMapper.selectByExample(new AResourceExample());
    }
}
