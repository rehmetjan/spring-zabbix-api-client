package io.github.mlniang.zabbix.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an Zabbix authentication DTO.
 *
 * @author Mamadou Lamine NIANG
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZabbixAuthDTO {

    private String user;
    private String password;
}