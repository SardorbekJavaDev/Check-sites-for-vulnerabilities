package com.company.entitiy;

public class TaskBody {
    private  Boolean InjectionFlaws;
    private String messageInjectionFlaws;
    private  Boolean BrokenAuthentication ;
    private String messageBrokenAuthentication;
    private  Boolean CrossSiteScripting;
    private String messageCrossSiteScripting;
    private  Boolean InsecureDirectObjectReferences;
    private String messageInsecureDirectObjectReferences;
    private  Boolean SecurityMisconfiguration;
    private String messageSecurityMisconfiguration;
    private  Boolean SensitiveDataExposure;
    private String messageSensitiveDataExposure;
    private  Boolean MissingFunctionLevelControl;
    private String messageMissingFunctionLevelControl;

    public TaskBody(Boolean injectionFlaws, String messageInjectionFlaws, Boolean brokenAuthentication, String messageBrokenAuthentication, Boolean crossSiteScripting, String messageCrossSiteScripting, Boolean insecureDirectObjectReferences, String messageInsecureDirectObjectReferences, Boolean securityMisconfiguration, String messageSecurityMisconfiguration, Boolean sensitiveDataExposure, String messageSensitiveDataExposure, Boolean missingFunctionLevelControl, String messageMissingFunctionLevelControl) {
        InjectionFlaws = injectionFlaws;
        this.messageInjectionFlaws = messageInjectionFlaws;
        BrokenAuthentication = brokenAuthentication;
        this.messageBrokenAuthentication = messageBrokenAuthentication;
        CrossSiteScripting = crossSiteScripting;
        this.messageCrossSiteScripting = messageCrossSiteScripting;
        InsecureDirectObjectReferences = insecureDirectObjectReferences;
        this.messageInsecureDirectObjectReferences = messageInsecureDirectObjectReferences;
        SecurityMisconfiguration = securityMisconfiguration;
        this.messageSecurityMisconfiguration = messageSecurityMisconfiguration;
        SensitiveDataExposure = sensitiveDataExposure;
        this.messageSensitiveDataExposure = messageSensitiveDataExposure;
        MissingFunctionLevelControl = missingFunctionLevelControl;
        this.messageMissingFunctionLevelControl = messageMissingFunctionLevelControl;
    }

    public Boolean getInjectionFlaws() {
        return InjectionFlaws;
    }

    public void setInjectionFlaws(Boolean injectionFlaws) {
        InjectionFlaws = injectionFlaws;
    }

    public String getMessageInjectionFlaws() {
        return messageInjectionFlaws;
    }

    public void setMessageInjectionFlaws(String messageInjectionFlaws) {
        this.messageInjectionFlaws = messageInjectionFlaws;
    }

    public Boolean getBrokenAuthentication() {
        return BrokenAuthentication;
    }

    public void setBrokenAuthentication(Boolean brokenAuthentication) {
        BrokenAuthentication = brokenAuthentication;
    }

    public String getMessageBrokenAuthentication() {
        return messageBrokenAuthentication;
    }

    public void setMessageBrokenAuthentication(String messageBrokenAuthentication) {
        this.messageBrokenAuthentication = messageBrokenAuthentication;
    }

    public Boolean getCrossSiteScripting() {
        return CrossSiteScripting;
    }

    public void setCrossSiteScripting(Boolean crossSiteScripting) {
        CrossSiteScripting = crossSiteScripting;
    }

    public String getMessageCrossSiteScripting() {
        return messageCrossSiteScripting;
    }

    public void setMessageCrossSiteScripting(String messageCrossSiteScripting) {
        this.messageCrossSiteScripting = messageCrossSiteScripting;
    }

    public Boolean getInsecureDirectObjectReferences() {
        return InsecureDirectObjectReferences;
    }

    public void setInsecureDirectObjectReferences(Boolean insecureDirectObjectReferences) {
        InsecureDirectObjectReferences = insecureDirectObjectReferences;
    }

    public String getMessageInsecureDirectObjectReferences() {
        return messageInsecureDirectObjectReferences;
    }

    public void setMessageInsecureDirectObjectReferences(String messageInsecureDirectObjectReferences) {
        this.messageInsecureDirectObjectReferences = messageInsecureDirectObjectReferences;
    }

    public Boolean getSecurityMisconfiguration() {
        return SecurityMisconfiguration;
    }

    public void setSecurityMisconfiguration(Boolean securityMisconfiguration) {
        SecurityMisconfiguration = securityMisconfiguration;
    }

    public String getMessageSecurityMisconfiguration() {
        return messageSecurityMisconfiguration;
    }

    public void setMessageSecurityMisconfiguration(String messageSecurityMisconfiguration) {
        this.messageSecurityMisconfiguration = messageSecurityMisconfiguration;
    }

    public Boolean getSensitiveDataExposure() {
        return SensitiveDataExposure;
    }

    public void setSensitiveDataExposure(Boolean sensitiveDataExposure) {
        SensitiveDataExposure = sensitiveDataExposure;
    }

    public String getMessageSensitiveDataExposure() {
        return messageSensitiveDataExposure;
    }

    public void setMessageSensitiveDataExposure(String messageSensitiveDataExposure) {
        this.messageSensitiveDataExposure = messageSensitiveDataExposure;
    }

    public Boolean getMissingFunctionLevelControl() {
        return MissingFunctionLevelControl;
    }

    public void setMissingFunctionLevelControl(Boolean missingFunctionLevelControl) {
        MissingFunctionLevelControl = missingFunctionLevelControl;
    }

    public String getMessageMissingFunctionLevelControl() {
        return messageMissingFunctionLevelControl;
    }

    public void setMessageMissingFunctionLevelControl(String messageMissingFunctionLevelControl) {
        this.messageMissingFunctionLevelControl = messageMissingFunctionLevelControl;
    }

    @Override
    public String toString() {
        return "TaskBody{" +
                "InjectionFlaws=" + InjectionFlaws +
                ", messageInjectionFlaws='" + messageInjectionFlaws + '\'' +
                ", BrokenAuthentication=" + BrokenAuthentication +
                ", messageBrokenAuthentication='" + messageBrokenAuthentication + '\'' +
                ", CrossSiteScripting=" + CrossSiteScripting +
                ", messageCrossSiteScripting='" + messageCrossSiteScripting + '\'' +
                ", InsecureDirectObjectReferences=" + InsecureDirectObjectReferences +
                ", messageInsecureDirectObjectReferences='" + messageInsecureDirectObjectReferences + '\'' +
                ", SecurityMisconfiguration=" + SecurityMisconfiguration +
                ", messageSecurityMisconfiguration='" + messageSecurityMisconfiguration + '\'' +
                ", SensitiveDataExposure=" + SensitiveDataExposure +
                ", messageSensitiveDataExposure='" + messageSensitiveDataExposure + '\'' +
                ", MissingFunctionLevelControl=" + MissingFunctionLevelControl +
                ", messageMissingFunctionLevelControl='" + messageMissingFunctionLevelControl + '\'' +
                '}';
    }
}
