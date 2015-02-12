/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallet.porsche.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @See java.lang.String org.apache.commons.lang3.StringUtils
 * @author Kevin Sun
 * @version 1.0
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {
    /**
     * 邮箱的正则表达式
     */
    private static final Pattern EMAIL_PATTERN = Pattern
	    .compile("^[a-zA-Z]([a-z0-9A-Z]+[-|\\.|\\_]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");

    private static final Pattern MOBILE_PATTERN = Pattern
	    .compile("^1[3|5|8][0-9]{9}$");

    public static boolean isEmail(String str) {
	boolean retValue = false;
	if (isNotBlank(str)) {
	    Matcher m = EMAIL_PATTERN.matcher(str);
	    if (m.find()) {
		retValue = true;
	    }
	}
	return retValue;
    }

    public static boolean isMobile(String str) {
	boolean retValue = false;
	if (isNotBlank(str)) {
	    Matcher m = MOBILE_PATTERN.matcher(str);
	    if (m.find()) {
		retValue = true;
	    }
	}
	return retValue;
    }

}
