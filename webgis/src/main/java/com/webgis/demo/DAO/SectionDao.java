package com.webgis.demo.DAO;
import com.webgis.demo.pojo.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SectionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Section> getList(){
        String stl="SELECT a.id,a.name,b.address_name,b.pointX,b.pointY,a.head_people,a.tel,a.status " +
                "FROM Section a,Map b " +
                "WHERE a.pointId=b.id ";
        return jdbcTemplate.query(stl, (rs, rowNum) -> {
            Section se=new Section();
            se.setId(rs.getInt("id"));
            se.setAddressName(rs.getString("address_name"));
            se.setPointX(rs.getFloat("pointX"));
            se.setPointY(rs.getFloat("pointY"));
            se.setHandPeople(rs.getString("head_people"));
            se.setName(rs.getString("name"));
            se.setTel(rs.getString("tel"));
            se.setStatus(rs.getString("status"));
            return se;
        });
    }

}
