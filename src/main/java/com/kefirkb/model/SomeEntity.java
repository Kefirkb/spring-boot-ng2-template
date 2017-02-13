package com.kefirkb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kefirkb on 30.01.2017.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SomeEntity {
    private Integer id;
    private String name;
    private String code;
    private Double percents;
    private Integer count;
    private Integer order;
    private Integer priority;
}
