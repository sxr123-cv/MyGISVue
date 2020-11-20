package com.webgis.demo.DAO;
import com.webgis.demo.pojo.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Mapper
public interface MapDao extends JpaRepository<Map,Integer> {


    @Override
    List<Map> findAll();
    List<Map> findAllById(int id);

}
