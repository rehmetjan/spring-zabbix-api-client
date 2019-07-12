package io.github.mlniang.zabbix.client.exception;

import io.github.mlniang.zabbix.client.response.ZabbixErrorDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mamadou Lamine NIANG
 **/
@Getter
@Setter
public class ZabbixApiException extends Exception {

    private ZabbixErrorDTO error;

    public ZabbixApiException(ZabbixErrorDTO error) {
        super(String.format("Error: %d\nMessage:%s\nData:%s'", error.getCode(), error.getMessage(), error.getData()));
        this.error = error;
    }

    public ZabbixApiException(String message) {
        super(message);
    }

    public ZabbixApiException(int httpCode) {
        super(String.format("Api call failed with code %d.", httpCode));
    }
}