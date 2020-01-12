/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.pollcontrol;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;

/**
 * Fast Poll Stop Command value object class.
 * <p>
 * Cluster: <b>Poll Control</b>. Command ID 0x01 is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Poll Control cluster.
 * <p>
 * The Fast Poll Stop command is used to stop the fast poll mode initiated by the Check-in
 * response. The Fast Poll Stop command has no payload. <br> If the Poll Control Server receives
 * a Fast Poll Stop from an unbound client it should send back a DefaultResponse with a value
 * field indicating “ACTION_DENIED” . The Server shall respond with a DefaultResponse not
 * equal to ZCL_SUCCESS. <br> If the Poll Control Server receives a Fast Poll Stop command from a
 * bound client but it is unable to stop fast polling due to the fact that there is another bound
 * client which has requested that polling continue it should respond with a Default Response
 * with a status of “ACTION_DENIED” <br> If a Poll Control Server receives a Fast Poll Stop
 * command from a bound client but it is not FastPolling it should respond with a Default
 * Response with a status of ACTION_DENIED.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-10T12:07:00Z")
public class FastPollStopCommand extends ZclPollControlCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0020;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x01;

    /**
     * Default constructor.
     */
    public FastPollStopCommand() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(22);
        builder.append("FastPollStopCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
