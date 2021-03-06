/*
 *       Copyright© (2020) blockmap Co., Ltd.
 *
 *       This file is part of did-core.
 *
 *       did-core is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published by
 *       the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       did-core is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with did-core.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.blockmap.did.core.suite.crypto;

import com.blockmap.did.core.exception.EncodeSuiteException;

/**
 * 秘钥加解密接口.
 * @author admin@xuzhijun.com.cn
 *
 */
public interface CryptService {

    /**
     * 加密方法.
     * @param content 待加密字符串
     * @param password 秘钥
     * @return 返回加密后的字符串数据
     */
    public String encrypt(String content, String password) throws EncodeSuiteException;
    
    /**
     * 解密方法.
     * @param content 待解密字符串
     * @param password 秘钥
     * @return 返回解密后的字符串数据
     */
    public String decrypt(String content, String password) throws EncodeSuiteException;
}
