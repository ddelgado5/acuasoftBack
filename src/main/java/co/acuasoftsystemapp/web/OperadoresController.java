package co.acuasoftsystemapp.web;
import co.acuasoftsystemapp.core.Result;
import co.acuasoftsystemapp.core.ResultGenerator;
import co.acuasoftsystemapp.model.Operadores;
import co.acuasoftsystemapp.service.OperadoresService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2021/11/06.
*/
@RestController
@RequestMapping("/operadores")
public class OperadoresController {
    @Resource
    private OperadoresService operadoresService;

    @PostMapping("/add")
    public Result add(Operadores operadores) {
        operadoresService.save(operadores);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        operadoresService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Operadores operadores) {
        operadoresService.update(operadores);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Operadores operadores = operadoresService.findById(id);
        return ResultGenerator.genSuccessResult(operadores);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Operadores> list = operadoresService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
