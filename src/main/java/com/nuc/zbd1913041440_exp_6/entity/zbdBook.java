package com.nuc.zbd1913041440_exp_6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 朱博达
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class zbdBook {
    private Integer zbdBookId;
    private String zbdBookName;
    private Integer zbdBookPrice;
    private String zbdBookCoverPath;
    private Integer zbdBookTypeId;
    private zbdType zbdType;

    public zbdBook(Integer zbdBookId, String zbdBookName, Integer zbdBookPrice, String zbdBookCoverPath, Integer zbdBookTypeId) {
        this.zbdBookId = zbdBookId;
        this.zbdBookName = zbdBookName;
        this.zbdBookPrice = zbdBookPrice;
        this.zbdBookCoverPath = zbdBookCoverPath;
        this.zbdBookTypeId = zbdBookTypeId;
    }
}
