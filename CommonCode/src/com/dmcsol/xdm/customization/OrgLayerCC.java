package com.dmcsol.xdm.customization;

import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.mds.core.MetadataObject;
import oracle.mds.core.RestrictedSession;
import oracle.mds.cust.CacheHint;
import oracle.mds.cust.CustomizationClass;

public class OrgLayerCC extends CustomizationClass {

    private static final String DEFAULT_LAYER_NAME = "qrstravel";
    private String mLayerName = DEFAULT_LAYER_NAME;
    private String mLayerValue = null;

    @Override
    public CacheHint getCacheHint() {
        // TODO Implement this method
        return CacheHint.USER;
    }

    @Override
    public String getName() {
        // TODO Implement this method
        return mLayerName;
    }


    @Override
    public String[] getValue(RestrictedSession restrictedSession, MetadataObject metadataObject) {
        // TODO Implement this method
        return new String[] { getMLayerValue() };
    }

    public String getMLayerValue() {
        mLayerValue = ADFContext.getCurrent()
                                .getSecurityContext()
                                .getUserPrincipal()
                                .getName();

        return mLayerValue;
    }
}
