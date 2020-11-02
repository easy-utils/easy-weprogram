package club.easyutils.weprogram.model.advertise.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AdvertiseAddTrace {

    /**
     * 目前仅支持click_id 落地页URL中的click_id，对于微信流量为URL中的gdt_vid，格式为『wx0ewinbalytptma00』或『wx0ewinbalytptma』
     */
    private String click_id;

}
