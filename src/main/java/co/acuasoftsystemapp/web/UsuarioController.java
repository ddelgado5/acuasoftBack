package co.acuasoftsystemapp.web;
import co.acuasoftsystemapp.core.Result;
import co.acuasoftsystemapp.core.ResultGenerator;
import co.acuasoftsystemapp.model.Usuario;
import co.acuasoftsystemapp.service.UsuarioService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2021/11/06.
*/
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Resource
    private UsuarioService usuarioService;


    @PostMapping("/iniciarSesion")
    public Result iniciarSesion(@RequestBody Usuario usuario) {
        List<Usuario> list = usuarioService.findAll();

        for (Usuario e : list) {
            if (e.getEmail().equals(usuario.getEmail()) && e.getPassword().equals(usuario.getPassword())) {
                return ResultGenerator.genSuccessResult(e);
            }
        }

        return ResultGenerator.genFailResult("No se encontró ninguno usuario con las credenciales indicadas.");
    }

    @PostMapping("/add")
    public Result add(Usuario usuario) {
        usuarioService.save(usuario);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        usuarioService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Usuario usuario) {
        usuarioService.update(usuario);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Usuario usuario = usuarioService.findById(id);
        return ResultGenerator.genSuccessResult(usuario);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Usuario> list = usuarioService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
