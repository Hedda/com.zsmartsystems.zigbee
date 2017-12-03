/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.general;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zsmartsystems.zigbee.CommandTest;
import com.zsmartsystems.zigbee.serialization.DefaultDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclHeader;
import com.zsmartsystems.zigbee.zcl.ZclStatus;
import com.zsmartsystems.zigbee.zcl.field.AttributeStatusRecord;

/**
 *
 * @author Chris Jackson
 *
 */
public class ConfigureReportingResponseTest extends CommandTest {
    @Test
    public void test() {
        int[] packet = getPacketData("18 1B 07 00 00 00 00");

        ConfigureReportingResponse response = new ConfigureReportingResponse();

        DefaultDeserializer deserializer = new DefaultDeserializer(packet);
        ZclFieldDeserializer fieldDeserializer = new ZclFieldDeserializer(deserializer);

        ZclHeader zclHeader = new ZclHeader(fieldDeserializer);
        response.deserialize(fieldDeserializer);

        assertEquals(1, response.getRecords().size());
        AttributeStatusRecord record = response.getRecords().get(0);

        assertEquals(0, record.getAttributeIdentifier());
        assertEquals(ZclStatus.SUCCESS, record.getStatus());

        System.out.println(zclHeader);
        System.out.println(response);
    }
}
