package com.example.demo1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*1.定义数据类型yml文件中对应的数据
 2.定义为spring管控的bean
 3.指定加载的数据
*/
@Component
@ConfigurationProperties(prefix = "datasource")
public class MyDataSourse {
    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "myDataSourse{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
