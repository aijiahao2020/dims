package com.aijiahao.test;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

        import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/18 - 16:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMapper {


//    @Autowired
//    ApartmentMapper apartmentMapper;
//
//    @Test
//    public void testAptMapper(){
//        System.out.println(apartmentMapper);
//
//        List<Apartment> apartments = apartmentMapper.selectByExample(null);
//
//        for (Apartment apartment : apartments) {
//            System.out.println(apartment);
//        }
//    }

}
