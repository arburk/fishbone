package org.arburk.fishbone.model;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Fish {

    public enum Language {
        DE,
        EN,
        IT,
        FR
    }

    private long id;
    private Map<Language, String> names;
    private String description;

}
