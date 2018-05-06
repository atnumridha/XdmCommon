package com.dmcsol.xdm.customization;

import oracle.mds.core.MetadataObject;
import oracle.mds.core.RestrictedSession;
import oracle.mds.cust.CacheHint;
import oracle.mds.cust.CustomizationClass;

public class OrgLayerCC extends CustomizationClass {
    @Override
    public CacheHint getCacheHint() {
        // TODO Implement this method
        return CacheHint.ALL_USERS;
    }

    @Override
    public String getName() {
        // TODO Implement this method
        return "site";
    }

    @Override
    public String[] getValue(RestrictedSession restrictedSession, MetadataObject metadataObject) {
        // TODO Implement this method
        return super.getValue(restrictedSession, metadataObject);
    }
}
