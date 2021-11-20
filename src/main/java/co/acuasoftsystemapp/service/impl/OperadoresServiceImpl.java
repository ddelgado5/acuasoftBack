package co.acuasoftsystemapp.service.impl;

import co.acuasoftsystemapp.dao.OperadoresMapper;
import co.acuasoftsystemapp.model.Operadores;
import co.acuasoftsystemapp.service.OperadoresService;
import co.acuasoftsystemapp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2021/11/06.
 */
@Service
@Transactional
public class OperadoresServiceImpl extends AbstractService<Operadores> implements OperadoresService {
    @Resource
    private OperadoresMapper operadoresMapper;

}
