package club.easyutils.weprogram.service.analysis;

import club.easyutils.weprogram.config.AnalysisConfig;
import club.easyutils.weprogram.model.analysis.request.AnalysisVisitPageRequest;
import club.easyutils.weprogram.model.analysis.response.AnalysisVisitPageResponse;
import club.easyutils.weprogram.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 * 通用的分析接口
 * @author rainyblossom
 */
@Service
public class CommonAnalysisServiceImpl implements CommonAnalysisService {


    @Override
    public AnalysisVisitPageResponse getVisitPage(AnalysisVisitPageRequest request) {
        return (AnalysisVisitPageResponse) HttpUtil.doPost(AnalysisConfig.ANALYSIS_PAGE_VISIT.getUrl(), request, AnalysisVisitPageResponse.class).getBody();
    }
}
