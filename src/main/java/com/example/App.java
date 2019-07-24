package com.example;

import com.example.dao.LabelDAO;
import com.example.model.LabelDO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        LabelDAO labelDAO = context.getBean(LabelDAO.class);

        // 1.新增
        LabelDO insertlabel = new LabelDO();
        insertlabel.setId(1111L);
        insertlabel.setName("测试标签");
        insertlabel.setTypeId(1L);
        insertlabel.setCreateTime(new Date());
        //Integer insertCount = labelDAO.insert(insertlabel);
       // System.out.println("insert label rows count :" + insertCount);

        // 1.2 修改
        LabelDO updateLabel = new LabelDO();
        updateLabel.setTypeId(2L);
        updateLabel.setId(1111L);
        //updateLabel.setName("123");
        Integer updateResult = labelDAO.updateById(updateLabel);
        System.out.println("update label rows count :" + updateResult);

       /* // 2.根据主键获取
        LabelDO labelDO = labelDAO.selectById(1111L);
        System.out.println("selectById ：" + labelDO);

        // 3.根据条件查询
        Map<String, Object> map = new HashMap<>();
        map.put("c_type_id", "1");
        System.out.println("====== selectByMap =========");
        List<LabelDO> labelList = labelDAO.selectByMap(map);
        for (LabelDO label : labelList) {
            System.out.println(label.toString());
        }

        // 4.分页查询
        Page<LabelDO> page = new Page<>(0, 10);
        List<LabelDO> list = labelDAO.selectPage(page, null);
        System.out.println("====== selectPage =========");
        for (LabelDO label : list) {
            System.out.println(label.toString());
        }

        // 5.根据条件查询
        EntityWrapper<LabelDO> filter = new EntityWrapper<>();
        filter.eq("c_type_id", 1);           //map.put("c_type_id", "1");
        List<LabelDO> listLabels = labelDAO.selectList(filter);
        System.out.println("========= selectList by entityWrapper ==============");
        listLabels.forEach(item -> {
            System.out.println(item.toString());
        });

        // 6.根据条件查询分页数据
        Page<LabelDO> pLabel = new Page<>(0, 10);
        EntityWrapper<LabelDO> pageFilter = new EntityWrapper<LabelDO>();

        pageFilter.eq("c_type_id", 1)
                .and().lt("c_type_id", 2)
                .and().gt("c_type_id", 0);
        List<LabelDO> labels = labelDAO.selectPage(pLabel, pageFilter);
        Long pageCount = pLabel.getPages();
        Long totalCount = pLabel.getTotal();
        System.out.println("======== select page by filter ========");
        labels.forEach(item -> {
            System.out.println(item.toString());
        });
        System.out.println("total page count ：" + pageCount);
        System.out.println("total rows count : " + totalCount);

        // 7.自定义方法
        LabelDO info = labelDAO.selectByPrimaryKey(1111);
        System.out.println("=======   自定义Sql语句   ========");
        System.out.println(info.toString());*/
    }
}
