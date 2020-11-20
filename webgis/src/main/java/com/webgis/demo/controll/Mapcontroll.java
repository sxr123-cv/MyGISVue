package com.webgis.demo.controll;
import com.webgis.demo.DAO.SectionDao;
import com.webgis.demo.code.Result;
import com.webgis.demo.pojo.Map;
import com.webgis.demo.pojo.Section;
import com.webgis.demo.server.MapServer;
import org.apache.shiro.config.Ini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

@Controller
public class Mapcontroll {
    @Autowired
    MapServer mapServer;

    @CrossOrigin
    @GetMapping("/api/maps")
    @ResponseBody
    public List<Map> getmap() throws Exception {
        return mapServer.getMap();
    }
    @CrossOrigin
    @PostMapping(value = "api/addMap")
    @ResponseBody
    public Result addmap(@RequestBody Map requestMap) {
       return mapServer.addMapPoint(requestMap);

    }
    @CrossOrigin
    @GetMapping(value = "api/sections")
    @ResponseBody
    public List<Section> GetSectionList() {
       return mapServer.getSection();

    }
}
