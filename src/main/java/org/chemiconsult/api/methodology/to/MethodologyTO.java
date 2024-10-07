package org.chemiconsult.api.methodology.to;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MethodologyTO {

    private int id;

    private String type;

}
