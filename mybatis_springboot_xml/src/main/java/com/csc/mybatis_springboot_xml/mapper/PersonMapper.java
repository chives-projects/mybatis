package com.csc.mybatis_springboot_xml.mapper;

import com.csc.mybatis_springboot_xml.domain.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/28 19:27
 */
@Mapper
public interface PersonMapper {
    List<Person> findAll();
    Person findById(Integer id);
    int savePerson(Person person);
    int updatePerson(Person person);
    int deletePerson(Integer id);

    List<Person> findByName1(String name);
    List<Person> findByName2(String name);

    int findTotal();

    List<Person> findPersonByCondition(Person person);
    List<Person> findPersonByIds(List<Integer> ids);

}
