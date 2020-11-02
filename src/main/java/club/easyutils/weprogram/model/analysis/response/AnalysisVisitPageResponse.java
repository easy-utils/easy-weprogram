package club.easyutils.weprogram.model.analysis.response;

import club.easyutils.weprogram.model.BaseRequestModel;
import club.easyutils.weprogram.model.BaseResponseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 访问页面。目前只提供按 page_visit_pv 排序的 top200。
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnalysisVisitPageResponse extends BaseResponseModel {

    /**
     * 日期
     */
    private String ref_date;

    /**
     * 数据列
     */
    private List<AnalysisVisitPage> list;
}
