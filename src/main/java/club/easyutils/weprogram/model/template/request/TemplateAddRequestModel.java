package club.easyutils.weprogram.model.template.request;

import club.easyutils.weprogram.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateAddRequestModel extends BaseRequestModel {

    /**
     * 模板标题 id，可通过接口获取，也可登录小程序后台查看获取
     */
    @NonNull
    private String tid;

    /**
     * 开发者自行组合好的模板关键词列表，关键词顺序可以自由搭配（例如 [3,5,4] 或 [4,5,3]），最多支持5个，最少2个关键词组合
     */
    @NonNull
    private List<Integer> kidList;

    /**
     * 服务场景描述，15个字以内
     */
    private String sceneDesc;


}
