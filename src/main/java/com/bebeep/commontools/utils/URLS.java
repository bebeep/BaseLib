package com.bebeep.commontools.utils;

/**
 * Created by Administrator on 2017/2/16.
 */
public class URLS {

    public static final String DESCRIPTOR = " ";

    //微信
    public static final String APPID_WX = "wx5b408a3436aea5ba";
    public static final String APPSECRET_WX = "3146ef523424a33469157f49d885b74a";

    //QQ
    public static final String APPID_QQ = "1106001886";
    public static final String APPKEY_QQ = "t70AyEwUgvenRqi4";


    //外网IP
//    public static final String HOST = "http://211.149.154.111:2121/zhb";

    //正式IP
    public static final String HOST = "http://kanwtao.com";

    //测试IP
    //    public static final String HOST = "http://192.168.0.108:8080/zhb";

    //刷新微信登陆的refresh token
    public static final String REFRESH_TOKEN = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid="
            + APPID_WX + "&grant_type=refresh_token&refresh_token=";

    /**
     * GET
     */
    //获取APP版本
    public static final String GET_APP_VERSION = HOST + "/app/appVersion/newVer?type=0";
    //类型
    public static final String TYPE = HOST + "/app/commoditytype/list";
    //首页广告
    public static final String HOST_ADS = HOST + "/app/gd/list";
    //商品列表
    public static final String GOODS_LIST = HOST + "/app/procut/list";
    //获取动态秘钥
    public static final String LOGIN_KEY = HOST + "/app/secret/key?pass=cdfmzia7708801314520@";
    //获取个人信息
    public static final String GET_USERINFO = HOST + "/app/verInter/M/info";
    //获取签到信息
    public static final String GET_IS_SIGN_UP = HOST + "/app/verInter/v/vSign";
    //获取签到规则
    public static final String GET_SIGN_UP_RULES = HOST + "/app/ruleDefinition/find";
    //获取签到日记
    public static final String GET_SIGN_RECORDE = HOST + "/app/verInter/v/signDiary";
    //签到
    public static final String GET_SIGN_UP = HOST + "/app/verInter/v/sign";
    //签到页面商品列表
    public static final String GET_SIGN_LIST = HOST + "/app/quanPrice/list";
    //积分明细
    public static final String GET_MONEY_RECORDE = HOST + "/app/verInter/re/list";
    //积分商城类型
    public static final String GET_JIFEN_TYPE = HOST + "/app/lCType/list";
    //积分商城列表
    public static final String GET_JIFEN_LIST = HOST + "/app/lp/list";
    //积分商品详情
    public static final String GET_JIFEN_DETAILS = HOST + "/app/lp/details/";
    //悬赏互助置顶列表
    public static final String GET_XUANSHANG_TOP = HOST + "/app/topTask/list";
    //悬赏互助列表
    public static final String GET_XUANSHANG_LIST = HOST + "/app/rewards/list";
    //悬赏互助详情-内容
    public static final String GET_XUANSHANG_DETAILS = HOST + "/app/rewards/find/";
    //悬赏互助详情-评论列表
    public static final String GET_XUANSHANG_EVALUTE_LIST = HOST + "/app/rewardsReviewTask/list";
    //获取收货地址
    public static final String GET_ADDRESS = HOST + "/app/verInter/receivingAddress/list";
    //设置默认收货地址
    public static final String GET_ADDRESS_DEFAULT = HOST + "/app/verInter/receivingAddress/settingDefault";
    //删除收货地址
    public static final String GET_ADDRESS_DELETE = HOST + "/app/verInter/receivingAddress/delete";
    //修改收货地址
    public static final String GET_ADDRESS_EDIT = HOST + "/app/verInter/receivingAddress/edit";
    //新增收货地址
    public static final String GET_ADDRESS_SAVE = HOST + "/app/verInter/receivingAddress/save";
    //我的订单列表
    public static final String GET_MY_ORDER = HOST + "/app/verInter/lntegralOrder/list";
    //我发布的悬赏
    public static final String GET_MY_XUANSHANG = HOST + "/app/verInter/rewards/mlist";
    //我参与的悬赏
    public static final String GET_JION_XUANSHANG = HOST + "/app/verInter/rewardsReviewTask/mlist";
    //获取充值记录
    public static final String GET_RECHARGE_RECORD = HOST + "/app/verInter/rechargeRecord/list";
    //获取默认地址
    public static final String GET_DEFAULT_ADDR = HOST + "/app/verInter/receivingAddress/fDefault";
    //获取订单详情
    public static final String GET_ORDER_DETAIL = HOST + "/app/verInter/lntegralOrder/find?";
    //获取订单详情
    public static final String GET_LOGOUT = HOST + "/app/verInter/logout";
    //获取未读消息条数
    public static final String GET_NEWS_UNREAD = HOST + "/app/verInter/sendMsg/ucount";
    //获取悬赏任务消息
    public static final String GET_NEWS_XUANSHANG = HOST + "/app/verInter/sendMsg/list?";
    //获取找回订单消息
    public static final String GET_NEWS_CHECKORDER = HOST + "/app/verInter/backmsg/list?";
    //验证手机号、支付宝、姓名是否绑定
    public static final String GET_USER_INFO = HOST + "/app/verInter/M/findAn";
    //邀请好友页面
    public static final String GET_INVITE_INFO = HOST + "/app/verInter/invitation/info";
    //邀请好友记录
    public static final String GET_INVITE_RECORD = HOST + "/app/verInter/lnvitationFriendsRecord/list";

