package net.tt.dynamicloader.pluginbean;

/**
 * Created by admin on 2017/8/23.
 */

public class PluginBean {
    private String appName;
    private String packageName;
    public PluginBean(String appName,String packageName){
        this.appName = appName;
        this.packageName = packageName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
