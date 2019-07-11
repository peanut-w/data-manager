package com.haiqiu.datamanager.controller;

import com.haiqiu.datamanager.dao.ClubPOMapper;
import com.haiqiu.datamanager.poentity.ClubPO;
import com.haiqiu.datamanager.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peanut on 2019/7/3 下午1:34
 * 俱乐部CRUD逻辑
 */

@RestController("ClubController")
@RequestMapping("club")
public class ClubController {
    @Autowired
    ClubPOMapper clubPOMapper;

    /**
     * 增加
     *
     * @param clubPO
     * @return
     */
    @PostMapping
    public Response addClub(@RequestBody ClubPO clubPO) {
        try {
            clubPOMapper.insertSelective(clubPO);
            return Response.successResponse("添加成功");
        } catch (Exception e) {
            return Response.failedResponse("添加失败");
        }

    }

    /**
     * 删除
     *
     * @param clubPO
     * @return
     */
    @DeleteMapping
    public Response deleteClub(@RequestBody ClubPO clubPO) {
        try {
            clubPOMapper.deleteByPrimaryKey(clubPO.getId());
            return Response.successResponse("删除成功");
        } catch (Exception e) {
            return Response.failedResponse("删除失败");
        }

    }

    /**
     * 修改
     *
     * @param clubPO
     * @return
     */
    @PutMapping
    public Response updateClub(@RequestBody ClubPO clubPO) {
        try {
//            前端业务模型
            clubPOMapper.updateByPrimaryKey(clubPO);
            return Response.successResponse("修改成功");
        } catch (Exception e) {
            return Response.failedResponse("修改失败");
        }
    }

    /**
     * 查询
     * 多条件查询
     *
     * @param id
     * @return
     */
    @GetMapping
    public Object selectClub(@RequestParam Integer id) {
//            前端业务模型
//        查询所有
//        分页插件做处理

        ClubPO clubData = clubPOMapper.selectByPrimaryKey(id);
        return makeRes(1, 1, 1, clubData);

    }

    public static Map makeRes(Integer total, Integer size, Integer current, Object records) {
        Map map = new HashMap();
        map.put("total", total);
        map.put("size", size);
        map.put("current", current);
        map.put("records", records);
        return map;
    }
    //    total: 3,
//    size: 2,
//    current: 1,
//    pages: 2
    /**
     * 批量增加/上传Excel/解析Excel中数据/返回Excel中每条数据的处理结果
     * 决定是否要做
     * @param clubPO
     * @return
     */

}
