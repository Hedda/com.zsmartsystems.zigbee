/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberStatus;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberTransientKeyData;

/**
 * Class to implement the Ember EZSP command <b>getTransientKeyTableEntry</b>.
 * <p>
 * Gets the transient link key at the index specified in the transient key table.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetTransientKeyTableEntryResponse extends EzspFrameResponse {
    public static final int FRAME_ID = 0x6D;

    /**
     * The success or failure of getting the transient key.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     */
    private EmberStatus status;

    /**
     * The transient key structure that is filled in upon success.
     * <p>
     * EZSP type is <i>EmberTransientKeyData</i> - Java type is {@link EmberTransientKeyData}
     */
    private EmberTransientKeyData transientKeyData;

    /**
     * Response and Handler constructor
     */
    public EzspGetTransientKeyTableEntryResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        status = deserializer.deserializeEmberStatus();
        transientKeyData = deserializer.deserializeEmberTransientKeyData();
    }

    /**
     * The success or failure of getting the transient key.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     *
     * @return the current status as {@link EmberStatus}
     */
    public EmberStatus getStatus() {
        return status;
    }

    /**
     * The success or failure of getting the transient key.
     *
     * @param status the status to set as {@link EmberStatus}
     */
    public void setStatus(EmberStatus status) {
        this.status = status;
    }

    /**
     * The transient key structure that is filled in upon success.
     * <p>
     * EZSP type is <i>EmberTransientKeyData</i> - Java type is {@link EmberTransientKeyData}
     *
     * @return the current transientKeyData as {@link EmberTransientKeyData}
     */
    public EmberTransientKeyData getTransientKeyData() {
        return transientKeyData;
    }

    /**
     * The transient key structure that is filled in upon success.
     *
     * @param transientKeyData the transientKeyData to set as {@link EmberTransientKeyData}
     */
    public void setTransientKeyData(EmberTransientKeyData transientKeyData) {
        this.transientKeyData = transientKeyData;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(90);
        builder.append("EzspGetTransientKeyTableEntryResponse [status=");
        builder.append(status);
        builder.append(", transientKeyData=");
        builder.append(transientKeyData);
        builder.append(']');
        return builder.toString();
    }
}
