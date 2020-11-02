package club.easyutils.weprogram.model.analysis.request;

import club.easyutils.weprogram.model.BaseRequestModel;
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
public class AnalysisVisitPageRequest extends BaseRequestModel {

    /**
     * 开始日期。格式为 yyyymmdd
     */
    private String begin_date;

    /**
     * 结束日期，限定查询1天数据，允许设置的最大值为昨日。格式为 yyyymmdd
     */
    private String end_date;
}
