package com.nuc.zbd1913041440_exp_6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 朱博达
 */
@Data
@AllArgsConstructor
public class zbdUser {
    private Integer zbdid;
    private String zbduserName;
    private String zbdpassword;
    private Integer zbdstatus;

    public zbdUser(String zbduserName, String zbdpassword, Integer zbdstatus) {
        this.zbduserName = zbduserName;
        this.zbdpassword = zbdpassword;
        this.zbdstatus = zbdstatus;
    }
}
