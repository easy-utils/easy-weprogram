package club.easyutils.weprogram.model.analysis.response;

import club.easyutils.weprogram.model.BaseResponseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 访问页面。目前只提供按 page_visit_pv 排序的 top200。
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnalysisVisitPage extends BaseResponseModel {

    /**
     * 页面路径
     */
    private String page_path;

    /**
     * 访问次数
     */
    private Integer page_visit_pv;

    /**
     * 访问人数
     */
    private Integer page_visit_uv;

    /**
     * 次均停留时长
     */
    private Integer page_staytime_pv;

    /**
     * 进入页次数
     */
    private Integer entrypage_pv;

    /**
     * 退出页次数
     */
    private Integer exitpage_pv;

    /**
     * 转发次数
     */
    private Integer page_share_pv;

    /**
     * 转发人数
     */
    private Integer page_share_uv;
}
