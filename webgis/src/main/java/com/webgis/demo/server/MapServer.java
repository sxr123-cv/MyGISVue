package com.webgis.demo.server;
import com.webgis.demo.DAO.MapDao;
import com.webgis.demo.DAO.MapSqlDao;
import com.webgis.demo.DAO.SectionDao;
import com.webgis.demo.code.Result;
import com.webgis.demo.pojo.Map;
import com.webgis.demo.pojo.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.Integer;

import java.util.List;

@Service

public class MapServer {
    @Autowired
    MapDao mapDao;
    @Autowired
    MapSqlDao mapSqlDao;
    @Autowired
    SectionDao sectionDao;
    public List<Map> getMap(){
        return mapDao.findAll();
    }
    public Result addMapPoint(Map m){
        int count=0;
        if(mapDao.findAllById(m.getId()).isEmpty()){
           count=mapSqlDao.addMapPoint(m);
        }
        else {
            count=mapSqlDao.Update(m);
        }
        if(count>0)
            return new Result(200);
        else
            return new Result(400);
    }
    public List<Section> getSection(){
        return  sectionDao.getList();
    }
}
