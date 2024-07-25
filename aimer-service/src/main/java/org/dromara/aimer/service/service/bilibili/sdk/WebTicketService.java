package org.dromara.aimer.service.service.bilibili.sdk;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.service.service.bilibili.constants.ApiUrlConstant;
import org.dromara.aimer.service.service.bilibili.request.ConfirmInfoRequest;
import org.dromara.aimer.service.service.bilibili.request.CreateOrderV2Request;
import org.dromara.aimer.service.service.bilibili.request.CreateStatusRequest;
import org.dromara.aimer.service.service.bilibili.request.PrepareRequest;
import org.dromara.aimer.service.service.bilibili.response.ConfirmInfoResult;
import org.dromara.aimer.service.service.bilibili.response.CreateOrderV2Result;
import org.dromara.aimer.service.service.bilibili.response.CreateStatusResult;
import org.dromara.aimer.service.service.bilibili.response.PrepareResult;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * web票务服务
 */
@RetrofitClient(baseUrl = ApiUrlConstant.SHOW_URL)
public interface WebTicketService {

    /**
     * 项目详情接口
     */
    @GET("api/ticket/project/getV2")
    BaseResponse<Void> getV2(@Query(value = "project_id") Long projectId);

    /**
     * 下单第一步：预处理接口，生成token
     * 将下单的参数加密成token，如果是选座下单对座位进行锁定
     */
    @POST("api/ticket/order/prepare")
    BaseResponse<PrepareResult> prepare(@Body PrepareRequest prepareRequest);

    /**
     * 下单第二步：确认订单接口
     */
    @GET("api/ticket/order/confirmInfo")
    BaseResponse<ConfirmInfoResult> confirmInfo(ConfirmInfoRequest confirmInfoRequest);

    /**
     * 下单第三步：创建订单，生成token
     */
    @POST("api/ticket/order/createV2")
    BaseResponse<CreateOrderV2Result> createOrderV2(@Body CreateOrderV2Request createOrderV2Request);

    /**
     * 下单第四步：查看订单状态（也会返回支付参数）
     * 前端轮询createStatus接口，直到拿到接口返回值为止
     */
    @GET("api/ticket/order/createStatus")
    BaseResponse<CreateStatusResult> createStatus(CreateStatusRequest createStatusRequest);

}
