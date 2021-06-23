package com.nssp.sitcom.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;


@KeySpace("sitcom")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Sitcom {
    @Id
    private Long id;
    private String name;
    private String genre;
}
