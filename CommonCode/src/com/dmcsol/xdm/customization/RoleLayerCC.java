package com.dmcsol.xdm.customization;

import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.mds.core.MetadataObject;
import oracle.mds.core.RestrictedSession;
import oracle.mds.cust.CacheHint;
import oracle.mds.cust.CustomizationClass;

public class RoleLayerCC extends CustomizationClass {
    @Override
    public CacheHint getCacheHint() {
        // TODO Implement this method
        return CacheHint.MULTI_USER;
    }

    @Override
    public String getName() {
        // TODO Implement this method
        return "role";
    }

    public String[] getValue(RestrictedSession restrictedSession, MetadataObject metadataObject) {
        String[] roleValue = new String[1];
        SecurityContext sec = ADFContext.getCurrent().getSecurityContext();
        if (sec.isUserInRole("superuser")) {
            roleValue[0] = "superuser";
        } else {
            roleValue[0] = "normal";
        }
        return roleValue;
    }
}
