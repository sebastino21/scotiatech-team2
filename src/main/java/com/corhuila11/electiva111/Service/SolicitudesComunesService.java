package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.ISolicitudesComunesRepository;
import com.corhuila11.electiva111.IService.ISolicitudesComunesService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.SolicitudesComunes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SolicitudesComunesService extends BaseService <SolicitudesComunes> implements ISolicitudesComunesService {
    @Override
    protected IBaseRepository<SolicitudesComunes, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private ISolicitudesComunesRepository repository;



}

