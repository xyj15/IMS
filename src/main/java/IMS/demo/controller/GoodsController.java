package IMS.demo.controller;

import IMS.demo.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import IMS.demo.utils.ResultVOUtil;
import IMS.demo.vo.ResultVO;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    //商品列表
    @GetMapping("/")
    @Cacheable(cacheNames = "goodsDTO",key ="123")
    public ResultVO<List<GoodsDTO>> list(@RequestParam(value = "cursor",defaultValue = "0") Integer cursor,
                                         @RequestParam(value = "count",defaultValue = "20") Integer count) {

        PageRequest request = new PageRequest(cursor,count);
        Page<GoodsDTO> goodsDTOPage = goodsService.findList(request);

        return ResultVOUtil.success(goodsDTOPage.getContent());
    }
}
