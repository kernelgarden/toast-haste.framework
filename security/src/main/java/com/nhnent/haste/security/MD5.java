/*
* Copyright 2016 NHN Entertainment Corp.
*
* NHN Entertainment Corp. licenses this file to you under the Apache License,
* version 2.0 (the "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at:
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.nhnent.haste.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    private static final Logger logger = LoggerFactory.getLogger(MD5.class);

    public static byte[] hash(byte[] source) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            return digest.digest(source);
        } catch (NoSuchAlgorithmException e) {
            logger.error("Failed to find MD5");
        }
        return null;
    }

    public static byte[] hash(BigInteger num) {
        return hash(num.toByteArray());
    }
}
