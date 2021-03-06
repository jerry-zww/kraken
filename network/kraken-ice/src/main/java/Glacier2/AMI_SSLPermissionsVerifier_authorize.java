// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Glacier2;

// <auto-generated>
//
// Generated from file `PermissionsVerifier.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * Check whether a user has permission to access the router.
 * 
 **/

public abstract class AMI_SSLPermissionsVerifier_authorize extends Callback_SSLPermissionsVerifier_authorize
{
    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) True if access is granted, or false otherwise.
     * 
     * @param reason The reason why access was denied.
     * 
     **/
    public abstract void ice_response(boolean __ret, String reason);

    /**
     * ice_exception indicates to the caller that
     * the operation completed with an exception.
     * @param ex The Ice run-time exception to be raised.
     **/
    public abstract void ice_exception(Ice.LocalException ex);

    public final void response(boolean __ret, String reason)
    {
        ice_response(__ret, reason);
    }

    public final void exception(Ice.LocalException __ex)
    {
        ice_exception(__ex);
    }

    @Override public final void sent(boolean sentSynchronously)
    {
        if(!sentSynchronously && this instanceof Ice.AMISentCallback)
        {
            ((Ice.AMISentCallback)this).ice_sent();
        }
    }
}
