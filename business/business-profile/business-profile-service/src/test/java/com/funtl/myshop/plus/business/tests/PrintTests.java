package com.funtl.myshop.plus.business.tests;

import com.funtl.myshop.plus.business.dto.ProfileParam;
import com.funtl.myshop.plus.commons.utils.MapperUtils;
import org.junit.Test;

public class PrintTests {

    @Test
    public void testPrintProfileParam() throws Exception {
        System.out.println(MapperUtils.obj2json(new ProfileParam()));
    }

}
