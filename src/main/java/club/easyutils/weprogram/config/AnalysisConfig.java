package club.easyutils.weprogram.config;

import club.easyutils.weprogram.util.ConfigUtil;
import lombok.AllArgsConstructor;

/**
 * 数据分析
 *
 * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-retain/analysis.getDailyRetain.html
 * @author rainyblossom
 */
@AllArgsConstructor
public enum AnalysisConfig {

    /**
     * 获取用户访问小程序日留存
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-retain/analysis.getDailyRetain.html
     */
    ANALYSIS_RETAIN_DAILY("https://api.weixin.qq.com/datacube/getweanalysisappiddailyretaininfo?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户访问小程序月留存
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-retain/analysis.getMonthlyRetain.html
     */
    ANALYSIS_RETAIN_MONTHLY("https://api.weixin.qq.com/datacube/getweanalysisappidmonthlyretaininfo?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户访问小程序周留存
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-retain/analysis.getWeeklyRetain.html
     */
    ANALYSIS_RETAIN_WEEKLY("https://api.weixin.qq.com/datacube/getweanalysisappidweeklyretaininfo?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户访问小程序数据概况
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/analysis.getDailySummary.html
     */
    ANALYSIS_SUMMARY_DAILY("https://api.weixin.qq.com/datacube/getweanalysisappiddailysummarytrend?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户访问小程序数据日趋势
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-trend/analysis.getDailyVisitTrend.html
     */
    ANALYSIS_TREND_DAILY("https://api.weixin.qq.com/datacube/getweanalysisappiddailyvisittrend?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户访问小程序数据月趋势(能查询到的最新数据为上一个自然月的数据)
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-trend/analysis.getMonthlyVisitTrend.html
     */
    ANALYSIS_TREND_MONTHLY("https://api.weixin.qq.com/datacube/getweanalysisappidmonthlyvisittrend?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户访问小程序数据周趋势
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/visit-trend/analysis.getWeeklyVisitTrend.html
     */
    ANALYSIS_TREND_WEEKLY("https://api.weixin.qq.com/datacube/getweanalysisappidweeklyvisittrend?access_token=ACCESS_TOKEN"),

    /**
     * 获取小程序新增或活跃用户的画像分布数据。时间范围支持昨天、最近7天、最近30天。
     * 其中，新增用户数为时间范围内首次访问小程序的去重用户数，活跃用户数为时间范围内访问过小程序的去重用户数。
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/analysis.getUserPortrait.html
     */
    ANALYSIS_PORTRAIT_USER("https://api.weixin.qq.com/datacube/getweanalysisappiduserportrait?access_token=ACCESS_TOKEN"),

    /**
     * 获取用户小程序访问分布数据
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/analysis.getVisitDistribution.html
     */
    ANALYSIS_DISTRIBUTION_MONTHLY("https://api.weixin.qq.com/datacube/getweanalysisappidvisitdistribution?access_token=ACCESS_TOKEN"),

    /**
     * 访问页面。目前只提供按 page_visit_pv 排序的 top200。
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/data-analysis/analysis.getVisitPage.html
     */
    ANALYSIS_PAGE_VISIT("https://api.weixin.qq.com/datacube/getweanalysisappidvisitpage?access_token=ACCESS_TOKEN");



    private String url;

    public String getUrl() {
        return ConfigUtil.converter(url);
    }

}
