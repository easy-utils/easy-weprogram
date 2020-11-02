package club.easyutils.weprogram.model.advertise.request;

import club.easyutils.weprogram.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvertiseAddRequestModel extends BaseRequestModel {

    /**
     * 用于标识数据归属权
     */
    private String user_action_set_id;

    private List<AdvertiseAddActions> actions;


}
