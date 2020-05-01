/*
 *       Copyright© (2018) blockmap Co., Ltd.
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

package com.blockmap.did.core.protocol.request;

import com.blockmap.did.core.protocol.base.DidAuthentication;
import lombok.Data;

import java.util.Map;

/**
 * The Arguments for the SDK API register CPT. The cptJsonSchema is Map.
 *
 */
@Data
public class CptMapArgs {

    /**
     * Required: did authority  for this CPT.
     */
    private DidAuthentication didAuthentication;
    /**
     * Required: The json schema content defined for this CPT.
     */
    private Map<String, Object> cptJsonSchema;
}
