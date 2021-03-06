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

import java.io.Serializable;
import java.util.List;

import com.restfb.Facebook;
import com.restfb.types.NamedFacebookType;
 
public class NamedFacebookTypeList implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Facebook
    private List<NamedFacebookType> data;

    
    public List<NamedFacebookType> getData()
    {
        return data;
    }
}