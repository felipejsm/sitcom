package com.nssp.sitcom.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Sitcom {
    private String id;
    private String name;
    private String genre;
}
