package club.easyutils.weprogram.service.analysis;

import club.easyutils.weprogram.model.analysis.request.AnalysisVisitPageRequest;
import club.easyutils.weprogram.model.analysis.response.AnalysisVisitPageResponse;
import org.springframework.stereotype.Service;

/**
 * 通用的分析接口
 * @author rainyblossom
 */
@Service
public interface CommonAnalysisService {

    /**
     * 访问页面。目前只提供按 page_visit_pv 排序的 top200。
     * @param request
     * @return
     */
    AnalysisVisitPageResponse getVisitPage(AnalysisVisitPageRequest request);
}