    /***转盘部分***/
    //GET
    //获取最新的倒计时信息
    public static final String GET_LATELY_INFO = HOST + "/app/numberPeriods/newGet";
    //获取中奖结果
    public static final String GET_ZHUANPAN_RESULT = HOST + "/app/numberPeriods/winningResult?";
    //获取历史中奖
    public static final String GET_HISTORY_LIST = HOST + "/app/previouswinning/list";
    //获取投注状态
    public static final String GET_BET_STATUS = HOST + "/app/ro/bList";
    //获取近期开奖结果
    public static final String GET_BET_RESULT_NEARLY = HOST + "/app/recentLottery/list";


    //POST
    //下注
    public static final String POST_BET = HOST + "/app/verInter/roleqs/bet";
    //绑定手机号接口地址  第一步 (发送验证码)
    public static final String POST_SEND_CODE = HOST + "/app/verInter/bindMobile/sendSms";
    //绑定手机号接口地址  第二步 (绑定手机号)
    public static final String POST_BIND_PHONE = HOST + "/app/verInter/bindMobile/verifyCode";
    //绑定支付宝账号
    public static final String POST_BIND_ZFB = HOST + "/app/verInter/M/bindAlipay";
    //绑定姓名
    public static final String POST_BIND_NAME = HOST + "/app/verInter/M/bindRealName";

    /***转盘部分***/
    //获取消息类别
    public static final String GET_NEWS_TYPE = HOST + "";
    //获取消息列表
    public static final String GET_NEWS_LIST = HOST + "";


    /**
     * 转盘玩法
     **/
    //获取个人信息
    public static final String GET_GAME_INFO = HOST + "/app/verInter/M/getMjf";

    /**
     * POST
     */
    //微信登陆
    public static final String LOGIN_WEIXIN = HOST + "/app/autho/login";

    //自动登陆
    public static final String LOGIN_AUTO = HOST + "/app/autho/automaticLogin";

    //发布悬赏任务
    public static final String POST_XUANSHANG_UPLOAD = HOST + "/app/verInter/rewards/releaseTask";

    //悬赏互助详情-评论列表(发布者操作)
    public static final String GET_XUANSHANG_EVALUTE_OPRATION = HOST + "/app/verInter/rewardsReviewTask/operation";

    //悬赏互助详情-提交评论
    public static final String GET_XUANSHANG_EVALUTE = HOST + "/app/verInter/rewardsReviewTask/task";

    //上传文件
    public static final String POST_UPLOAD_FILES = HOST + "/app/verInter/up/file";

    //删除我的订单列表
    public static final String POST_MY_ORDER_DELEETE = HOST + "/app/verInter/lntegralOrder/delete";

    //删除发布的悬赏
    public static final String POST_MY_XUANSHANG_DELEETE = HOST + "/app/verInter/rewards/delete";

    //提前结束悬赏记录
    public static final String POST_MY_XUANSHANG_END = HOST + "/app/verInter/rewards/end";

    //删除我参与的悬赏
    public static final String POST_JION_XUANSHANG_DELETE = HOST + "/app/verInter/rewardsReviewTask/delete";

    //删除充值记录
    public static final String POST_RECHARGE_RECORD_DELETE = HOST + "/app/verInter/rechargeRecord/delete";

    //获取支付签名
    public static final String POST_PAY_SIGN = HOST + "/app/verInter/order/sign";

    //找回订单
    public static final String POST_CHECK_ORDER = HOST + "/app/verInter/retrieveOrder/save";

    //删除积分记录
    public static final String POST_DELETE_JFIEN_RECORDE = HOST + "/app/verInter/re/delete";

    //积分兑换商品（不需要加钱）
    public static final String POST_EXCHANGE_ITEM = HOST + "/app/verInter/procut/exchange";

    //积分兑换商品（需要加钱）
    public static final String POST_EXCHANGE_ITEM_PAY = HOST + "/app/verInter/lntPriceorder/procutSign";

    //删除悬赏消息
    public static final String POST_DELETE_XS = HOST + "/app/verInter/sendMsg/delete";

    //标记悬赏消息为已读
    public static final String POST_READ_XS = HOST + "/app/verInter/sendMsg/editRead";

    //标记找回订单消息为已读
    public static final String POST_READ_FL = HOST + "/app/verInter/backmsg/editRead";

    //删除返利消息
    public static final String POST_DELETE_FL = HOST + "/app/verInter/backmsg/delete";

    //提交意见反馈
    public static final String POST_COMMENT = HOST + "/app/verInter/feedBack/insert";

    //举报悬赏任务
    public static final String POST_REPORT = HOST + "/app/verInter/reportRewardt/insert";

    //追加任务
    public static final String POST_XS_ADD = HOST + "/app/verInter/rewards/additionalTask";

    //绑定邀请人ID
    public static final String POST_BIND_INVITE_ID = HOST + "/app/verInter/M/fillinvitationCode";
}
