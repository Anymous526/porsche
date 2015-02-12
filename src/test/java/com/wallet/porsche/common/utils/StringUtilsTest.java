package com.wallet.porsche.common.utils;

import junit.framework.Assert;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testIsEmail() {

	System.out.println(StringUtils.isEmail("  kevin.sun526@qq.com "));
	Assert.assertTrue(StringUtils.isEmail("  kevin.sun526@qq.com "));
    }

}
