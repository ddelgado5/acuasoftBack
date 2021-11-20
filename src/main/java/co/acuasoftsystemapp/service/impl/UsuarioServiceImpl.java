package co.acuasoftsystemapp.service.impl;

import co.acuasoftsystemapp.dao.UsuarioMapper;
import co.acuasoftsystemapp.model.Usuario;
import co.acuasoftsystemapp.service.UsuarioService;
import co.acuasoftsystemapp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2021/11/06.
 */
@Service
@Transactional
public class UsuarioServiceImpl extends AbstractService<Usuario> implements UsuarioService {
    @Resource
    private UsuarioMapper usuarioMapper;

}
