package com.webgis.demo.DAO;
import com.webgis.demo.pojo.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MapSqlDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public int addMapPoint(Map m){
        String sql = "INSERT INTO Map(id,pointX,pointY,name) VALUES(?,?,?,?)";
        assert false;
        return jdbcTemplate.update(sql, m.getId(),m.getPointX(),m.getPointY(),m.getName());
    }
    public int Update(Map m){
        String sql="UPDATE Map SET pointX=?, pointY=?, name=? WHERE id=?";
        return jdbcTemplate.update(sql,m.getPointX(),m.getPointY(),m.getName(),m.getId());
    }
}
