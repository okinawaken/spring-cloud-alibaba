package org.dromara.aimer.integration.bilibili.ticket;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import org.dromara.aimer.common.response.BaseResponse;
import org.dromara.aimer.integration.bilibili.ticket.request.ConfirmInfoRequest;
import org.dromara.aimer.integration.bilibili.ticket.request.CreateOrderV2Request;
import org.dromara.aimer.integration.bilibili.ticket.request.CreateStatusRequest;
import org.dromara.aimer.integration.bilibili.ticket.request.PrepareRequest;
import org.dromara.aimer.integration.bilibili.ticket.response.ConfirmInfoResponse;
import org.dromara.aimer.integration.bilibili.ticket.response.CreateOrderV2Response;
import org.dromara.aimer.integration.bilibili.ticket.response.CreateStatusResponse;
import org.dromara.aimer.integration.bilibili.ticket.response.PrepareResponse;
import org.dromara.aimer.integration.constants.ApiUrlConstant;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@RetrofitClient(baseUrl = ApiUrlConstant.SHOW_URL + "/api/ticket")
public interface TicketService {

    /**
     * 项目详情接口
     */
    @GET("/project/getV2")
    BaseResponse<Void> getV2(@Query(value = "project_id") Long projectId);

    /**
     * 下单第一步：预处理接口，生成token
     * 将下单的参数加密成token，如果是选座下单对座位进行锁定
     */
    @POST("/order/prepare")
    BaseResponse<PrepareResponse> prepare(@Body PrepareRequest prepareRequest);

    /**
     * 下单第二步：确认订单接口
     */
    @GET("/order/confirmInfo")
    BaseResponse<ConfirmInfoResponse> confirmInfo(ConfirmInfoRequest confirmInfoRequest);

    /**
     * 下单第三步：创建订单，生成token
     */
    @POST("/order/createV2")
    BaseResponse<CreateOrderV2Response> createOrderV2(@Body CreateOrderV2Request createOrderV2Request);

    /**
     * 下单第四步：查看订单状态（也会返回支付参数）
     * 前端轮询createStatus接口，直到拿到接口返回值为止
     */
    @GET("/order/createStatus")
    BaseResponse<CreateStatusResponse> createStatus(CreateStatusRequest createStatusRequest);

}
