/**
 * Mule Facebook Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

 package org.mule.module.facebook.types;

import com.restfb.Facebook;
 
public class OutboxThread extends Thread
{
    private static final long serialVersionUID = 1L;
    
    @Facebook
    private String message;

    public String getMessage()
    {
        return message;
    }
}

